/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package javafxapplication1;

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
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author student
 */
public class q2 extends Application {

    @Override
    public void start(Stage primaryStage) {
        Label l1 = new Label("Enter number: ");
        TextField t1 = new TextField();
        HBox h = new HBox();
        h.getChildren().addAll(l1, t1);
        Label l2 = new Label("");
        l1.setStyle("-fx-text-fill: magenta;");
        Button b1 = new Button();
        b1.setText("Print Table");
        b1.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                String s = t1.getText();
                int n = Integer.parseInt(s);
                for (int i = 1; i < 11; i++) {
                    l2.setText(l2.getText() + n * i + "\n");
                }
            }
        });

        FlowPane root = new FlowPane();
        root.setVgap(20.0);
        root.setHgap(20.0);
        root.getChildren().addAll(h, b1, l2);
        // root.getChildren().add(l2);

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
