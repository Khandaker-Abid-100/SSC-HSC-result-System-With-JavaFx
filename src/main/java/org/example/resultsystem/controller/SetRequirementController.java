package org.example.resultsystem.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import org.example.resultsystem.HelloApplication;

public class SetRequirementController {

    @FXML
    void Buet(ActionEvent event) {
        HelloApplication.changeScene("buetReq");
    } @FXML
    void seu(ActionEvent event) {HelloApplication.changeScene("seu");
    }

}
