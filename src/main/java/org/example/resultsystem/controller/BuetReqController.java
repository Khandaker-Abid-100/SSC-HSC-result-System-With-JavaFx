package org.example.resultsystem.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.example.resultsystem.HelloApplication;
import org.example.resultsystem.databaseConnection.InfoDataStore;
import org.example.resultsystem.model.MarksInfoScience;

public class BuetReqController {

    @FXML
   public TextField banField;

    @FXML
   public Label banLebel;

    @FXML
   public Label banLebel1;

    @FXML
   public TextField bioField;

    @FXML
   public Label bioLebel;

    @FXML
   public TextField chemField;

    @FXML
   public Label chemLebel;

    @FXML
   public TextField enField;

    @FXML
   public Label engLebel;

    @FXML
    public Label good;

    @FXML
    public TextField hmField;

    @FXML
   public Label hmLebel;

    @FXML
   public TextField hscpoint;

    @FXML
    public TextField ictField;

    @FXML
    public Label ictLebel;

    @FXML
    public Label phyLebel;

    @FXML
   public TextField physicsField;

    @FXML
    void sc(ActionEvent event) {
        HelloApplication.changeScene("setRequirement");
    }

    @FXML
    void submit(ActionEvent event) {
        String banName = banLebel.getText();
        String engName = engLebel.getText();
        String hmName = hmLebel.getText();
        String phyName = phyLebel.getText();
        String chemName = chemLebel.getText();
        String ictName = ictLebel.getText();
        String bioName = bioLebel.getText();
        //String yearN = hscpoint.getText();
       // int year = Integer.parseInt(yearN);
        String banglast  =banField.getText();
        String biost  =bioField.getText();
        String      chemst  = chemField.getText();
        String       engst  =enField.getText();
        String       hmst  =hmField.getText();
        String        ictst  =ictField.getText();
        String       physt  =physicsField.getText();
        if (banglast.equals("")){
            banglast = "0";
        } if (biost.equals("")){
            biost = "0";
        } if (chemst.equals("")){
            chemst = "0";
        } if (engst.equals("")){
            engst = "0";
        } if (hmst.equals("")){
            hmst = "0";
        } if (ictst.equals("")){
            ictst = "0";
        } if (physt.equals("")){
            physt = "0";
        }
        double bangla = Double.parseDouble(banglast);
        double bio         =  Double.parseDouble( biost);
        double      chem    =  Double.parseDouble( chemst);
        double       eng  = Double.parseDouble( engst);
        double        hm = Double.parseDouble( hmst);
        double        ict =  Double.parseDouble( ictst);
        double        phy =  Double.parseDouble( physt);
        //MarksInfoScience marksInfoScience1 = new MarksInfoScience(hm,phy,chem,yearN);
        //HelloApplication.Bu = marksInfoScience1;
        if (bangla==0&&bio==0&&ict==0&&eng==0) {

            MarksInfoScience marksInfoScience2 = new MarksInfoScience(hm,phy,chem);


        }
    }

}
