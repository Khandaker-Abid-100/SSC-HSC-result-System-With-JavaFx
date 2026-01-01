package org.example.resultsystem.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import org.example.resultsystem.HelloApplication;
import org.example.resultsystem.databaseConnection.InfoDataStore;
import org.example.resultsystem.model.MarksInfoScience;

public class ArtsHscAddMarksController {

    @FXML
    public ToggleGroup ASH;

    @FXML
    public TextField CivicField;

    @FXML
    public TextField CivicField1;

    @FXML
    public Label CivicLebel;

    @FXML
    public Label CivicLebel1;

    @FXML
   public TextField EconomicsField;

    @FXML
    public TextField EconomicsField1;

    @FXML
    public Label EconomicsLebel;

    @FXML
    public Label EconomicsLebel1;

    @FXML
   public TextField HistoryField;

    @FXML
    public TextField HistoryField1;

    @FXML
    public Label HistoryLebel;

    @FXML
    public Label HistoryLebel1;

    @FXML
    public TextField SociologyField;

    @FXML
    public TextField SociologyField1;

    @FXML
    public Label SociologyLebel;

    @FXML
    public Label SociologyLebel1;

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
    void br(ActionEvent event) {
        HelloApplication.changeScene("createStudent");
    }

    @FXML
    void submit(ActionEvent event) {
        RadioButton radioButton = (RadioButton) ASH.getSelectedToggle();
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
        double bangla1 = Double.parseDouble(banField1.getText());
        double ci1         =  Double.parseDouble( CivicField1.getText());
        double      so1   =  Double.parseDouble( SociologyField1.getText());
        double       eng1  = Double.parseDouble( enField1.getText());
        double        his1 = Double.parseDouble( HistoryField1.getText());
        double        echo1 =  Double.parseDouble( EconomicsField1.getText());
        double b = bangla +bangla1;
        double e = eng1 +eng;
        double h = so+so1;
        double p = his1 +his;
        double c = ci +ci1;
        double bi = echo +echo1;
//        double finalGpa = HelloApplication.getFinalGpa(HelloApplication.getPoint(bangla),
//                HelloApplication.getPoint(eng),HelloApplication.getPoint(so),HelloApplication.getPoint(his),
//                HelloApplication.getPoint(ci),HelloApplication.getPoint(echo),
//                HelloApplication.getPoint(ict),optional);
        double finalGpa = HelloApplication.getFinalGpa(HelloApplication.getPointHsc(b),
                HelloApplication.getPointHsc(e),HelloApplication.getPointHsc(h),HelloApplication.getPointHsc(p),
                HelloApplication.getPointHsc(c),HelloApplication.getPointHsc(bi),
                HelloApplication.getPoint(ict),optional);
//        String finalGrade = HelloApplication.getGradePoint(HelloApplication.getFinalGpa(HelloApplication.getPoint(bangla),
//                HelloApplication.getPoint(eng),HelloApplication.getPoint(so),HelloApplication.getPoint(his),
//                HelloApplication.getPoint(ci),HelloApplication.getPoint(echo),
//                HelloApplication.getPoint(ict),optional));
        String finalGrade = HelloApplication.getGradePoint
                (HelloApplication.getFinalGpa(HelloApplication.getPointHsc(b),
                        HelloApplication.getPointHsc(e),HelloApplication.getPointHsc(h),HelloApplication.getPointHsc(p),
                        HelloApplication.getPointHsc(c),HelloApplication.getPointHsc(bi),
                        HelloApplication.getPoint(ict),optional));
        MarksInfoScience marksInfoScience = new MarksInfoScience(bangla,eng,so,his,ci,echo,ict,HelloApplication.getGrade(bangla),
                HelloApplication.getGrade(eng),HelloApplication.getGrade(so),
                HelloApplication.getGrade(his),HelloApplication.getGrade(ci),
                HelloApplication.getGrade(echo),HelloApplication.getGrade(ict),finalGpa,finalGrade) ;
        HelloApplication.result = marksInfoScience;
        MarksInfoScience sub1 = new MarksInfoScience(banName,b,HelloApplication.getGradeHsc(bangla));
        MarksInfoScience sub2 = new MarksInfoScience(engName,e,HelloApplication.getGradeHsc(eng));
        MarksInfoScience sub3 = new MarksInfoScience(ciName,c,HelloApplication.getGradeHsc(ci));
        MarksInfoScience sub4 = new MarksInfoScience(soName,h,HelloApplication.getGradeHsc(so));
        MarksInfoScience sub5 = new MarksInfoScience(hisName,p,HelloApplication.getGradeHsc(his));
        MarksInfoScience sub6 = new MarksInfoScience(echoName,bi,HelloApplication.getGradeHsc(echo));
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
