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

        window.setTitle(organization + ":" + course);
        TextField leftText = new TextField();
        TextField rightText = new TextField();

        // leftText.textProperty().addListener(new ChangeListener<String>() {
        //     @Override
        //     public void changed(ObservableValue<? extends String> change, String oldValue, String newValue){
        //         System.out.println(oldValue + "->" + newValue);
        //         rightText.setText(newValue);
        //     }
        // });
        // ... is same as 
        leftText.textProperty().addListener((change,oldValue,newValue)-> {
            int characters = newValue.length();
            String[] parts = newValue.split(" ");
            int words = parts.length;

            String longest = Arrays.stream(parts)
                .sorted((s1, s2)-> s2.length() - s1.length())
                .findFirst()
                .get();
            rightText.setText(longest);
        }); 
        Button button = new Button ("Copy");

        button.setOnAction((event)-> {
            rightText.setText(leftText.getText());
        });

        HBox componentGroup = new HBox();
        componentGroup.setSpacing(20);
        componentGroup.getChildren().addAll(leftText,button,rightText);

       Scene view = new Scene(componentGroup);

       window.setScene(view);
       window.show();
    }

    // public static void main(String[] args) {
    //     launch(App.class);
    // }

}