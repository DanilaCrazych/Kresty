package com.example.calc;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private Label turn;

    @FXML
    private Button Lverh, Verh, Rverh, Lmid, Rmid, Ldown, Down, Rdown;

    @FXML
    private Button centre;

    public void initialize() {
        turn.setText("x");
    }

    @FXML
    protected void playLverh() {
        if (turn.getText().equals("x")) {
            Lverh.setText("х");
            turn.setText("o");
        } else {
            Lverh.setText("o");
            turn.setText("x");
        }
    }

    @FXML
    protected void playVerh() {
        if (turn.getText().equals("x")) {
            Verh.setText("х");
            turn.setText("o");
        } else {
            Verh.setText("o");
            turn.setText("x");
        }
    }

    @FXML
    protected void playRverh() {
        if (turn.getText().equals("x")) {
            Rverh.setText("х");
            turn.setText("o");
        } else {
            Rverh.setText("o");
            turn.setText("x");
        }
    }

    @FXML
    protected void playLmid() {
        if (turn.getText().equals("x")) {
            Lmid.setText("х");
            turn.setText("o");
        } else {
            Lmid.setText("o");
            turn.setText("x");
        }
    }

    @FXML
    protected void playMid() {
        if (turn.getText().equals("x")) {
            centre.setText("х");
            turn.setText("o");
        } else {
            centre.setText("o");
            turn.setText("x");
        }
    }


    @FXML
    protected void playRmid() {
        if (turn.getText().equals("x")) {
            Rmid.setText("х");
            turn.setText("o");
        } else {
            Rmid.setText("o");
            turn.setText("x");
        }
    }

    @FXML
    protected void playLdown() {
        if (turn.getText().equals("x")) {
            Ldown.setText("х");
            turn.setText("o");
        } else {
            Ldown.setText("o");
            turn.setText("x");
        }
    }

    @FXML
    protected void playDown() {
        if (turn.getText().equals("x")) {
            Down.setText("х");
            turn.setText("o");
        } else {
            Down.setText("o");
            turn.setText("x");
        }
    }

    @FXML
    protected void playRdown() {
        if (turn.getText().equals("x")) {
            Rdown.setText("х");
            turn.setText("o");
        } else {
            Rdown.setText("o");
            turn.setText("x");
        }
    }
}