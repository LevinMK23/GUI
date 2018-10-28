package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.BufferedReader;
import java.util.Scanner;

public class Controller {

    public Button mul;
    public Button div;
    public Button minus;
    String action;
    Long v1, v2;
    public TextField input;
    public Button plus;
    public Button eq;

    public void plus(ActionEvent actionEvent) {
        action = "+";
        v1 = Long.parseLong(input.getText());
        System.out.println(v1);
        input.setText("");
    }

    public void eq(ActionEvent actionEvent) {
        v2 = Long.parseLong(input.getText());
        switch (action){
            case "+":
                input.setText(String.valueOf(
                        v1 + v2
                ));
                break;
            case "/":
                if(v2 == 0){
                    input.setText("Division by ZERO!");
                    break;
                }
                input.setText(String.valueOf(
                        v1 / v2
                ));
                break;
            case "*":
                input.setText(String.valueOf(
                        v1 * v2
                ));
                break;
            case "-":
                input.setText(String.valueOf(
                        v1 - v2
                ));
                break;
        }
    }

    public void mul(ActionEvent actionEvent) {
        action = "*";
        v1 = Long.parseLong(input.getText());
        System.out.println(v1);
        input.setText("");
    }

    public void div(ActionEvent actionEvent) {
        action = "/";
        v1 = Long.parseLong(input.getText());
        System.out.println(v1);
        input.setText("");
    }

    public void minus(ActionEvent actionEvent) {
        action = "-";
        v1 = Long.parseLong(input.getText());
        System.out.println(v1);
        input.setText("");
    }
}
