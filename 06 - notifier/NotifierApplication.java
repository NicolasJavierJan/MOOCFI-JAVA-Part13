package notifier;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

public class NotifierApplication extends Application{
    
    public void start(Stage window){       
        TextField field = new TextField();
        Button button = new Button("Update");
        Label label = new Label();
        
        button.setOnAction((event) -> {
            label.setText(field.getText());
        });        
        
        VBox elements = new VBox();
        elements.getChildren().addAll(field, button, label);
        
        
        Scene view = new Scene(elements);
        
        window.setScene(view);
        window.show();
    }


    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }

}
