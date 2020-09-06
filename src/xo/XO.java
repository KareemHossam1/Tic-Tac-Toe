/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author lenovo
 */
public class XO extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        // Creating Buttons
        Button btn1 = new Button("");
        Button btn2 = new Button("");
        Button btn3 = new Button("");
        Button btn4 = new Button("");
        Button btn5 = new Button("");
        Button btn6 = new Button("");
        Button btn7 = new Button("");
        Button btn8 = new Button("");
        Button btn9 = new Button("");
        Button Reset = new Button("Reset"); 
        btn1.setPrefSize(100,100);
        btn2.setPrefSize(100,100);
        btn3.setPrefSize(100,100);
        btn4.setPrefSize(100,100);
        btn5.setPrefSize(100,100);
        btn6.setPrefSize(100,100);
        btn7.setPrefSize(100,100);
        btn8.setPrefSize(100,100);
        btn9.setPrefSize(100,100);
        Reset.autosize();
        
        // Creating Label
        Label lbl = new Label("\n\t\t     Let's Start ! X turn");
        
        // Interface order
        HBox First = new HBox();
        First.getChildren().addAll(btn1,btn2,btn3);
        HBox Second = new HBox();
        Second.getChildren().addAll(btn4,btn5,btn6);
        HBox Third = new HBox();
        Third.getChildren().addAll(btn7,btn8,btn9);
        VBox Buttons = new VBox();
        Buttons.getChildren().addAll(First,Second,Third);
        VBox ResetVBox = new VBox();
        ResetVBox.getChildren().add(Reset);
        ResetVBox.setPadding(new Insets(10,20,20,125));
        VBox Order = new VBox();
        Order.getChildren().addAll(lbl,Buttons,ResetVBox);
        Order.setSpacing(20);
        StackPane root = new StackPane();
        root.getChildren().add(Order);
        Scene scene = new Scene(root, 288, 440);
        
        // Event Handler
        Alert alert= new Alert (Alert.AlertType.INFORMATION);
        Font font = new Font(47); //Button font's size should increase to 62
        btn1.setOnAction(e->{
            if((lbl.getText()== "\n\t\t     Let's Start ! X turn" || lbl.getText() == "\n\t\t\t\tX turn") && (btn1.getText()=="") )
            {
                btn1.setText("X");
                btn1.setFont(font);
                lbl.setText("\n\t\t\t\tO turn");            
            }
            else if (lbl.getText()== "\n\t\t\t\tO turn" && (btn1.getText()==""))
                {
                    btn1.setText("O");
                    btn1.setFont(font);
                    lbl.setText("\n\t\t\t\tX turn");
                } 
            if ((btn1.getText()=="O" && btn2.getText()=="O"&&btn3.getText()=="O")|| (btn4.getText()=="O" && btn5.getText()=="O"&&btn6.getText()=="O")||(btn7.getText()=="O" && btn8.getText()=="O"&&btn9.getText()=="O")||((btn1.getText()=="O" && btn4.getText()=="O"&&btn7.getText()=="O")||(btn8.getText()=="O" && btn5.getText()=="O"&&btn2.getText()=="O")||(btn9.getText()=="O" && btn6.getText()=="O"&&btn3.getText()=="O")||(btn3.getText()=="O" && btn5.getText()=="O"&&btn7.getText()=="O")||(btn1.getText()=="O" && btn5.getText()=="O"&&btn9.getText()=="O")))
            {
             alert.setTitle("Congratulations!");                          
             alert.setHeaderText("");
             alert.setContentText("O player is the winner !");
             alert.showAndWait();
             lbl.setText("\n\t\t     Let's Start ! X turn");
             btn1.setText("");
             btn2.setText("");
             btn3.setText("");
             btn4.setText("");
             btn5.setText("");
             btn6.setText("");
             btn7.setText("");
             btn8.setText("");
             btn9.setText("");
            }
            if ((btn1.getText()=="X" && btn2.getText()=="X"&&btn3.getText()=="X")|| (btn4.getText()=="X" && btn5.getText()=="X"&&btn6.getText()=="X")||(btn7.getText()=="X" && btn8.getText()=="X"&&btn9.getText()=="X")||((btn1.getText()=="X" && btn4.getText()=="X"&&btn7.getText()=="X")||(btn8.getText()=="X" && btn5.getText()=="X"&&btn2.getText()=="X")||(btn9.getText()=="X" && btn6.getText()=="X"&&btn3.getText()=="X")||(btn3.getText()=="X" && btn5.getText()=="X"&&btn7.getText()=="X")||(btn1.getText()=="X" && btn5.getText()=="X"&&btn9.getText()=="X")))
            {
             alert.setTitle("Congratulations!");                         
             alert.setHeaderText("");
             alert.setContentText("X player is the winner !");
             alert.showAndWait();
             lbl.setText("\n\t\t     Let's Start ! X turn");
             btn1.setText("");
             btn2.setText("");
             btn3.setText("");
             btn4.setText("");
             btn5.setText("");
             btn6.setText("");
             btn7.setText("");
             btn8.setText("");
             btn9.setText("");
            }
            if (btn1.getText()!="" && btn2.getText()!=""&&btn3.getText()!="" && btn4.getText()!="" && btn5.getText()!="" && btn6.getText()!="" && btn7.getText()!="" && btn8.getText()!="" && btn9.getText()!="")
            {
             alert.setTitle("Draw");                         
             alert.setHeaderText("");
             alert.setContentText("It's Draw !");
             alert.showAndWait();
             lbl.setText("\n\t\t     Let's Start ! X turn");
             btn1.setText("");
             btn2.setText("");
             btn3.setText("");
             btn4.setText("");
             btn5.setText("");
             btn6.setText("");
             btn7.setText("");
             btn8.setText("");
             btn9.setText("");
            }
        });
        btn2.setOnAction(e->{
            if((lbl.getText()== "\n\t\t     Let's Start ! X turn" || lbl.getText() == "\n\t\t\t\tX turn") && (btn2.getText()=="") )
            {
                btn2.setText("X");
                btn2.setFont(font);
                lbl.setText("\n\t\t\t\tO turn");            
            }
            else if (lbl.getText()== "\n\t\t\t\tO turn" && (btn2.getText()==""))
                {
                    btn2.setText("O");
                    btn2.setFont(font);
                    lbl.setText("\n\t\t\t\tX turn");
                }
            if ((btn1.getText()=="O" && btn2.getText()=="O"&&btn3.getText()=="O")|| (btn4.getText()=="O" && btn5.getText()=="O"&&btn6.getText()=="O")||(btn7.getText()=="O" && btn8.getText()=="O"&&btn9.getText()=="O")||((btn1.getText()=="O" && btn4.getText()=="O"&&btn7.getText()=="O")||(btn8.getText()=="O" && btn5.getText()=="O"&&btn2.getText()=="O")||(btn9.getText()=="O" && btn6.getText()=="O"&&btn3.getText()=="O")||(btn3.getText()=="O" && btn5.getText()=="O"&&btn7.getText()=="O")||(btn1.getText()=="O" && btn5.getText()=="O"&&btn9.getText()=="O")))
            {
             alert.setTitle("Congratulations!");                         
             alert.setHeaderText("");
             alert.setContentText("O player is the winner !");
             alert.showAndWait();
             lbl.setText("\n\t\t     Let's Start ! X turn");
             btn1.setText("");
             btn2.setText("");
             btn3.setText("");
             btn4.setText("");
             btn5.setText("");
             btn6.setText("");
             btn7.setText("");
             btn8.setText("");
             btn9.setText("");
            }
            if ((btn1.getText()=="X" && btn2.getText()=="X"&&btn3.getText()=="X")|| (btn4.getText()=="X" && btn5.getText()=="X"&&btn6.getText()=="X")||(btn7.getText()=="X" && btn8.getText()=="X"&&btn9.getText()=="X")||((btn1.getText()=="X" && btn4.getText()=="X"&&btn7.getText()=="X")||(btn8.getText()=="X" && btn5.getText()=="X"&&btn2.getText()=="X")||(btn9.getText()=="X" && btn6.getText()=="X"&&btn3.getText()=="X")||(btn3.getText()=="X" && btn5.getText()=="X"&&btn7.getText()=="X")||(btn1.getText()=="X" && btn5.getText()=="X"&&btn9.getText()=="X")))
            {
             alert.setTitle("Congratulations!");                         
             alert.setHeaderText("");
             alert.setContentText("X player is the winner !");
             alert.showAndWait();
             lbl.setText("\n\t\t     Let's Start ! X turn");
             btn1.setText("");
             btn2.setText("");
             btn3.setText("");
             btn4.setText("");
             btn5.setText("");
             btn6.setText("");
             btn7.setText("");
             btn8.setText("");
             btn9.setText("");
            }
            if (btn1.getText()!="" && btn2.getText()!=""&&btn3.getText()!="" && btn4.getText()!="" && btn5.getText()!="" && btn6.getText()!="" && btn7.getText()!="" && btn8.getText()!="" && btn9.getText()!="")
            {
             alert.setTitle("Draw");                         
             alert.setHeaderText("");
             alert.setContentText("It's Draw !");
             alert.showAndWait();
             lbl.setText("\n\t\t     Let's Start ! X turn");
             btn1.setText("");
             btn2.setText("");
             btn3.setText("");
             btn4.setText("");
             btn5.setText("");
             btn6.setText("");
             btn7.setText("");
             btn8.setText("");
             btn9.setText("");
            }
        });
        btn3.setOnAction(e->{
            if((lbl.getText()== "\n\t\t     Let's Start ! X turn" || lbl.getText() == "\n\t\t\t\tX turn") && (btn3.getText()=="") )
            {
                btn3.setText("X");
                btn3.setFont(font);
                lbl.setText("\n\t\t\t\tO turn");            
            }
            else if (lbl.getText()== "\n\t\t\t\tO turn" && (btn3.getText()==""))
                {
                    btn3.setText("O");
                    btn3.setFont(font);
                    lbl.setText("\n\t\t\t\tX turn");
                }
            if ((btn1.getText()=="O" && btn2.getText()=="O"&&btn3.getText()=="O")|| (btn4.getText()=="O" && btn5.getText()=="O"&&btn6.getText()=="O")||(btn7.getText()=="O" && btn8.getText()=="O"&&btn9.getText()=="O")||((btn1.getText()=="O" && btn4.getText()=="O"&&btn7.getText()=="O")||(btn8.getText()=="O" && btn5.getText()=="O"&&btn2.getText()=="O")||(btn9.getText()=="O" && btn6.getText()=="O"&&btn3.getText()=="O")||(btn3.getText()=="O" && btn5.getText()=="O"&&btn7.getText()=="O")||(btn1.getText()=="O" && btn5.getText()=="O"&&btn9.getText()=="O")))
            {
             alert.setTitle("Congratulations!");                         
             alert.setHeaderText("");
             alert.setContentText("O player is the winner !");
             alert.showAndWait();
             lbl.setText("\n\t\t     Let's Start ! X turn");
             btn1.setText("");
             btn2.setText("");
             btn3.setText("");
             btn4.setText("");
             btn5.setText("");
             btn6.setText("");
             btn7.setText("");
             btn8.setText("");
             btn9.setText("");
            }
            if ((btn1.getText()=="X" && btn2.getText()=="X"&&btn3.getText()=="X")|| (btn4.getText()=="X" && btn5.getText()=="X"&&btn6.getText()=="X")||(btn7.getText()=="X" && btn8.getText()=="X"&&btn9.getText()=="X")||((btn1.getText()=="X" && btn4.getText()=="X"&&btn7.getText()=="X")||(btn8.getText()=="X" && btn5.getText()=="X"&&btn2.getText()=="X")||(btn9.getText()=="X" && btn6.getText()=="X"&&btn3.getText()=="X")||(btn3.getText()=="X" && btn5.getText()=="X"&&btn7.getText()=="X")||(btn1.getText()=="X" && btn5.getText()=="X"&&btn9.getText()=="X")))
            {
             alert.setTitle("Congratulations!");                         
             alert.setHeaderText("");
             alert.setContentText("X player is the winner !");
             alert.showAndWait();
             lbl.setText("\n\t\t     Let's Start ! X turn");
             btn1.setText("");
             btn2.setText("");
             btn3.setText("");
             btn4.setText("");
             btn5.setText("");
             btn6.setText("");
             btn7.setText("");
             btn8.setText("");
             btn9.setText("");
            }
            if (btn1.getText()!="" && btn2.getText()!=""&&btn3.getText()!="" && btn4.getText()!="" && btn5.getText()!="" && btn6.getText()!="" && btn7.getText()!="" && btn8.getText()!="" && btn9.getText()!="")
            {
             alert.setTitle("Draw");                         
             alert.setHeaderText("");
             alert.setContentText("It's Draw !");
             alert.showAndWait();
             lbl.setText("\n\t\t     Let's Start ! X turn");
             btn1.setText("");
             btn2.setText("");
             btn3.setText("");
             btn4.setText("");
             btn5.setText("");
             btn6.setText("");
             btn7.setText("");
             btn8.setText("");
             btn9.setText("");
            }
                });   
        btn4.setOnAction(e->{
            if((lbl.getText()== "\n\t\t     Let's Start ! X turn" || lbl.getText() == "\n\t\t\t\tX turn") && (btn4.getText()=="") )
            {
                btn4.setText("X");
                btn4.setFont(font);
                lbl.setText("\n\t\t\t\tO turn");            
            }
            else if (lbl.getText()== "\n\t\t\t\tO turn" && (btn4.getText()==""))
                {
                    btn4.setText("O");
                    btn4.setFont(font);
                    lbl.setText("\n\t\t\t\tX turn");
                }
            if ((btn1.getText()=="O" && btn2.getText()=="O"&&btn3.getText()=="O")|| (btn4.getText()=="O" && btn5.getText()=="O"&&btn6.getText()=="O")||(btn7.getText()=="O" && btn8.getText()=="O"&&btn9.getText()=="O")||((btn1.getText()=="O" && btn4.getText()=="O"&&btn7.getText()=="O")||(btn8.getText()=="O" && btn5.getText()=="O"&&btn2.getText()=="O")||(btn9.getText()=="O" && btn6.getText()=="O"&&btn3.getText()=="O")||(btn3.getText()=="O" && btn5.getText()=="O"&&btn7.getText()=="O")||(btn1.getText()=="O" && btn5.getText()=="O"&&btn9.getText()=="O")))
            {
             alert.setTitle("Congratulations!");                         
             alert.setHeaderText("");
             alert.setContentText("O player is the winner !");
             alert.showAndWait();
             lbl.setText("\n\t\t     Let's Start ! X turn");
             btn1.setText("");
             btn2.setText("");
             btn3.setText("");
             btn4.setText("");
             btn5.setText("");
             btn6.setText("");
             btn7.setText("");
             btn8.setText("");
             btn9.setText("");
            }
            if ((btn1.getText()=="X" && btn2.getText()=="X"&&btn3.getText()=="X")|| (btn4.getText()=="X" && btn5.getText()=="X"&&btn6.getText()=="X")||(btn7.getText()=="X" && btn8.getText()=="X"&&btn9.getText()=="X")||((btn1.getText()=="X" && btn4.getText()=="X"&&btn7.getText()=="X")||(btn8.getText()=="X" && btn5.getText()=="X"&&btn2.getText()=="X")||(btn9.getText()=="X" && btn6.getText()=="X"&&btn3.getText()=="X")||(btn3.getText()=="X" && btn5.getText()=="X"&&btn7.getText()=="X")||(btn1.getText()=="X" && btn5.getText()=="X"&&btn9.getText()=="X")))
            {
             alert.setTitle("Congratulations!");                         
             alert.setHeaderText("");
             alert.setContentText("X player is the winner !");
             alert.showAndWait();
             lbl.setText("\n\t\t     Let's Start ! X turn");
             btn1.setText("");
             btn2.setText("");
             btn3.setText("");
             btn4.setText("");
             btn5.setText("");
             btn6.setText("");
             btn7.setText("");
             btn8.setText("");
             btn9.setText("");
            }
            if (btn1.getText()!="" && btn2.getText()!=""&&btn3.getText()!="" && btn4.getText()!="" && btn5.getText()!="" && btn6.getText()!="" && btn7.getText()!="" && btn8.getText()!="" && btn9.getText()!="")
            {
             alert.setTitle("Draw");                         
             alert.setHeaderText("");
             alert.setContentText("It's Draw !");
             alert.showAndWait();
             lbl.setText("\n\t\t     Let's Start ! X turn");
             btn1.setText("");
             btn2.setText("");
             btn3.setText("");
             btn4.setText("");
             btn5.setText("");
             btn6.setText("");
             btn7.setText("");
             btn8.setText("");
             btn9.setText("");
            }
        });
        btn5.setOnAction(e->{
            if((lbl.getText()== "\n\t\t     Let's Start ! X turn" || lbl.getText() == "\n\t\t\t\tX turn") && (btn5.getText()=="") )
            {
                btn5.setText("X");
                btn5.setFont(font);
                lbl.setText("\n\t\t\t\tO turn");            
            }
            else if (lbl.getText()== "\n\t\t\t\tO turn" && (btn5.getText()==""))
                {
                    btn5.setText("O");
                    btn5.setFont(font);
                    lbl.setText("\n\t\t\t\tX turn");
                }
            if ((btn1.getText()=="O" && btn2.getText()=="O"&&btn3.getText()=="O")|| (btn4.getText()=="O" && btn5.getText()=="O"&&btn6.getText()=="O")||(btn7.getText()=="O" && btn8.getText()=="O"&&btn9.getText()=="O")||((btn1.getText()=="O" && btn4.getText()=="O"&&btn7.getText()=="O")||(btn8.getText()=="O" && btn5.getText()=="O"&&btn2.getText()=="O")||(btn9.getText()=="O" && btn6.getText()=="O"&&btn3.getText()=="O")||(btn3.getText()=="O" && btn5.getText()=="O"&&btn7.getText()=="O")||(btn1.getText()=="O" && btn5.getText()=="O"&&btn9.getText()=="O")))
            {
             alert.setTitle("Congratulations!");                         
             alert.setHeaderText("");
             alert.setContentText("O player is the winner !");
             alert.showAndWait();
             lbl.setText("\n\t\t     Let's Start ! X turn");
             btn1.setText("");
             btn2.setText("");
             btn3.setText("");
             btn4.setText("");
             btn5.setText("");
             btn6.setText("");
             btn7.setText("");
             btn8.setText("");
             btn9.setText("");
            }
            if ((btn1.getText()=="X" && btn2.getText()=="X"&&btn3.getText()=="X")|| (btn4.getText()=="X" && btn5.getText()=="X"&&btn6.getText()=="X")||(btn7.getText()=="X" && btn8.getText()=="X"&&btn9.getText()=="X")||((btn1.getText()=="X" && btn4.getText()=="X"&&btn7.getText()=="X")||(btn8.getText()=="X" && btn5.getText()=="X"&&btn2.getText()=="X")||(btn9.getText()=="X" && btn6.getText()=="X"&&btn3.getText()=="X")||(btn3.getText()=="X" && btn5.getText()=="X"&&btn7.getText()=="X")||(btn1.getText()=="X" && btn5.getText()=="X"&&btn9.getText()=="X")))
            {
             alert.setTitle("Congratulations!");                         
             alert.setHeaderText("");
             alert.setContentText("X player is the winner !");
             alert.showAndWait();
             lbl.setText("\n\t\t     Let's Start ! X turn");
             btn1.setText("");
             btn2.setText("");
             btn3.setText("");
             btn4.setText("");
             btn5.setText("");
             btn6.setText("");
             btn7.setText("");
             btn8.setText("");
             btn9.setText("");
            }
            if (btn1.getText()!="" && btn2.getText()!=""&&btn3.getText()!="" && btn4.getText()!="" && btn5.getText()!="" && btn6.getText()!="" && btn7.getText()!="" && btn8.getText()!="" && btn9.getText()!="")
            {
             alert.setTitle("Draw");                         
             alert.setHeaderText("");
             alert.setContentText("It's Draw !");
             alert.showAndWait();
             lbl.setText("\n\t\t     Let's Start ! X turn");
             btn1.setText("");
             btn2.setText("");
             btn3.setText("");
             btn4.setText("");
             btn5.setText("");
             btn6.setText("");
             btn7.setText("");
             btn8.setText("");
             btn9.setText("");
            }
        });
        btn6.setOnAction(e->{
            if((lbl.getText()== "\n\t\t     Let's Start ! X turn" || lbl.getText() == "\n\t\t\t\tX turn") && (btn6.getText()=="") )
            {
                btn6.setText("X");
                btn6.setFont(font);
                lbl.setText("\n\t\t\t\tO turn");            
            }
            else if (lbl.getText()== "\n\t\t\t\tO turn" && (btn6.getText()==""))
                {
                    btn6.setText("O");
                    btn6.setFont(font);
                    lbl.setText("\n\t\t\t\tX turn");
                }
            if ((btn1.getText()=="O" && btn2.getText()=="O"&&btn3.getText()=="O")|| (btn4.getText()=="O" && btn5.getText()=="O"&&btn6.getText()=="O")||(btn7.getText()=="O" && btn8.getText()=="O"&&btn9.getText()=="O")||((btn1.getText()=="O" && btn4.getText()=="O"&&btn7.getText()=="O")||(btn8.getText()=="O" && btn5.getText()=="O"&&btn2.getText()=="O")||(btn9.getText()=="O" && btn6.getText()=="O"&&btn3.getText()=="O")||(btn3.getText()=="O" && btn5.getText()=="O"&&btn7.getText()=="O")||(btn1.getText()=="O" && btn5.getText()=="O"&&btn9.getText()=="O")))
            {
             alert.setTitle("Congratulations!");                         
             alert.setHeaderText("");
             alert.setContentText("O player is the winner !");
             alert.showAndWait();
             lbl.setText("\n\t\t     Let's Start ! X turn");
             btn1.setText("");
             btn2.setText("");
             btn3.setText("");
             btn4.setText("");
             btn5.setText("");
             btn6.setText("");
             btn7.setText("");
             btn8.setText("");
             btn9.setText("");
            }
            if ((btn1.getText()=="X" && btn2.getText()=="X"&&btn3.getText()=="X")|| (btn4.getText()=="X" && btn5.getText()=="X"&&btn6.getText()=="X")||(btn7.getText()=="X" && btn8.getText()=="X"&&btn9.getText()=="X")||((btn1.getText()=="X" && btn4.getText()=="X"&&btn7.getText()=="X")||(btn8.getText()=="X" && btn5.getText()=="X"&&btn2.getText()=="X")||(btn9.getText()=="X" && btn6.getText()=="X"&&btn3.getText()=="X")||(btn3.getText()=="X" && btn5.getText()=="X"&&btn7.getText()=="X")||(btn1.getText()=="X" && btn5.getText()=="X"&&btn9.getText()=="X")))
            {
             alert.setTitle("Congratulations!");                         
             alert.setHeaderText("");
             alert.setContentText("X player is the winner !");
             alert.showAndWait();
             lbl.setText("\n\t\t     Let's Start ! X turn");
             btn1.setText("");
             btn2.setText("");
             btn3.setText("");
             btn4.setText("");
             btn5.setText("");
             btn6.setText("");
             btn7.setText("");
             btn8.setText("");
             btn9.setText("");
            }
            if (btn1.getText()!="" && btn2.getText()!=""&&btn3.getText()!="" && btn4.getText()!="" && btn5.getText()!="" && btn6.getText()!="" && btn7.getText()!="" && btn8.getText()!="" && btn9.getText()!="")
            {
             alert.setTitle("Draw");                         
             alert.setHeaderText("");
             alert.setContentText("It's Draw !");
             alert.showAndWait();
             lbl.setText("\n\t\t     Let's Start ! X turn");
             btn1.setText("");
             btn2.setText("");
             btn3.setText("");
             btn4.setText("");
             btn5.setText("");
             btn6.setText("");
             btn7.setText("");
             btn8.setText("");
             btn9.setText("");
            }
        });
        btn7.setOnAction(e->{
            if((lbl.getText()== "\n\t\t     Let's Start ! X turn" || lbl.getText() == "\n\t\t\t\tX turn") && (btn7.getText()=="") )
            {
                btn7.setText("X");
                btn7.setFont(font);
                lbl.setText("\n\t\t\t\tO turn");            
            }
            else if (lbl.getText()== "\n\t\t\t\tO turn" && (btn7.getText()==""))
                {
                    btn7.setText("O");
                    btn7.setFont(font);
                    lbl.setText("\n\t\t\t\tX turn");
                }
            if ((btn1.getText()=="O" && btn2.getText()=="O"&&btn3.getText()=="O")|| (btn4.getText()=="O" && btn5.getText()=="O"&&btn6.getText()=="O")||(btn7.getText()=="O" && btn8.getText()=="O"&&btn9.getText()=="O")||((btn1.getText()=="O" && btn4.getText()=="O"&&btn7.getText()=="O")||(btn8.getText()=="O" && btn5.getText()=="O"&&btn2.getText()=="O")||(btn9.getText()=="O" && btn6.getText()=="O"&&btn3.getText()=="O")||(btn3.getText()=="O" && btn5.getText()=="O"&&btn7.getText()=="O")||(btn1.getText()=="O" && btn5.getText()=="O"&&btn9.getText()=="O")))
            {
             alert.setTitle("Congratulations!");                         
             alert.setHeaderText("");
             alert.setContentText("O player is the winner !");
             alert.showAndWait();
             lbl.setText("\n\t\t     Let's Start ! X turn");
             btn1.setText("");
             btn2.setText("");
             btn3.setText("");
             btn4.setText("");
             btn5.setText("");
             btn6.setText("");
             btn7.setText("");
             btn8.setText("");
             btn9.setText("");
            }
            if ((btn1.getText()=="X" && btn2.getText()=="X"&&btn3.getText()=="X")|| (btn4.getText()=="X" && btn5.getText()=="X"&&btn6.getText()=="X")||(btn7.getText()=="X" && btn8.getText()=="X"&&btn9.getText()=="X")||((btn1.getText()=="X" && btn4.getText()=="X"&&btn7.getText()=="X")||(btn8.getText()=="X" && btn5.getText()=="X"&&btn2.getText()=="X")||(btn9.getText()=="X" && btn6.getText()=="X"&&btn3.getText()=="X")||(btn3.getText()=="X" && btn5.getText()=="X"&&btn7.getText()=="X")||(btn1.getText()=="X" && btn5.getText()=="X"&&btn9.getText()=="X")))
            {
             alert.setTitle("Congratulations!");                         
             alert.setHeaderText("");
             alert.setContentText("X player is the winner !");
             alert.showAndWait();
             lbl.setText("\n\t\t     Let's Start ! X turn");
             btn1.setText("");
             btn2.setText("");
             btn3.setText("");
             btn4.setText("");
             btn5.setText("");
             btn6.setText("");
             btn7.setText("");
             btn8.setText("");
             btn9.setText("");
            }
            if (btn1.getText()!="" && btn2.getText()!=""&&btn3.getText()!="" && btn4.getText()!="" && btn5.getText()!="" && btn6.getText()!="" && btn7.getText()!="" && btn8.getText()!="" && btn9.getText()!="")
            {
             alert.setTitle("Draw");                         
             alert.setHeaderText("");
             alert.setContentText("It's Draw !");
             alert.showAndWait();
             lbl.setText("\n\t\t     Let's Start ! X turn");
             btn1.setText("");
             btn2.setText("");
             btn3.setText("");
             btn4.setText("");
             btn5.setText("");
             btn6.setText("");
             btn7.setText("");
             btn8.setText("");
             btn9.setText("");
            }
        });
        btn8.setOnAction(e->{
            if((lbl.getText()== "\n\t\t     Let's Start ! X turn" || lbl.getText() == "\n\t\t\t\tX turn") && (btn8.getText()=="") )
            {
                btn8.setText("X");
                btn8.setFont(font);
                lbl.setText("\n\t\t\t\tO turn");            
            }
            else if (lbl.getText()== "\n\t\t\t\tO turn" && (btn8.getText()==""))
                {
                    btn8.setText("O");
                    btn8.setFont(font);
                    lbl.setText("\n\t\t\t\tX turn");
                }
            if ((btn1.getText()=="O" && btn2.getText()=="O"&&btn3.getText()=="O")|| (btn4.getText()=="O" && btn5.getText()=="O"&&btn6.getText()=="O")||(btn7.getText()=="O" && btn8.getText()=="O"&&btn9.getText()=="O")||((btn1.getText()=="O" && btn4.getText()=="O"&&btn7.getText()=="O")||(btn8.getText()=="O" && btn5.getText()=="O"&&btn2.getText()=="O")||(btn9.getText()=="O" && btn6.getText()=="O"&&btn3.getText()=="O")||(btn3.getText()=="O" && btn5.getText()=="O"&&btn7.getText()=="O")||(btn1.getText()=="O" && btn5.getText()=="O"&&btn9.getText()=="O")))
            {
             alert.setTitle("Congratulations!");                         
             alert.setHeaderText("");
             alert.setContentText("O player is the winner !");
             alert.showAndWait();
             lbl.setText("\n\t\t     Let's Start ! X turn");
             btn1.setText("");
             btn2.setText("");
             btn3.setText("");
             btn4.setText("");
             btn5.setText("");
             btn6.setText("");
             btn7.setText("");
             btn8.setText("");
             btn9.setText("");
            }
            if ((btn1.getText()=="X" && btn2.getText()=="X"&&btn3.getText()=="X")|| (btn4.getText()=="X" && btn5.getText()=="X"&&btn6.getText()=="X")||(btn7.getText()=="X" && btn8.getText()=="X"&&btn9.getText()=="X")||((btn1.getText()=="X" && btn4.getText()=="X"&&btn7.getText()=="X")||(btn8.getText()=="X" && btn5.getText()=="X"&&btn2.getText()=="X")||(btn9.getText()=="X" && btn6.getText()=="X"&&btn3.getText()=="X")||(btn3.getText()=="X" && btn5.getText()=="X"&&btn7.getText()=="X")||(btn1.getText()=="X" && btn5.getText()=="X"&&btn9.getText()=="X")))
            {
             alert.setTitle("Congratulations!");                         
             alert.setHeaderText("");
             alert.setContentText("X player is the winner !");
             alert.showAndWait();
             lbl.setText("\n\t\t     Let's Start ! X turn");
             btn1.setText("");
             btn2.setText("");
             btn3.setText("");
             btn4.setText("");
             btn5.setText("");
             btn6.setText("");
             btn7.setText("");
             btn8.setText("");
             btn9.setText("");
            }
            if (btn1.getText()!="" && btn2.getText()!=""&&btn3.getText()!="" && btn4.getText()!="" && btn5.getText()!="" && btn6.getText()!="" && btn7.getText()!="" && btn8.getText()!="" && btn9.getText()!="")
            {
             alert.setTitle("Draw");                         
             alert.setHeaderText("");
             alert.setContentText("It's Draw !");
             alert.showAndWait();
             lbl.setText("\n\t\t     Let's Start ! X turn");
             btn1.setText("");
             btn2.setText("");
             btn3.setText("");
             btn4.setText("");
             btn5.setText("");
             btn6.setText("");
             btn7.setText("");
             btn8.setText("");
             btn9.setText("");
            }
            
        });
        btn9.setOnAction(e->{
            if((lbl.getText()== "\n\t\t     Let's Start ! X turn" || lbl.getText() == "\n\t\t\t\tX turn") && (btn9.getText()=="") )
            {
                btn9.setText("X");
                btn9.setFont(font);
                lbl.setText("\n\t\t\t\tO turn");            
            }
            else if (lbl.getText()== "\n\t\t\t\tO turn" && (btn9.getText()==""))
                {
                    btn9.setText("O");
                    btn9.setFont(font);
                    lbl.setText("\n\t\t\t\tX turn");
                }
            if ((btn1.getText()=="O" && btn2.getText()=="O"&&btn3.getText()=="O")|| (btn4.getText()=="O" && btn5.getText()=="O"&&btn6.getText()=="O")||(btn7.getText()=="O" && btn8.getText()=="O"&&btn9.getText()=="O")||((btn1.getText()=="O" && btn4.getText()=="O"&&btn7.getText()=="O")||(btn8.getText()=="O" && btn5.getText()=="O"&&btn2.getText()=="O")||(btn9.getText()=="O" && btn6.getText()=="O"&&btn3.getText()=="O")||(btn3.getText()=="O" && btn5.getText()=="O"&&btn7.getText()=="O")||(btn1.getText()=="O" && btn5.getText()=="O"&&btn9.getText()=="O")))
            {
             alert.setTitle("Congratulations!");                         
             alert.setHeaderText("");
             alert.setContentText("O player is the winner !");
             alert.showAndWait();
             lbl.setText("\n\t\t     Let's Start ! X turn");
             btn1.setText("");
             btn2.setText("");
             btn3.setText("");
             btn4.setText("");
             btn5.setText("");
             btn6.setText("");
             btn7.setText("");
             btn8.setText("");
             btn9.setText("");
            }
            if ((btn1.getText()=="X" && btn2.getText()=="X"&&btn3.getText()=="X")|| (btn4.getText()=="X" && btn5.getText()=="X"&&btn6.getText()=="X")||(btn7.getText()=="X" && btn8.getText()=="X"&&btn9.getText()=="X")||((btn1.getText()=="X" && btn4.getText()=="X"&&btn7.getText()=="X")||(btn8.getText()=="X" && btn5.getText()=="X"&&btn2.getText()=="X")||(btn9.getText()=="X" && btn6.getText()=="X"&&btn3.getText()=="X")||(btn3.getText()=="X" && btn5.getText()=="X"&&btn7.getText()=="X")||(btn1.getText()=="X" && btn5.getText()=="X"&&btn9.getText()=="X")))
            {
             alert.setTitle("Congratulations!");                         
             alert.setHeaderText("");
             alert.setContentText("X player is the winner !");
             alert.showAndWait();
             lbl.setText("\n\t\t     Let's Start ! X turn");
             btn1.setText("");
             btn2.setText("");
             btn3.setText("");
             btn4.setText("");
             btn5.setText("");
             btn6.setText("");
             btn7.setText("");
             btn8.setText("");
             btn9.setText("");
            }
            if (btn1.getText()!="" && btn2.getText()!=""&&btn3.getText()!="" && btn4.getText()!="" && btn5.getText()!="" && btn6.getText()!="" && btn7.getText()!="" && btn8.getText()!="" && btn9.getText()!="")
            {
             alert.setTitle("Draw");                        
             alert.setHeaderText("");
             alert.setContentText("It's Draw !");
             alert.showAndWait();
             lbl.setText("\n\t\t     Let's Start ! X turn");
             btn1.setText("");
             btn2.setText("");
             btn3.setText("");
             btn4.setText("");
             btn5.setText("");
             btn6.setText("");
             btn7.setText("");
             btn8.setText("");
             btn9.setText("");
            }
        });
        Reset.setOnAction(e->{
             lbl.setText("\n\t\t     Let's Start ! X turn");
             btn1.setText("");
             btn2.setText("");
             btn3.setText("");
             btn4.setText("");
             btn5.setText("");
             btn6.setText("");
             btn7.setText("");
             btn8.setText("");
             btn9.setText("");
        });
        primaryStage.setResizable(false);
        primaryStage.setTitle("Tic Tac Toe");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }   
}