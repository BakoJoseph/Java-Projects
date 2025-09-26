package org.example.calculatorapp;
import javafx.animation.FadeTransition;
import javafx.animation.ScaleTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.util.Duration;
import java.util.regex.Pattern;

public class CalculatorController {
    private double memory = 0.0;
    private double currentNumber;
    private String operator = "";
    private boolean startNewNumber = true;

    //      •	memory – Stores a value for memory recall.
//    •	currentNumber – Stores the first number in an operation.
//•	operator – Stores the selected mathematical operator.
// •	startNewNumber – Used to determine if a new number should be entered
    //....method implementations....
    @FXML
    private TextField display;
    //•	display – The text field that shows the current input and results.

    //•	This method is triggered when the “=” button is clicked.
//	•	It first checks if the user has entered a trigonometric function (sin, cos, or tan).
//      •	The number is converted to radians,
//      and the corresponding function is calculated using Math.sin(), Math.cos(), or Math.tan().
    @FXML
    private void onEqualClick() {
        String text = display.getText().trim();
        try{
            if (text.startsWith("tan ") || text.startsWith("sin ") || text.startsWith("cos ")){
                // Process trigonometric functions
                String function = text.substring(0, 3);
                String numberPart = text.substring(4).trim();
                if (numberPart.isEmpty()){
                    display.setText("Error");
                    return;
                }
                double num = Math.toRadians(Double.parseDouble(numberPart));
                double result = 0;

                switch (function){
                    case "sin":
                        result = Math.sin(num);
                        break;
                    case "cos":
                        result = Math.cos(num);
                        break;
                    case "tan":
                        result = Math.tan(num);
                        break;
                }

                display.setText(String.valueOf(result));
                memory = result;
                return;
            }
            //•	This method is triggered when the “=” button is clicked.
	        //•	It first checks if the user has entered a trigonometric function (sin, cos, or tan).
	        //•	The number is converted to radians, and the corresponding function is calculated using
            // Math.sin(), Math.cos(), or Math.tan().

            //Process Arithmetic function
            String[] parts = text.split(Pattern.quote(operator));
            if (parts.length < 2 || parts[1].trim().isEmpty()){
                display.setText("Error: Missing second number");
                return;
            }
            double firstNumber = Double.parseDouble(parts[0].trim());
            double secondNumber = Double.parseDouble(parts[1].trim());

            double result;
            if (operator.equals("mod")){
                result = firstNumber % secondNumber;
            }
            else{
                result = calculate(firstNumber, secondNumber, operator);
            }
            display.setText(String.valueOf(result));
            memory = result;
            operator = "";
        } catch (RuntimeException e) {
            display.setText("Error");
            System.out.println("Error: " + e.getMessage());
        }
        //•	The input is split into two numbers using the stored operator.
//	•	If mod is used, the remainder is calculated using %.
//	•	Otherwise, the calculate() method is called to perform the selected operation.

        if (operator.isEmpty()) return;
        String[] parts = display.getText().split(" " + Pattern.quote(operator));
        if (parts.length < 2 || parts[1].trim().isEmpty()) {
            display.setText("Error: Missing second number ");
            return;
        }
        try {
            double secondNumber = Double.parseDouble(parts[1].trim());
            double result = calculate(currentNumber, secondNumber, operator);

            display.setText(String.valueOf(result));
            memory = result;
            operator = "";
            startNewNumber = true;
        } catch (Exception e) {
            display.setText("Error: Invalid Input");
            System.out.println("Error: " + e.getMessage());
        }
    }

    //•	This method performs basic arithmetic calculations.
//	•	It ensures that division by zero does not cause an error by returning Double.NaN (Not a Number).
    private double calculate(double firstNumber, double secondNumber, String operator) {
        //this is the method to perform the arithmetic operations
        switch (operator) {
            case "+"  : return firstNumber + secondNumber;
            case "-"  : return firstNumber - secondNumber;
            case "x" : return firstNumber * secondNumber;
            case "/" : return (secondNumber != 0) ? firstNumber / secondNumber : Double.NaN;
            case "%" : return (secondNumber != 0) ? firstNumber % secondNumber : Double.NaN;
            default: return secondNumber;
        }
    }
    //•	Resets the calculator to its initial state.
    @FXML
    private void onClearClick() {
        display.setText("");
        currentNumber = 0.0;
        operator = "";
        startNewNumber = true;
    }
    //these are the memory operations
    //•	onMemoryRecall() – Displays the stored memory value.
    @FXML
    private void onMemoryRecall() {
        display.setText(String.valueOf(memory));
        startNewNumber = true;
    }
    //	•	onMemorySave() – Saves the current display value to memory.
    @FXML
    private void onMemorySave() {
        try{
            String currentText = display.getText().trim();
            if(!currentText.isEmpty()){
                memory = Double.parseDouble(currentText);
            }
        } catch (NumberFormatException e) {
            display.setText("Error");
        }
    }
    @FXML
    private void SquareRoot(){
        try {
            double num = Double.parseDouble(display.getText());
            display.setText(String.valueOf(Math.sqrt(num)));
        } catch (NumberFormatException e) {
            display.setText("Error");
        }
    }
    //•	Toggles between positive and negative numbers.
    @FXML
    private void onPlusMinusToggle(){
        try{
            double number = Double.parseDouble(display.getText());
            display.setText(String.valueOf(-number));
        } catch (NumberFormatException e) {
            display.setText("Error");
        }
    }
    //•	Inserts the value of π (Pi) into the display.
    @FXML
    private void onPi(){
       display.setText(String.format("%.3f",Math.PI));
    }

