package org.example.resultsystem.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import org.example.resultsystem.HelloApplication;

import java.net.URL;
import java.util.ResourceBundle;

public class AddMarksController implements Initializable {
    @FXML
    public Label nameLabel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        nameLabel.setText(HelloApplication.info.getName());
    }
}
