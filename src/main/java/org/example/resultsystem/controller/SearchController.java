package org.example.resultsystem.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import org.example.resultsystem.HelloApplication;
import org.example.resultsystem.databaseConnection.InfoDataStore;
import org.example.resultsystem.model.MarksInfoScience;
import org.example.resultsystem.model.StudentInfo;

import java.net.URL;
import java.util.List;
import java.util.Random;
import java.util.ResourceBundle;

public class SearchController implements Initializable {

    @FXML
    public ChoiceBox<String> boardChoiceBox;

    @FXML
    public ChoiceBox<String> examinationChoiceBox;

    @FXML
    public TextField regField;

    @FXML
    public  TextField rollField;
    @FXML
    public Label secrandom;

    @FXML
    public TextField textrandom;
    @FXML
    public Label firandome;


    @FXML
    public ChoiceBox<String> yearChoiceBox;
    public static StudentInfo studentInfo;
    public static MarksInfoScience marksInfo;
    public static StudentInfo subjectinfo;

    @FXML
   public void search(ActionEvent event) {
           String board = boardChoiceBox.getValue();
           //String year = yearChoiceBox.getValue();
           String roll = rollField.getText();
           String reg = regField.getText();
           int number = Integer.parseInt(textrandom.getText());
           int z = HelloApplication.za;
        InfoDataStore infoDataStore = new InfoDataStore();
         studentInfo = infoDataStore.getInfo(roll,reg);
         marksInfo = infoDataStore.resultGet(roll,reg);
         //marksInfo = infoDataStore.resultGetGrAndGpa(HelloApplication.result.getFinalGrade(),HelloApplication.result.getFinalGpa());
        if (studentInfo!=null && number==z){
            HelloApplication.changeScene("resultPage");
        }else if(number!=z){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setContentText(" number issue");
            alert.showAndWait();
        }else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setContentText(" roll or reg error");
            alert.showAndWait();

        }
//        if(HelloApplication.info.getGroup().equals("science")){
//            infoDataStore.sub();
//        }else {
//            Alert alert = new Alert(Alert.AlertType.ERROR);
//            alert.setTitle("Error");
//            alert.setContentText("subject issue");
//            alert.showAndWait();
//        }
    }
    @FXML
    void admindash(MouseEvent event) {
       HelloApplication.changeScene("login");
    }
    @FXML
    void back(ActionEvent event) {
       HelloApplication.changeScene("frontPage");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Random random = new Random();
        int x = random.nextInt(7);
        int y = random.nextInt(7);
       int z = x + y;
       HelloApplication.za = z;
         firandome.setText(x+"");
        secrandom.setText(y+"");
        ObservableList<String> exam = FXCollections.observableArrayList();
        exam.add("JSC");
        exam.add("SSC");
        exam.add("HSC");
        examinationChoiceBox.setItems(exam);
        ObservableList<String> board = FXCollections.observableArrayList();
        board.add("Dhaka");
        board.add("Barisal");
        board.add("Rajshahi");
        board.add("Chattogram");
        board.add("Cumilla");
        board.add("Cumilla");
        board.add("Jashore");
        board.add("Sylhet");
        board.add("Sylhet");
        board.add("Mymensingh");
        boardChoiceBox.setItems(board);

        ObservableList<String> year = FXCollections.observableArrayList();
        InfoDataStore infoDataStore = new InfoDataStore();
        List<StudentInfo> yearList = infoDataStore.year();
        for(StudentInfo studentInfo1: yearList){
            year.add(studentInfo1.getYear());
        }
        yearChoiceBox.setItems(year);
    }
}
