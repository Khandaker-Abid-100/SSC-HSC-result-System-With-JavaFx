package org.example.resultsystem.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import org.example.resultsystem.HelloApplication;

public class FrontPageController {

    @FXML
    void prisear(ActionEvent event) {

        HelloApplication.changeScene("showPrivate");
    }
    @FXML
    void adre(ActionEvent event) {
        HelloApplication.changeScene("loginReq");
    }

    @FXML
    void pubsear(ActionEvent event) {
        HelloApplication.changeScene("showPublic");

    }

    @FXML
    void sear(ActionEvent event) {
        HelloApplication.changeScene("search");
    }

}
