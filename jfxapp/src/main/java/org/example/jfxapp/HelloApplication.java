package org.example.jfxapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
       Group root = new Group();
       Scene scene = new Scene(root,600,600, Color.LIGHTSKYBLUE);
       Stage stage = new Stage();

       Text text = new Text();
       text.setText("HELLO JAVAFX");
       text.setX(50);
       text.setY(50);
       text.setFont(Font.font("Verdana",50));

       Line line = new Line();
       line.setStartX(200);
       line.setStartY(200);
       line.setEndX(500);
       line.setEndY(200);
       root.getChildren().add(text);
       root.getChildren().add(line);
       stage.setScene(scene);
       stage.show();
    }
}
