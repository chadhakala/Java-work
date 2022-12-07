package com.example.helloworldjavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Hello World!");
    }
    @FXML
    protected void onOtherButtonClick(ActionEvent actionEvent) {
    welcomeText.setText("Oh no!, You Clicked the Button!");
    }
}