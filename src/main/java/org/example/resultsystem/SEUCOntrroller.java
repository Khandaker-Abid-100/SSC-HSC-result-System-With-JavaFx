package org.example.resultsystem;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import org.example.resultsystem.databaseConnection.InfoDataStore;
import org.example.resultsystem.model.Versity;

public class SEUCOntrroller {

    @FXML
    public TextField totalgpaField;

    @FXML
    public TextField yearField;
    @FXML
    void submit(ActionEvent event) {
        String year = yearField.getText();
        double gpa = Double.parseDouble(totalgpaField.getText());
        InfoDataStore infoDataStore = new InfoDataStore();
        Versity versity = new Versity(year,gpa);
        infoDataStore.insertseu(versity);
    }

}


