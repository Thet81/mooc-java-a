package com.example;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.util.Arrays;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage window) throws IOException {
        Parameters params = getParameters();
        String organization = params.getNamed().get("organization");
        String course = params.getNamed().get("course");

        window.setTitle(organization + " : " + course);
        
        Button back = new Button("...back");
        Button forth = new Button("...forth");

        Scene first = new Scene(back);
        Scene second = new Scene(forth);

        back.setOnAction((event)-> {
            window.setScene(second);
        });

        forth.setOnAction((event)-> {
            window.setScene(first);
        });

        window.setScene(first);
        window.show();
    }

    // public static void main(String[] args) {
    //     launch(App.class);
    // }

}