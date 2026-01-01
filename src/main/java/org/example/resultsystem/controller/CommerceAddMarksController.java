package org.example.resultsystem.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import org.example.resultsystem.HelloApplication;
import org.example.resultsystem.databaseConnection.InfoDataStore;
import org.example.resultsystem.model.MarksInfoScience;

public class CommerceAddMarksController {
    @FXML
    public ToggleGroup CS;
    @FXML
   public TextField AccountingField;

    @FXML
   public Label AccountingLebel;

    @FXML
   public TextField FinanceField;

    @FXML
   public Label FinanceLebel;

    @FXML
   public TextField MarketingField;

    @FXML
   public Label MarketingLebel;

    @FXML
   public TextField banField;

    @FXML
   public Label banLebel;

    @FXML
  public TextField managementField;

    @FXML
  public TextField enField;

    @FXML
  public Label engLebel;

    @FXML
   public Label good;

    @FXML
   public TextField ictField;

    @FXML
   public Label ictLebel;

    @FXML
   public Label managementLebel;



    @FXML
    void submit(ActionEvent event) {
        RadioButton radioButton = (RadioButton) CS.getSelectedToggle();
        String optional = radioButton.getText();
        String banName = banLebel.getText();
        String engName = engLebel.getText();
        String manageName = managementLebel.getText();
        String accountingName = AccountingLebel.getText();
        String  MarketingName= MarketingLebel.getText();
        String ictName = ictLebel.getText();
        String FinanceName = FinanceLebel.getText();
        double bangla = Double.parseDouble(banField.getText());
        double manage         =  Double.parseDouble( managementField.getText());
        double      accounting    =  Double.parseDouble( AccountingField.getText());
        double       eng  = Double.parseDouble( enField.getText());
        double        Marketing = Double.parseDouble( MarketingField.getText());
        double        ict =  Double.parseDouble( ictField.getText());
        double        Finance =  Double.parseDouble( FinanceField.getText());
        double finalGpa = HelloApplication.getFinalGpa(HelloApplication.getPoint(bangla),
                HelloApplication.getPoint(eng),HelloApplication.getPoint(accounting),HelloApplication.getPoint(Marketing),
                HelloApplication.getPoint(manage),HelloApplication.getPoint(Finance),
                HelloApplication.getPoint(ict),optional);
        String finalGrade = HelloApplication.getGradePoint(HelloApplication.getFinalGpa(HelloApplication.getPoint(bangla),
                HelloApplication.getPoint(eng),HelloApplication.getPoint(accounting),HelloApplication.getPoint(Marketing),
                HelloApplication.getPoint(manage),HelloApplication.getPoint(Finance),
                HelloApplication.getPoint(ict),optional));
        MarksInfoScience marksInfoScience = new MarksInfoScience(bangla,eng,accounting,Marketing,manage,Finance,ict,HelloApplication.getGrade(bangla),
                HelloApplication.getGrade(eng),HelloApplication.getGrade(accounting),
                HelloApplication.getGrade(Marketing),HelloApplication.getGrade(manage),
                HelloApplication.getGrade(Finance),HelloApplication.getGrade(ict),finalGpa,finalGrade) ;
        HelloApplication.result = marksInfoScience;
        MarksInfoScience sub1 = new MarksInfoScience(banName,bangla,HelloApplication.getGrade(bangla));
        MarksInfoScience sub2 = new MarksInfoScience(engName,eng,HelloApplication.getGrade(eng));
        MarksInfoScience sub3 = new MarksInfoScience(accountingName,accounting,HelloApplication.getGrade(accounting));
        MarksInfoScience sub4 = new MarksInfoScience(MarketingName,Marketing,HelloApplication.getGrade(Marketing));
        MarksInfoScience sub5 = new MarksInfoScience(FinanceName,Finance,HelloApplication.getGrade(Finance));
        MarksInfoScience sub6 = new MarksInfoScience(manageName,manage,HelloApplication.getGrade(manage));
        MarksInfoScience sub7 = new MarksInfoScience(ictName,ict,HelloApplication.getGrade(ict));
        InfoDataStore infoDataStore = new InfoDataStore();
        boolean isMarks =infoDataStore.insertScienceMarks(HelloApplication.result);
        infoDataStore.insertSubject(sub1);
        infoDataStore.insertSubject(sub2);
        infoDataStore.insertSubject(sub3);
        infoDataStore.insertSubject(sub4);
        infoDataStore.insertSubject(sub5);
        infoDataStore.insertSubject(sub6);
        infoDataStore.insertSubject(sub7);
        if (isMarks){
            good.setText("very good");
        }else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("wrong");
            alert.showAndWait();
        }
    }

    @FXML
    void cr(ActionEvent event) {
        HelloApplication.changeScene("createStudent");
    }

}
