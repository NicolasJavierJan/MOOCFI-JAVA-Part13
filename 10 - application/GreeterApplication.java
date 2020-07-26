package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.layout.StackPane;

public class GreeterApplication extends Application {
    
    public void start(Stage window){
        // Components
        Label instructionText = new Label("Enter your name and start.");
        TextField text = new TextField();
        Button startButton = new Button("Start");
        
        // Layout Screen One
        
        VBox firstScreen = new VBox();
        firstScreen.getChildren().add(instructionText);
        firstScreen.getChildren().add(text);
        firstScreen.getChildren().add(startButton);
        
        firstScreen.setPrefSize(300, 180);
        firstScreen.setAlignment(Pos.CENTER);
        firstScreen.setPadding(new Insets(20, 20, 20, 20));
        firstScreen.setSpacing(10);
        
        Scene first = new Scene(firstScreen);
        
        // Layout Screen Two    
        
        StackPane welcome = new StackPane();
        welcome.setPrefSize(300, 180);
        welcome.setAlignment(Pos.CENTER);
        
        Scene second = new Scene(welcome);
        
        // Event handler
        
        startButton.setOnAction((event) -> {
            String name = text.getText();
            Label welcomeText = new Label("Welcome " + name + "!"); 
            welcome.getChildren().add(welcomeText);  
            window.setScene(second);
        });
        
        window.setScene(first);
        window.show();                
    }


    public static void main(String[] args) {
        launch(GreeterApplication.class);
    }
}
