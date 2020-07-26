package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.layout.GridPane;

public class MultipleViews extends Application{
    
    public void start(Stage window){
        // First Screen
        BorderPane firstScreen = new BorderPane();
        firstScreen.setTop(new Label("First view!"));
        Button toSecond = new Button("To the second view!");
        firstScreen.setCenter(toSecond);
        
        Scene first = new Scene(firstScreen);
        
        // Second Screen
        VBox secondScreen = new VBox();
        Button toThird = new Button("To the third view!");
        secondScreen.getChildren().add(toThird);
        secondScreen.getChildren().add(new Label("Second view!"));
        
        Scene second = new Scene(secondScreen);
        
        // Third Screen
        GridPane thirdScreen = new GridPane();
        thirdScreen.add(new Label("Third screen!"), 0, 0);
        Button toFirst = new Button("To the first view!");
        thirdScreen.add(toFirst, 1, 1);
        
        Scene third = new Scene(thirdScreen);
        
        toSecond.setOnAction((event) -> {
            window.setScene(second);
        });
        
        toThird.setOnAction((event) -> {
            window.setScene(third);
        });
        
        toFirst.setOnAction((event) -> {
            window.setScene(first);
        });
        
        window.setScene(first);
        window.show();
        
    }

    public static void main(String[] args) {
        launch(MultipleViews.class);
    }

}
