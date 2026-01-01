package org.example.resultsystem.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import org.example.resultsystem.HelloApplication;
import org.example.resultsystem.databaseConnection.InfoDataStore;
import org.example.resultsystem.model.MarksInfoScience;

public class ArtsAddMarksController {
    @FXML
    public ToggleGroup AS;
    @FXML
    public TextField CivicField;

    @FXML
    public Label CivicLebel;

    @FXML
    public TextField EconomicsField;

    @FXML
   public Label EconomicsLebel;

    @FXML
   public TextField HistoryField;

    @FXML
  public Label HistoryLebel;

    @FXML
  public TextField SociologyField;

    @FXML
   public Label SociologyLebel;

    @FXML
    public TextField banField;

    @FXML
   public Label banLebel;

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
    void submit(ActionEvent event) {
        RadioButton radioButton = (RadioButton) AS.getSelectedToggle();
        String optional = radioButton.getText();
        String banName = banLebel.getText();
        String engName = engLebel.getText();
        String ciName = CivicLebel.getText();
        String soName = SociologyLebel.getText();
        String  hisName= HistoryLebel.getText();
        String ictName = ictLebel.getText();
        String echoName = EconomicsLebel.getText();
        double bangla = Double.parseDouble(banField.getText());
        double ci         =  Double.parseDouble( CivicField.getText());
        double      so   =  Double.parseDouble( SociologyField.getText());
        double       eng  = Double.parseDouble( enField.getText());
        double        his = Double.parseDouble( HistoryField.getText());
        double        ict =  Double.parseDouble( ictField.getText());
        double        echo =  Double.parseDouble( EconomicsField.getText());
        double finalGpa = HelloApplication.getFinalGpa(HelloApplication.getPoint(bangla),
                HelloApplication.getPoint(eng),HelloApplication.getPoint(so),HelloApplication.getPoint(his),
                HelloApplication.getPoint(ci),HelloApplication.getPoint(echo),
                HelloApplication.getPoint(ict),optional);
        String finalGrade = HelloApplication.getGradePoint(HelloApplication.getFinalGpa(HelloApplication.getPoint(bangla),
                HelloApplication.getPoint(eng),HelloApplication.getPoint(so),HelloApplication.getPoint(his),
                HelloApplication.getPoint(ci),HelloApplication.getPoint(echo),
                HelloApplication.getPoint(ict),optional));
        MarksInfoScience marksInfoScience = new MarksInfoScience(bangla,eng,so,his,ci,echo,ict,HelloApplication.getGrade(bangla),
                HelloApplication.getGrade(eng),HelloApplication.getGrade(so),
                HelloApplication.getGrade(his),HelloApplication.getGrade(ci),
                HelloApplication.getGrade(echo),HelloApplication.getGrade(ict),finalGpa,finalGrade) ;
        HelloApplication.result = marksInfoScience;
        MarksInfoScience sub1 = new MarksInfoScience(banName,bangla,HelloApplication.getGrade(bangla));
        MarksInfoScience sub2 = new MarksInfoScience(engName,eng,HelloApplication.getGrade(eng));
        MarksInfoScience sub3 = new MarksInfoScience(ciName,ci,HelloApplication.getGrade(ci));
        MarksInfoScience sub4 = new MarksInfoScience(soName,so,HelloApplication.getGrade(so));
        MarksInfoScience sub5 = new MarksInfoScience(hisName,his,HelloApplication.getGrade(his));
        MarksInfoScience sub6 = new MarksInfoScience(echoName,echo,HelloApplication.getGrade(echo));
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
    public void br(){
        HelloApplication.changeScene("createStudent");

    }
}
