package org.example.resultsystem.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import org.example.resultsystem.HelloApplication;
import org.example.resultsystem.databaseConnection.InfoDataStore;
import org.example.resultsystem.model.MarksInfoScience;

public class CommerceHscAddMarksController {

    @FXML
    public TextField AccountingField;

    @FXML
    public TextField AccountingField1;

    @FXML
   public Label AccountingLebel;

    @FXML
    public Label AccountingLebel1;

    @FXML
   public ToggleGroup CSH;

    @FXML
    public TextField FinanceField;

    @FXML
   public TextField FinanceField1;

    @FXML
    public Label FinanceLebel;

    @FXML
    public Label FinanceLebel1;

    @FXML
   public TextField MarketingField;

    @FXML
    public TextField MarketingField1;

    @FXML
    public Label MarketingLebel;

    @FXML
   public Label MarketingLebel1;

    @FXML
   public TextField banField;

    @FXML
    public TextField banField1;

    @FXML
    public Label banLebel;

    @FXML
    public Label banLebel1;

    @FXML
   public TextField enField;

    @FXML
   public TextField enField1;

    @FXML
   public Label engLebel;

    @FXML
   public Label engLebel1;

    @FXML
   public Label good;

    @FXML
    public TextField ictField;

    @FXML
   public Label ictLebel;

    @FXML
   public TextField managementField;

    @FXML
   public TextField managementField1;

    @FXML
    public Label managementLebel;

    @FXML
    public Label managementLebel1;

    @FXML
    void cr(ActionEvent event) {
        HelloApplication.changeScene("createStudent");
    }

    @FXML
    void submit(ActionEvent event) {
        RadioButton radioButton = (RadioButton) CSH.getSelectedToggle();
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
        double bangla1 = Double.parseDouble(banField1.getText());
        double manage1         =  Double.parseDouble( managementField1.getText());
        double      accounting1    =  Double.parseDouble( AccountingField1.getText());
        double       eng1  = Double.parseDouble( enField1.getText());
        double        Marketing1 = Double.parseDouble( MarketingField1.getText());
        double        Finance1 =  Double.parseDouble( FinanceField1.getText());
        double b = bangla +bangla1;
        double e = eng1 +eng;
        double h = manage+manage1;
        double p = Marketing +Marketing1;
        double c = accounting +accounting1;
        double bi = Finance +Finance1;

//        double finalGpa = HelloApplication.getFinalGpa(HelloApplication.getPoint(bangla),
//                HelloApplication.getPoint(eng),HelloApplication.getPoint(accounting),
//                HelloApplication.getPoint(Marketing),
//                HelloApplication.getPoint(manage),HelloApplication.getPoint(Finance),
//                HelloApplication.getPoint(ict),optional);
        double finalGpa = HelloApplication.getFinalGpa(HelloApplication.getPointHsc(b),
                HelloApplication.getPointHsc(e),HelloApplication.getPointHsc(h),HelloApplication.getPointHsc(p),
                HelloApplication.getPointHsc(c),HelloApplication.getPointHsc(bi),
                HelloApplication.getPoint(ict),optional);
//        String finalGrade = HelloApplication.getGradePoint(HelloApplication.getFinalGpa(HelloApplication.getPoint(bangla),
//                HelloApplication.getPoint(eng),HelloApplication.getPoint(accounting),HelloApplication.getPoint(Marketing),
//                HelloApplication.getPoint(manage),HelloApplication.getPoint(Finance),
//                HelloApplication.getPoint(ict),optional));
        String finalGrade = HelloApplication.getGradePoint
                (HelloApplication.getFinalGpa(HelloApplication.getPointHsc(b),
                        HelloApplication.getPointHsc(e),HelloApplication.getPointHsc(h),HelloApplication.getPointHsc(p),
                        HelloApplication.getPointHsc(c),HelloApplication.getPointHsc(bi),
                        HelloApplication.getPoint(ict),optional));

        MarksInfoScience marksInfoScience = new MarksInfoScience(bangla,eng,accounting,Marketing,manage,Finance,ict,HelloApplication.getGrade(bangla),
                HelloApplication.getGrade(eng),HelloApplication.getGrade(accounting),
                HelloApplication.getGrade(Marketing),HelloApplication.getGrade(manage),
                HelloApplication.getGrade(Finance),HelloApplication.getGrade(ict),finalGpa,finalGrade) ;
        HelloApplication.result = marksInfoScience;
        MarksInfoScience sub1 = new MarksInfoScience(banName,b,HelloApplication.getGradeHsc(bangla));
        MarksInfoScience sub2 = new MarksInfoScience(engName,e,HelloApplication.getGradeHsc(eng));
        MarksInfoScience sub3 = new MarksInfoScience(accountingName,c,HelloApplication.getGradeHsc(accounting));
        MarksInfoScience sub4 = new MarksInfoScience(MarketingName,p,HelloApplication.getGradeHsc(Marketing));
        MarksInfoScience sub5 = new MarksInfoScience(FinanceName,bi,HelloApplication.getGradeHsc(Finance));
        MarksInfoScience sub6 = new MarksInfoScience(manageName,h,HelloApplication.getGradeHsc(manage));
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

}
