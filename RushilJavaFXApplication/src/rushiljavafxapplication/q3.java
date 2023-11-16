
package rushiljavafxapplication;

import java.util.*;
import java.awt.Color;
import java.awt.Paint;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author student
 */
public class q3 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Label l=new Label("Welcome");
        Label l1=new Label("User Name: ");
        TextField t1=new TextField();
        Label l2=new Label("Password: ");
        PasswordField t2=new PasswordField();
        Label l3=new Label("");
        
        Button b1 = new Button();
        b1.setText("Sign in");
        
        
        b1.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                String s=t1.getText();
                l3.setText("Welcome "+s);
                }
            });
        
        GridPane root = new GridPane();
        root.add(l,0,0);
        root.add(l1,0,1);
        root.add(t1,1,1);
        root.add(l2,0,2);
        root.add(t2,1,2);
        root.add(l3,0,3);
        root.add(b1,1,3);
        
        //root.getChildren().add(l2);

        
        Scene scene = new Scene(root, 500, 200);
        
        primaryStage.setTitle("JavaFX Welcome");
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