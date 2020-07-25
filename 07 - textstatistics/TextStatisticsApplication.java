package textstatistics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;
import java.util.Arrays;


public class TextStatisticsApplication extends Application{
    
    public void start(Stage window){
        BorderPane layout = new BorderPane();
        
        Label letters = new Label("Letters: 0");
        Label words = new Label("Words: 0");
        Label longest = new Label("The longest word is: ");
        TextArea area = new TextArea("");
        
        HBox text = new HBox();
        text.setSpacing(10);
        text.getChildren().addAll(letters, words, longest);
        
        area.textProperty().addListener((change, oldValue, newValue) -> {
            int characters = newValue.length();
            String parts[] = newValue.split(" ");
            int numberOfWords = parts.length;
            String longestWord = Arrays.stream(parts)
                    .sorted((s1, s2) -> s2.length() - s1.length())
                    .findFirst()
                    .get();
            
            letters.setText("Letters: " + String.valueOf(characters));
            words.setText("Words: " + String.valueOf(numberOfWords));
            longest.setText("The longest word is: " + longestWord);  
        });
        
        layout.setCenter(area);
        layout.setBottom(text);
        
        Scene view = new Scene(layout);
        
        window.setScene(view);
        window.show();
    }


    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

}
