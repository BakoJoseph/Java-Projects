package org.example.calculatorapp;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class CalculatorApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException{
        FXMLLoader fxmlLoader  = new FXMLLoader(CalculatorApplication.class.getResource("Calculator.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Simple Calculator");
        stage.setScene(scene);
        stage.initStyle(StageStyle.TRANSPARENT);
        scene.setFill(Color.TRANSPARENT);
        stage.show();
    }
    public static void main(String[] args) { launch(); }
}