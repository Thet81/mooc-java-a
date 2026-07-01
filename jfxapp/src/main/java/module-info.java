module org.example.jfxapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.jfxapp to javafx.fxml;
    exports org.example.jfxapp;
}