package org.example.resultsystem.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import org.example.resultsystem.HelloApplication;
import org.example.resultsystem.databaseConnection.InfoDataStore;
import org.example.resultsystem.model.MarksInfoScience;

public class ShowPublicController {
    @FXML
    public TextField hscregfi;

    @FXML
   public TextField hscrfi;

    @FXML
   public TextField sscregfi;

    @FXML
   public TextField sscrfi;
    public static MarksInfoScience marksssc;
    public static MarksInfoScience markhsc;
    public static MarksInfoScience buet;

    @FXML
    void Search(ActionEvent event) {
        String sscRoll = sscrfi.getText();
        String sscReg = sscregfi.getText();
        String hscReg =hscregfi.getText();
        String hscRoll =hscrfi.getText();
        InfoDataStore infoDataStore = new InfoDataStore();
       marksssc = infoDataStore.resultGet(sscRoll,sscReg);
        markhsc = infoDataStore.resultGet(hscRoll,hscReg);


        HelloApplication.changeScene("viewPublic");
    }
    @FXML
    void back(ActionEvent event) {
        HelloApplication.changeScene("frontPage");
    }
}
