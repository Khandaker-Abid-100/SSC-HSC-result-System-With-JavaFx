package org.example.resultsystem.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import org.example.resultsystem.HelloApplication;
import org.example.resultsystem.databaseConnection.InfoDataStore;
import org.example.resultsystem.model.StudentInfo;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class CreateStudentController implements Initializable {

    @FXML
    public ChoiceBox<String> yearChoiceBox;

    @FXML
    public ChoiceBox<String> boardChoiceBox;

    @FXML
    public ChoiceBox<String> examinationChoiceBox;

    @FXML
    public TextField regField;

    @FXML
    public TextField rollField;

    @FXML
    public TextField fatherNameField;

    @FXML
    public ToggleGroup group;

    @FXML
    public TextField motherNameField;

    @FXML
    public TextField nameField;
    @FXML
    public TextField yearField;
    @FXML
    public void create(ActionEvent event) {
         String yearT = yearField.getText();
        String name  = nameField.getText();
        String fatherName  = fatherNameField.getText();
        String motherName  = motherNameField.getText();
        RadioButton radioButton = (RadioButton) group.getSelectedToggle();
        String group = radioButton.getText();
        System.out.println(group);
        String roll = rollField.getText();
        String reg = regField.getText();
        String board = boardChoiceBox.getValue();
        String exam = examinationChoiceBox.getValue();
      InfoDataStore infoDataStore = new InfoDataStore();
      List<StudentInfo> yearList = infoDataStore.year();
        List<String> s = new ArrayList();
        int c=0;
      for (StudentInfo studentInfo :yearList){
            s.add(studentInfo.getYear());
            c++;
      }

        List<String> p = s;
      int d=1 ;
     String e = "d";
     if (c==0){
         infoDataStore.insertexamyear(new StudentInfo(yearT, board));

     }else {
      for (String m:p){

          if (m.equals(yearT)) {
               break;
          }
          else if (d<c){
              d++;
          }else{
              infoDataStore.insertexamyear(new StudentInfo(yearT, board));
          }

      }
     }
        StudentInfo studentInfo = new StudentInfo(name,fatherName,motherName,group,roll,reg,yearT,board,exam);
        HelloApplication.info = studentInfo;
//        InfoDataStore infoDataStore = new InfoDataStore();
        boolean isInsert = infoDataStore.insertInfo(HelloApplication.info);
        if(isInsert){
            if (group.equals("Science")&& exam.equals("SSC")){
                HelloApplication.changeScene("SSC");
            }
           else if (group.equals("Science")&& exam.equals("HSC")){
                HelloApplication.changeScene("scienceStudentSubjectHsc");
            }
           else if (group.equals("Commerce")&& exam.equals("SSC")){
                HelloApplication.changeScene("commerceAddMarks");
            }  else if (group.equals("Commerce")&& exam.equals("HSC")){
                HelloApplication.changeScene("commerceHscAddMarks");
            }
           else if (group.equals("Arts")&& exam.equals("SSC")){
                HelloApplication.changeScene("artsAddMarks");
            }else if (group.equals("Arts")&& exam.equals("HSC")){
                HelloApplication.changeScene("artsHscAddMarks");
            }
           else {

                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("Select group");
                alert.showAndWait();
            }
        }else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("wrong");
            alert.showAndWait();
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<String> exam = FXCollections.observableArrayList();
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
    }
    @FXML
    void cr(ActionEvent event) {
      HelloApplication.changeScene("admin");
    }




}
