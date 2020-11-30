package ticTacToe;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class TicTacToeApplication extends Application {

<<<<<<< HEAD
    private boolean event = true;
    private int button1Index = 0;
    private int button2Index = 0;
    private int button3Index = 0;
    private int button4Index = 0;
    private int button5Index = 0;
    private int button6Index = 0;
    private int button7Index = 0;
    private int button8Index = 0;
    private int button9Index = 0;
=======
    private boolean turn = true;
    private int button1Cont = 0;
    private int button2Cont = 0;
    private int button3Cont = 0;
    private int button4Cont = 0;
    private int button5Cont = 0;
    private int button6Cont = 0;
    private int button7Cont = 0;
    private int button8Cont = 0;
    private int button9Cont = 0;
>>>>>>> main

    @Override
    public void start(Stage window) {
        GridPane layout = new GridPane();

        Button button1 = new Button(" ");
        Button button2 = new Button(" ");
        Button button3 = new Button(" ");
        Button button4 = new Button(" ");
        Button button5 = new Button(" ");
        Button button6 = new Button(" ");
        Button button7 = new Button(" ");
        Button button8 = new Button(" ");
        Button button9 = new Button(" ");

        button1.setFont(Font.font("Monospaced", 40));
        button2.setFont(Font.font("Monospaced", 40));
        button3.setFont(Font.font("Monospaced", 40));
        button4.setFont(Font.font("Monospaced", 40));
        button5.setFont(Font.font("Monospaced", 40));
        button6.setFont(Font.font("Monospaced", 40));
        button7.setFont(Font.font("Monospaced", 40));
        button8.setFont(Font.font("Monospaced", 40));
        button9.setFont(Font.font("Monospaced", 40));

        Label textTurn = new Label("Turno: " + textPlayer(this.event));
        textTurn.setFont(Font.font("Monospaced", 40));

        layout.add(button1, 0, 0);
        layout.add(button2, 0, 1);
        layout.add(button3, 0, 2);
        layout.add(button4, 1, 0);
        layout.add(button5, 1, 1);
        layout.add(button6, 1, 2);
        layout.add(button7, 2, 0);
        layout.add(button8, 2, 1);
        layout.add(button9, 2, 2);
        layout.setHgap(10);
        layout.setVgap(10);
        layout.setPadding(new Insets(20, 20, 20, 20));

        button1.setOnAction((event) -> {
            if (this.button1Count < 1) {
                if (turn) {
                    button1.setText("X");
                    changeTurn(true);

                    textTurn.setText("Turno: " + textPlayer(this.event);
                    compareButtons(button1, button2, button3, button4, button5, button6, button7, button8, button9, textTurn);
                } else {
                    button1.setText("O");
                    changeTurn(false);

                    textTurn.setText("Turno: " + textPlayer(this.event));
                    compareButtons(button1, button2, button3, button4, button5, button6, button7, button8, button9, textTurn);
                }
                this.button1Count++;
            }
        });
        button2.setOnAction((event) -> {
            if (this.button2Count < 1) {
                if (turn) {
                    button2.setText("X");
                    changeTurn(true);

                    textTurn.setText("Turno: " + textPlayer(this.event);
                    compareButtons(button1, button2, button3, button4, button5, button6, button7, button8, button9, textTurn);
                } else {
                    button2.setText("O");
                    changeTurn(false);

                    textTurn.setText("Turno: " + textPlayer(this.event));
                    compareButtons(button1, button2, button3, button4, button5, button6, button7, button8, button9, textTurn);
                }
                this.button2Count++;
            }
        });
        button3.setOnAction((event) -> {
            if (this.button3Count < 1) {
                if (turn) {
                    button3.setText("X");

                    changeTurn(true);

                    textTurn.setText("Turno: " + textPlayer(this.event));
                    compareButtons(button1, button2, button3, button4, button5, button6, button7, button8, button9, textTurn);
                } else {
                    button3.setText("O");
                    changeTurn(false);

                    textTurn.setText("Turno: " + textPlayer(this.event));
                    compareButtons(button1, button2, button3, button4, button5, button6, button7, button8, button9, textTurn);
                }
                this.button3Count++;
            }
        });
        button4.setOnAction((event) -> {
            if (this.button4Count < 1) {
                if (turn) {
                    button4.setText("X");
                    changeTurn(true);

                    textTurn.setText("Turno: " + textPlayer(this.event));
                    compareButtons(button1, button2, button3, button4, button5, button6, button7, button8, button9, textTurn);
                } else {
                    button4.setText("O");
                    changeTurn(false);

                    textTurn.setText("Turno: " + textPlayer(this.event));
                    compareButtons(button1, button2, button3, button4, button5, button6, button7, button8, button9, textTurn);
                }
                this.button4Count++;
            }
        });
        button5.setOnAction((event) -> {
            if (this.button5Count < 1) {
                if (turn) {
                    button5.setText("X");
                    changeTurn(true);

                    textTurn.setText("Turno: " + textPlayer(this.event));
                    compareButtons(button1, button2, button3, button4, button5, button6, button7, button8, button9, textTurn);
                } else {
                    button5.setText("O");
                    changeTurn(false);

                    textTurn.setText("Turno: " + textPlayer(this.event));
                    compareButtons(button1, button2, button3, button4, button5, button6, button7, button8, button9, textTurn);
                }
                this.button5Count++;
            }
        });
        button6.setOnAction((event) -> {
            if (this.button6Count < 1) {
                if (turn) {
                    button6.setText("X");
                    changeTurn(true);
                    textTurn.setText("Turno: " + textPlayer(this.event));
                    compareButtons(button1, button2, button3, button4, button5, button6, button7, button8, button9, textTurn);
                } else {
                    button6.setText("O");
                    changeTurn(false);

                    textTurn.setText("Turno: " + textPlayer(this.event));
                    compareButtons(button1, button2, button3, button4, button5, button6, button7, button8, button9, textTurn);
                }
                this.button6Count++;
            }
        });
        button7.setOnAction((event) -> {
            if (this.button7Count < 1) {
                if (turn) {
                    button7.setText("X");
                    changeTurn(true);

                    textTurn.setText("Turno: " + textPlayer(this.event));
                    compareButtons(button1, button2, button3, button4, button5, button6, button7, button8, button9, textTurn);
                } else {
                    button7.setText("O");
                    changeTurn(false);

                    textTurn.setText("Turno: " + textPlayer(this.event));
                    compareButtons(button1, button2, button3, button4, button5, button6, button7, button8, button9, textTurn);
                }
                this.button7Count++;
            }
        });
        button8.setOnAction((event) -> {
            if (this.button8Count < 1) {
                if (turn) {
                    button8.setText("X");
                    changeTurn(true);

                    textTurn.setText("Turno: " + textPlayer(this.event));
                    compareButtons(button1, button2, button3, button4, button5, button6, button7, button8, button9, textTurn);
                } else {
                    button8.setText("O");
                    changeTurn(false);

                    textTurn.setText("Turno: " + textPlayer(this.event));
                    compareButtons(button1, button2, button3, button4, button5, button6, button7, button8, button9, textTurn);
                    this.button8Count++;
                }
                this.button8Count++;
            }
        });
        button9.setOnAction((event) -> {
            if (this.button9Count < 1) {
                if (turn) {
                    button9.setText("X");
                    changeTurn(true);

                    textTurn.setText("Turno: " + textPlayer(this.event));
                    compareButtons(button1, button2, button3, button4, button5, button6, button7, button8, button9, textTurn);
                } else {
                    button9.setText("O");
                    changeTurn(false);

                    textTurn.setText("Turno: " + textPlayer(this.event));
                    compareButtons(button1, button2, button3, button4, button5, button6, button7, button8, button9, textTurn);
                }
                this.button9Count++;
            }
        });

        BorderPane layout1 = new BorderPane();
        layout1.setTop(textTurn);
        layout1.setCenter(layout);

        Scene scene = new Scene(layout1);
        window.setScene(scene);
        window.setTitle("Play: Tic Tac Toe");
        window.show();
    }

    public void compareButtons(Button btn1, Button btn2, Button btn3, Button btn4, Button btn5, Button btn6, Button btn7, Button btn8, Button btn9, Label text) {

        if ((((btn1.getText().equals(btn2.getText())) && (btn1.getText().equals(btn3.getText()))) && (btn1.getText() != " "))
                || (((btn4.getText().equals(btn5.getText())) && (btn4.getText().equals(btn6.getText()))) && (btn4.getText() != " "))
                || (((btn7.getText().equals(btn8.getText())) && (btn7.getText().equals(btn9.getText()))) && (btn7.getText() != " "))
                || (((btn1.getText().equals(btn4.getText())) && (btn4.getText().equals(btn7.getText()))) && (btn1.getText() != " "))
                || (((btn2.getText().equals(btn5.getText())) && (btn5.getText().equals(btn8.getText()))) && (btn2.getText() != " "))
                || (((btn3.getText().equals(btn6.getText())) && (btn6.getText().equals(btn9.getText()))) && (btn3.getText() != " "))
                || (((btn1.getText().equals(btn5.getText())) && (btn5.getText().equals(btn9.getText()))) && (btn1.getText() != " "))
                || (((btn7.getText().equals(btn5.getText())) && (btn5.getText().equals(btn3.getText()))) && (btn7.getText() != " "))) {
            text.setText("The end!");
            stop();
        } else if (button1Index == 1 && button2Index == 1 && button3Index == 1 && button4Index == 1 && button5Index == 1 && button6Index == 1
                && button7Index == 1 && button8Index == 1 && button9Index == 1) {
            text.setText("The end!");
        }
    }

    public void changeTurn(boolean turn) {
        this.turn = turn == false;
    }

    public String textPlayer(boolean turn) {
        if (turn) {
            return "X";
        }
        return "O";
    }

    @Override
    public void stop() {
<<<<<<< HEAD
        button1Index = 1;
        button2Index = 1;
        button3Index = 1;
        button4Index = 1;
        button5Index = 1;
        button6Index = 1;
        button7Index = 1;
        button8Index = 1;
        button9Index = 1;
=======
        button1Cont = 1;
        button2Cont = 1;
        button3Cont = 1;
        button4Cont = 1;
        button5Cont = 1;
        button6Cont = 1;
        button7Cont = 1;
        button8Cont = 1;
        button9Cont = 1;
>>>>>>> main
    }

    public static void main(String[] args) {
        launch(TicTacToeApplication.class);
    }
}
