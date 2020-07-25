package textstatistics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;


public class TextStatisticsApplication extends Application{
    
    public void start(Stage window){
        BorderPane layout = new BorderPane();
        
        HBox text = new HBox();
        text.setSpacing(10);
        text.getChildren().add(new Label("Letters: 0"));
        text.getChildren().add(new Label("Words: 0"));
        text.getChildren().add(new Label("The longest word is:"));
        
        layout.setCenter(new TextArea(""));
        layout.setBottom(text);
        
        Scene view = new Scene(layout);
        
        window.setScene(view);
        window.show();
    }


    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

}
