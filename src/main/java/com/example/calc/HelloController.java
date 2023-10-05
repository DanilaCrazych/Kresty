package com.example.calc;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


public class HelloController {

    int[] board = new int[]{
            0, 0, 0,
            0, 0, 0,
            0, 0, 0
    };

    @FXML
    private Label welcomeText;
    @FXML
    private Label turn, win;

    @FXML
    private Button Lverh, Verh, Rverh, Lmid, Rmid, Ldown, Down, Rdown;

    @FXML
    private Button centre;




    public void initialize() {
        turn.setText("x");
    }


    @FXML
    protected void checkWinner() {
        if (board[0] == 1 && board[1] == 1 && board[2] == 1) {
            win.setText("X win");
        } else if (board[3] == 1 && board[4] == 1 && board[5] == 1) {
            win.setText("X win");
        } else if (board[6] == 1 && board[7] == 1 && board[8] == 1) {
            win.setText("X win");
        } else if (board[0] == 1 && board[4] == 1 && board[8] == 1) {
            win.setText("X win");
        } else if (board[2] == 1 && board[4] == 1 && board[6] == 1) {
            win.setText("X win");
        } else if (board[0] == 1 && board[3] == 1 && board[6] == 1) {
            win.setText("X win");
        } else if (board[1] == 1 && board[4] == 1 && board[7] == 1) {
            win.setText("X win");
        } else if (board[2] == 1 && board[5] == 1 && board[8] == 1) {
            win.setText("X win");
        }
        else if (board[0] == 2 && board[1] == 2 && board[2] == 2) {
            win.setText("O win");
        } else if (board[3] == 2 && board[4] == 2 && board[5] == 2) {
            win.setText("O win");
        } else if (board[6] == 2 && board[7] == 2 && board[8] == 2) {
            win.setText("O win");
        } else if (board[0] == 2 && board[4] == 2 && board[8] == 2) {
            win.setText("O win");
        } else if (board[2] == 2 && board[4] == 2 && board[6] == 2) {
            win.setText("O win");
        } else if (board[0] == 2 && board[3] == 2 && board[6] == 2) {
            win.setText("O win");
        } else if (board[1] == 2 && board[4] == 2 && board[7] == 2) {
            win.setText("O win");
        } else if (board[2] == 2 && board[5] == 2 && board[8] == 2) {
            win.setText("O win");
        }
        else if(board[0] != 0 && board[1] != 0 && board[2] != 0 && board[3] != 0 && board[4] != 0 && board[5] != 0 && board[6] != 0 && board[7] != 0 && board[8] != 0) {
            win.setText("Draw");}
    }


    @FXML
    protected void playLverh() {
        if (turn.getText().equals("x")) {
            Lverh.setText("х");
            turn.setText("o");
            board[0] = 1;
        } else {
            Lverh.setText("o");
            turn.setText("x");
            board[0] =2;
        }
        Lverh.setDisable(true);
        checkWinner();
    }

    @FXML
    protected void playVerh() {
        if (turn.getText().equals("x")) {
            Verh.setText("х");
            turn.setText("o");
            board[1] =1;
        } else {
            Verh.setText("o");
            turn.setText("x");
            board[1] =2;
        }
        Verh.setDisable(true);
        checkWinner();
    }

    @FXML
    protected void playRverh() {
        if (turn.getText().equals("x")) {
            Rverh.setText("х");
            turn.setText("o");
            board[2] =1;
        } else {
            Rverh.setText("o");
            turn.setText("x");
            board[2] =2;
        }
        Rverh.setDisable(true);
        checkWinner();
    }

    @FXML
    protected void playLmid() {
        if (turn.getText().equals("x")) {
            Lmid.setText("х");
            turn.setText("o");
            board[3] =1;
        } else {
            Lmid.setText("o");
            turn.setText("x");
            board[3] =2;
        }
        Lmid.setDisable(true);
        checkWinner();
    }

    @FXML
    protected void playMid() {
        if (turn.getText().equals("x")) {
            centre.setText("х");
            turn.setText("o");
            board[4] =1;
        } else {
            centre.setText("o");
            turn.setText("x");
            board[4] =2;
        }
        centre.setDisable(true);
        checkWinner();
    }


    @FXML
    protected void playRmid() {
        if (turn.getText().equals("x")) {
            Rmid.setText("х");
            turn.setText("o");
            board[5] =1;
        } else {
            Rmid.setText("o");
            turn.setText("x");
            board[5] =2;
        }
        Rmid.setDisable(true);
        checkWinner();
    }

    @FXML
    protected void playLdown() {
        if (turn.getText().equals("x")) {
            Ldown.setText("х");
            turn.setText("o");
            board[6] =1;
        } else {
            Ldown.setText("o");
            turn.setText("x");
            board[6] =2;
        }
        Ldown.setDisable(true);
        checkWinner();
    }

    @FXML
    protected void playDown() {
        if (turn.getText().equals("x")) {
            Down.setText("х");
            turn.setText("o");
            board[7] =1;
        } else {
            Down.setText("o");
            turn.setText("x");
            board[7] =2;
        }
        Down.setDisable(true);
        checkWinner();
    }

    @FXML
    protected void playRdown() {
        if (turn.getText().equals("x")) {
            Rdown.setText("х");
            turn.setText("o");
            board[8] =1;
        } else {
            Rdown.setText("o");
            turn.setText("x");
            board[8] =2;
        }
        Rdown.setDisable(true);
        checkWinner();
    }
}