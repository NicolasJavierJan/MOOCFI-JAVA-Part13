package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.geometry.Insets;
import javafx.geometry.Pos;


public class JokeApplication extends Application {
    
    public void start(Stage window){
        // Main layout
        BorderPane layout = new BorderPane();
        
        // Joke Menu
        HBox menu = new HBox();
        menu.setPadding(new Insets(20, 20, 20, 20));
        menu.setSpacing(10);
        
        Button joke = new Button("Joke");
        Button answer = new Button("Answer");
        Button explanation = new Button("Explanation");
        
        menu.getChildren().addAll(joke, answer, explanation);
        
        layout.setTop(menu);
        
        // Sub-views
        StackPane jokeLayout = createView("What do you call a bear with no teeth?");
        StackPane answerLayout = createView("A gummy bear.");
        StackPane explanationLayout = createView("Gummy... because gums, like the mouth gums. Get it? Explanations are hard");
        
        // Events
        joke.setOnAction((event) -> layout.setCenter(jokeLayout));
        answer.setOnAction((event) -> layout.setCenter(answerLayout));
        explanation.setOnAction((event) -> layout.setCenter(explanationLayout));
        
        layout.setCenter(jokeLayout);
        
        Scene scene = new Scene(layout);
        
        window.setScene(scene);
        window.show();
    }
    
    private StackPane createView(String text){
        StackPane layout = new StackPane();
        layout.setPrefSize(600, 300);
        layout.getChildren().add(new Label(text));
        layout.setAlignment(Pos.CENTER);
        
        return layout;
    }


    public static void main(String[] args) {
        launch(JokeApplication.class);
    }
}
