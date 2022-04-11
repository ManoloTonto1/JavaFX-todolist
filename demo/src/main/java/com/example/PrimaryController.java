package com.example;

import java.io.IOException;

import Models.User;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class PrimaryController {


    public TextField usernameField;
    User user = User.getInstance();
    @FXML
    private void Login() throws IOException {
        user.login(usernameField.getText());
        if(user.isLogged()) {
            App.setRoot("secondary");
        }
    }
}
