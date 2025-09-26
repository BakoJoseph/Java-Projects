module org.example.calculatorapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.scripting;
    requires javaluator;


    opens org.example.calculatorapp to javafx.fxml;
    exports org.example.calculatorapp;
}