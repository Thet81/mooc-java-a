package com.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage window) throws IOException {
       BorderPane layout = new BorderPane();
      

       HBox buttons = new HBox();
       buttons.setSpacing(10);
       buttons.getChildren().add(new Button("First"));
       buttons.getChildren().add(new Button("Second"));
       buttons.getChildren().add(new Button("Third"));

       VBox texts = new VBox();
       texts.setSpacing(10);
       texts.getChildren().add(new Label("First"));
       texts.getChildren().add(new Label("Second"));
       texts.getChildren().add(new Label("Third"));

       layout.setTop(buttons);
       layout.setLeft(texts);

       Scene view = new Scene(layout);

       window.setScene(view);
       window.show();
    }

    public static void main(String[] args) {
        launch(App.class);
    }

}