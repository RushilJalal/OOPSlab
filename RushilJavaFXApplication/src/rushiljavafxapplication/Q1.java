package rushiljavafxapplication;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author student
 */
public class Q1 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Label l1 = new Label("Welcome to JavaFX programming");
        l1.setTextFill(Color.MAGENTA);
        FlowPane root = new FlowPane();
        root.setHgap(100);
        root.setVgap(100);
        root.getChildren().add(l1);        
        Scene scene = new Scene(root, 500, 200);
        
        primaryStage.setTitle("This is the first JavaFX Application");
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
