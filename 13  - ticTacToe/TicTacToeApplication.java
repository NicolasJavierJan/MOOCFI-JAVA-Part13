package ticTacToe;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.Node;
import javafx.stage.Stage;

public class TicTacToeApplication extends Application{
    
    public void start(Stage stage){
        BorderPane layout = new BorderPane();        
        GridPane gridLayout = new GridPane();

        Label nextTurn = new Label("Turn: X");
        nextTurn.setFont(Font.font("Monospaced", 40));      
        
        layout.setTop(nextTurn);
        layout.setCenter(gridLayout);
                
        for (int x = 0; x < 3; x++){
            for (int y = 0; y < 3; y++){                
                Button btn = new Button(" ");
                btn.setFont(Font.font("Monospaced", 40));
                gridLayout.add(btn, x, y);  
                btn.setOnAction((event) -> {
                    String parts[] = nextTurn.getText().split(" ");
                    if (parts[1].equals("O") || parts[1].equals("X")){
                        if (btn.getText().equals(" ")){
                            btn.setText(parts[1]);
                            if (parts[1].equals("X")){
                            nextTurn.setText("Turn: O");
                        } else {
                            nextTurn.setText("Turn: X");
                            }
                        } 
                        
                        // Conditions
                        if (hasX(gridLayout, 0, 0) && hasX(gridLayout, 1, 0) && hasX(gridLayout, 2, 0) || hasO(gridLayout, 0, 0) && hasO(gridLayout, 1, 0) && hasO(gridLayout, 2, 0)){
                            nextTurn.setText("The end!");
                        } else if (hasX(gridLayout, 0, 1) && hasX(gridLayout, 1, 1) && hasX(gridLayout, 2, 1) || hasO(gridLayout, 0, 1) && hasO(gridLayout, 1, 1) && hasO(gridLayout, 2, 1)){
                           nextTurn.setText("The end!"); 
                        } else if (hasX(gridLayout, 0, 2) && hasX(gridLayout, 1, 2) && hasX(gridLayout, 2, 2) || hasO(gridLayout, 0, 2) && hasO(gridLayout, 1, 2) && hasO(gridLayout, 2, 2)){
                           nextTurn.setText("The end!"); 
                        } else if (hasX(gridLayout, 0, 0) && hasX(gridLayout, 0, 1) && hasX(gridLayout, 0, 2) || hasO(gridLayout, 0, 0) && hasO(gridLayout, 0, 1) && hasO(gridLayout, 0, 2)){
                           nextTurn.setText("The end!"); 
                        } else if (hasX(gridLayout, 1, 0) && hasX(gridLayout, 1, 1) && hasX(gridLayout, 1, 2) || hasO(gridLayout, 1, 0) && hasO(gridLayout, 1, 1) && hasO(gridLayout, 1, 2)){
                           nextTurn.setText("The end!"); 
                        } else if (hasX(gridLayout, 2, 0) && hasX(gridLayout, 2, 1) && hasX(gridLayout, 2, 2) || hasO(gridLayout, 2, 0) && hasO(gridLayout, 2, 1) && hasO(gridLayout, 2, 2)){
                           nextTurn.setText("The end!"); 
                        } else if (hasX(gridLayout, 0, 0) && hasX(gridLayout, 1, 1) && hasX(gridLayout, 2, 2) || hasO(gridLayout, 0, 0) && hasO(gridLayout, 1, 1) && hasO(gridLayout, 2, 2)){
                           nextTurn.setText("The end!"); 
                        } else if (hasX(gridLayout, 0, 2) && hasX(gridLayout, 1, 1) && hasX(gridLayout, 2, 0) || hasO(gridLayout, 0, 2) && hasO(gridLayout, 1, 1) && hasO(gridLayout, 2, 0)){
                           nextTurn.setText("The end!"); 
                        }                        
                    }
                });
            }
        }
        
        
        
        Scene view = new Scene(layout);
        
        stage.setScene(view);
        stage.show();
    }

    private boolean hasX(GridPane gridPane, int col, int row){
        for (Node node : gridPane.getChildren()){
            if (GridPane.getColumnIndex(node) == col && GridPane.getRowIndex(node) == row){
                if (node.toString().contains("X")){
                    return true;
                }
            }
        }
        return false;
    }
    
    private boolean hasO(GridPane gridPane, int col, int row){
        for (Node node : gridPane.getChildren()){
            if (GridPane.getColumnIndex(node) == col && GridPane.getRowIndex(node) == row){
                if (node.toString().contains("O")){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        launch(TicTacToeApplication.class);
    }

}
