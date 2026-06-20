package com.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
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
       layout.setTop(new Label("top"));
       layout.setRight(new Label("right"));
       layout.setBottom(new Label("bottom"));
       layout.setLeft(new Label("left"));
       layout.setCenter(new Label("center"));

       Scene view = new Scene(layout);

       window.setScene(view);
       window.show();
    }

    public static void main(String[] args) {
        launch(App.class);
    }

}