package org.example.tictactoe;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class Winner {
    @FXML
    private Label winnerLabel;

    public void setWinnerText(String text) {
        winnerLabel.setText(text);
    }

    @FXML
    protected void gotoFirstScreen(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
        Scene root = null;
        try {
            root = loader.load();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(root);
        stage.show();
    }

}
