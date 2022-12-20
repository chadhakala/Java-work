package com.example.boragontrail;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1111, 718);
        stage.setTitle("Boragon Trail" + " " + "Version 3.333 *repeating*");          //repeating of course
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch();


    }
}













