package buttonandtextfield;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ButtonAndTextFieldApplication extends Application{
    
    public void start(Stage window){
        Button button = new Button("Button! Button!!");
        TextField text = new TextField("Helloooo!");
        
        FlowPane componentGroup = new FlowPane();
        componentGroup.getChildren().add(button);
        componentGroup.getChildren().add(text);
        
        Scene view = new Scene(componentGroup);
        
        window.setScene(view);
        window.show();
    }


    public static void main(String[] args) {
        launch(ButtonAndTextFieldApplication.class);
    }

}