    //•	Deletes the last character from the display.
    @FXML
    private void backspace() {
        String text = display.getText();
        if (!text.isEmpty()) {
            display.setText(text.substring(0, text.length() - 1));
        }
    }
    //•	Calculates the square of the displayed number.
    @FXML
    private void square() {
        try {
            double number = Double.parseDouble(display.getText());
            display.setText(String.valueOf(number * number));
        } catch (NumberFormatException e) {
            display.setText("Error");
        }
    }

    //•	Converts a number to its percentage equivalent.
    @FXML
    private void percentage() {
        try {
            double number = Double.parseDouble(display.getText());
            display.setText(String.valueOf(number / 100));
        } catch (NumberFormatException e) {
            display.setText("Error");
        }
    }
    @FXML
    private void sin() {
        display.setText("sin ");
    }
    @FXML
    private void cos() {
        display.setText("cos ");
    }
    @FXML
    private void tan() {
        display.setText("tan ");
    }
    private void animateButton(Button button) {
        //... Scale effect (button grows and shrinks)
        ScaleTransition st = new ScaleTransition(Duration.millis(50), button);
        st.setFromX(1.0);
        st.setFromY(1.0);
        st.setToX(1.15);
        st.setToY(1.15);
        st.setCycleCount(2);
        st.setAutoReverse(true);
        //... Fade effect (button fades out and back in)
        FadeTransition ft = new FadeTransition(Duration.millis(100), button);
        ft.setFromValue(1.0);  //...Normal visibility
        ft.setToValue(1.0); //...Fades to 50% transparent
        ft.setCycleCount(2);
        ft.setAutoReverse(true);
        //...Play both animations together
        ft.play();
        st.play();
    }
    //•	Appends the clicked number to the display.
    @FXML
    public void onNumberClick(ActionEvent event) {
        Button button = (Button) event.getSource();
        animateButton(button);
        String number = button.getText();
        if (operator.isEmpty()) {
            display.setText(display.getText() + number);
        } else {
            String currentText = display.getText();
            if (currentText.endsWith(" " + operator + " ")) {
                display.setText(currentText + number);
            } else {
                display.setText(display.getText() + number);
            }
        }
    }
    //•	Handles operator button clicks.
//	•	If an operator is already selected, it calculates the previous expression before
//	applying the new operator.
    @FXML
    public void onOperatorClick(ActionEvent event) {
        Button button = (Button) event.getSource();
        animateButton(button);
        String buttonText = button.getText();
        if (!operator.isEmpty()){
            String[] parts = display.getText().split(Pattern.quote(operator));
            onEqualClick();
        }
        operator = buttonText;
        try{
            currentNumber  = Double.parseDouble(display.getText());
        } catch (NumberFormatException e) {
            display.setText("Error: Missing second number ");
        }
        display.setText(display.getText() + " " + operator + " ");
        startNewNumber = true;
    }
}
//Presentation of JavaFX Calculator Code
//       Introduction
//This JavaFX-based calculator app is designed to handle basic arithmetic operations,
// trigonometric functions, and memory recall/save functionality.
// The app uses an FXML-based UI with a CalculatorController class managing user interactions.
// Calculator Code
// Introduction
// This JavaFX-based calculator app is designed to handle basic arithmetic operations,
// trigonometric functions, and memory recall/save functionality. T
// The app uses an FXML-based UI with a CalculatorController class managing user interactions.
// package org.example.calculatorApp; – This defines the package in which the class belongs.
// •	JavaFX imports are used to handle UI elements like Button, TextField, and event handling.
// •	java.util.regex.Pattern; – Used for splitting text based on operators.

                        //Conclusion
//This JavaFX calculator application allows users to perform various mathematical operations,
// including basic arithmetic, trigonometric calculations, and memory functions.
// The use of JavaFX FXML enhances UI separation from logic, making it efficient and modular