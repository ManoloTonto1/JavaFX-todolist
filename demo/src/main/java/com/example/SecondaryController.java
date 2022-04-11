package com.example;

import java.io.IOException;

import Models.List;
import Models.User;
import Models.List;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

public class SecondaryController {
    List list = List.getInstance();
    User user = User.getInstance();
    public Button logout;
    public Button submitListItem;
    public ListView listview = new ListView();
    public TextField listInput;


    @FXML
    private void Logout() throws IOException {
        user.logout();
        App.setRoot("primary");
    }

    @FXML
    private void submitListItem(){
        list.getList().add(listInput.getText());

        ShowListItems();
    }

    @FXML
    private void ShowListItems(){
        listview.getItems().add(listInput.getText());

    }
}