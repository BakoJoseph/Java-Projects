package org.example.tictactoe;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HelloController {
    @FXML
   private Button zero;
    @FXML
    private Button one;
    @FXML
    private Button two;

    @FXML
    private Button three;

    @FXML
    private Button four;

    @FXML
    private Button five;

    @FXML
    private Button six;

    @FXML
    private Button seven;

    @FXML
    private Button eight;

    private String player = "x";

    int[][] combos = {
            {0,1,2},
            {3,4,5},
            {6,7,8},
            {0,3,6},
            {1,4,7},
            {2,5,8},
            {0,4,8},
            {2,4,6}
    };

    List<Button> list  = new ArrayList<>();

    @FXML
    protected void play(ActionEvent event) {
        Button clickedButton = (Button)event.getSource();
        resetPlayer(clickedButton);
        addButtonsToList();
        checkWinner(event);
    }
    private void resetPlayer(Button button){
        if(!button.getText().isEmpty()){
            return;
        }
        button.setText(player);
        if(player.equals("x")){
            player = "o";
        }
        else {
            player = "x";
        }
    }

    public void addButtonsToList(){
        list.add(zero);
        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);
        list.add(five);
        list.add(six);
        list.add(seven);
        list.add(eight);
    }

    public void  checkWinner(ActionEvent event) {
        for (int[] combo : combos){
            Button a = list.get(combo[0]);
            Button b = list.get(combo[1]);
            Button c = list.get(combo[2]);

            if(!a.getText().isEmpty() && a.getText().equals(b.getText()) && a.getText().equals(c.getText())){
                System.out.println(a.getText() + " wins!");
                FXMLLoader loader = new FXMLLoader(getClass().getResource("winner.fxml"));
                Scene root = null;
                try {
                    root = loader.load();
                    Winner winnerController = loader.getController();
                    winnerController.setWinnerText("Congratulations! "+ a.getText() +" Won! 🎉");

                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                stage.setScene(root);
                stage.show();
                return;
            }
        }
    }

    @FXML
    public void reset(){
        for (Button button : list){
            button.setText("");
        }
    }
}