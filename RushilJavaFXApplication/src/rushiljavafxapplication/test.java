/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
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
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author student
 */
public class test extends Application {

    @Override
    public void start(Stage primaryStage) {
        Label l1 = new Label("Enter first number: ");
        TextField t1 = new TextField();
        Label l2 = new Label("Enter second number: ");
        TextField t2 = new TextField();
        Label l3 = new Label("Result");
        TextField t3 = new TextField();
        HBox h1 = new HBox();
        HBox h2 = new HBox();
        HBox h3 = new HBox();

        h1.getChildren().addAll(l1, t1);
        h2.getChildren().addAll(l2, t2);
        h3.getChildren().addAll(l3, t3);

        Button b1 = new Button();
        b1.setText("Find GCD");

        b1.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                int gcd = 1;
                String s = t1.getText();
                int a = Integer.parseInt(s);
                s = t2.getText();
                int b = Integer.parseInt(s);
                for (int i = 1; i <= a && i <= b; i++) {
                    if (a % i == 0 && b % i == 0)
                        gcd = i;
                }
                t3.setText("" + gcd);
            }
        });

        VBox root = new VBox();
        root.getChildren().addAll(h1, h2, h3, b1);
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