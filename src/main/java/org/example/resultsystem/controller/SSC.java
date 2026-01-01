package org.example.resultsystem.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import org.example.resultsystem.HelloApplication;
import org.example.resultsystem.databaseConnection.InfoDataStore;
import org.example.resultsystem.model.MarksInfoScience;

public class SSC {

    @FXML
   public TextField banField;

    @FXML
    public Label banLebel;

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
   public TextField ictField;

    @FXML
   public Label ictLebel;

    @FXML
    public ToggleGroup s;

    @FXML
    public Label phyLebel;

    @FXML
    public TextField physicsField;

    @FXML
    void sc(ActionEvent event) {
        HelloApplication.changeScene("createStudent");
    }

    @FXML
    void submit(ActionEvent event) {
        RadioButton radioButton = (RadioButton) s.getSelectedToggle();
        String optional = radioButton.getText();
        String banName = banLebel.getText();
        String engName = engLebel.getText();
//        String banName1 = banLebel1.getText();
//        String engName1 = engLebel1.getText();
        String ictName = ictLebel.getText();
        String hmName = hmLebel.getText();
        String phyName = phyLebel.getText();
        String chemName = chemLebel.getText();
        String bioName = bioLebel.getText();
//        String hmName1 = hmLebel1.getText();
//        String phyName1 = phyLebel1.getText();
//        String chemName1 = chemLebel1.getText();
//        String bioName1 = bioLebel1.getText();

        double bangla = Double.parseDouble(banField.getText());
     //   double bangla1 = Double.parseDouble(banField1.getText());
        double    ict =  Double.parseDouble( ictField.getText());
        double   eng  = Double.parseDouble( enField.getText());
      //  double   eng1  = Double.parseDouble( enField1.getText());
        double   bio  =  Double.parseDouble( bioField.getText());
        double  chem  =  Double.parseDouble( chemField.getText());
        double     hm = Double.parseDouble( hmField.getText());
        double    phy =  Double.parseDouble( physicsField.getText());
//        double   bio1  =  Double.parseDouble( bioField1.getText());
//        double  chem1  =  Double.parseDouble( chemField1.getText());
//        double     hm1 = Double.parseDouble( hmField1.getText());
//        double    phy1 =  Double.parseDouble( physicsField1.getText());
//        double b = bangla +bangla1;
//        double e = eng1 +eng;
//        double h = hm1+hm;
//        double p = phy1 +phy;
//        double c = chem1 +chem;
//        double bi = bio +bio1;
        double finalGpa = HelloApplication.getFinalGpa(HelloApplication.getPoint(bangla),
                HelloApplication.getPoint(eng),HelloApplication.getPoint(hm),
                HelloApplication.getPoint(phy),
                HelloApplication.getPoint(chem),HelloApplication.getPoint(bio),
                HelloApplication.getPoint(ict),optional);
        //pore
        String finalGrade = HelloApplication.getGradePoint
                (HelloApplication.getFinalGpa(HelloApplication.getPoint(bangla),
                        HelloApplication.getPoint(eng),HelloApplication.getPoint(hm),
                        HelloApplication.getPoint(phy),
                        HelloApplication.getPoint(chem),HelloApplication.getPoint(bio),
                        HelloApplication.getPoint(ict),optional));

        //database create kora bak*******************************************
        //   MarksInfoScience marksInfoScience = new MarksInfoScience(HelloApplication.getGrade(bangla),HelloApplication.getGrade(eng),HelloApplication.getGrade(hm),HelloApplication.getGrade(phy),HelloApplication.getGrade(chem),HelloApplication.getGrade(bio),HelloApplication.getGrade(ict)) ;
        MarksInfoScience marksInfoScience = new MarksInfoScience(bangla,eng,hm,phy,chem,bio,ict,HelloApplication.getGrade(bangla),
                HelloApplication.getGrade(eng),HelloApplication.getGrade(hm),
                HelloApplication.getGrade(phy),HelloApplication.getGrade(chem),
                HelloApplication.getGrade(bio),HelloApplication.getGrade(ict),finalGpa,finalGrade) ;
        HelloApplication.result = marksInfoScience;
        MarksInfoScience sub1 = new MarksInfoScience(banName,bangla,HelloApplication.getGrade(bangla));
        MarksInfoScience sub2 = new MarksInfoScience(engName,eng,HelloApplication.getGrade(eng));
        MarksInfoScience sub3 = new MarksInfoScience(hmName,hm,HelloApplication.getGrade(hm));
        MarksInfoScience sub4 = new MarksInfoScience(phyName,phy,HelloApplication.getGrade(phy));
        MarksInfoScience sub5 = new MarksInfoScience(chemName,chem,HelloApplication.getGrade(chem));
        MarksInfoScience sub6 = new MarksInfoScience(bioName,bio,HelloApplication.getGrade(bio));
        //2nd paper
//        MarksInfoScience sub7 = new MarksInfoScience(banName1,bangla1,HelloApplication.getGrade(bangla1));
//        MarksInfoScience sub8 = new MarksInfoScience(engName1,eng1,HelloApplication.getGrade(eng1));
//        MarksInfoScience sub9 = new MarksInfoScience(hmName1,hm1,HelloApplication.getGrade(hm1));
//        MarksInfoScience sub10 = new MarksInfoScience(phyName1,phy1,HelloApplication.getGrade(phy1));
//        MarksInfoScience sub11 = new MarksInfoScience(chemName1,chem1,HelloApplication.getGrade(chem1));
//        MarksInfoScience sub12 = new MarksInfoScience(bioName1,bio1,HelloApplication.getGrade(bio1));
        MarksInfoScience sub7 = new MarksInfoScience(ictName,ict,HelloApplication.getGrade(ict));
        InfoDataStore infoDataStore = new InfoDataStore();
        boolean isMarks = infoDataStore.insertScienceMarks(HelloApplication.result);
        infoDataStore.insertSubject(sub1);
        infoDataStore.insertSubject(sub2);
        infoDataStore.insertSubject(sub3);
        infoDataStore.insertSubject(sub4);
        infoDataStore.insertSubject(sub5);
        infoDataStore.insertSubject(sub6);
        infoDataStore.insertSubject(sub7);
//        infoDataStore.insertSubject(sub8);
//        infoDataStore.insertSubject(sub9);
//        infoDataStore.insertSubject(sub10);
//        infoDataStore.insertSubject(sub11);
//        infoDataStore.insertSubject(sub12);
//        infoDataStore.insertSubject(sub13);
        if (isMarks){
            good.setText("very good");
        }else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("wrong");
            alert.showAndWait();
        }


    }

}
