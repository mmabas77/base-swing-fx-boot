package com.mmabas77.baseswingfxboot.ui.fx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainForm extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/main-form/sample.fxml"));
        stage.setTitle("Main Form");
        stage.setScene(new Scene(root, 200, 200));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
