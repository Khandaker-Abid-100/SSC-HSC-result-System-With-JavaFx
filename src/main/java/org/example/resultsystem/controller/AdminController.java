package org.example.resultsystem.controller;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import org.example.resultsystem.HelloApplication;
import org.example.resultsystem.databaseConnection.InfoDataStore;
import org.example.resultsystem.model.StudentInfo;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

public class AdminController implements Initializable {
    @FXML
    public TableColumn<StudentInfo, String> nameC;

    @FXML
    public TableView<StudentInfo> table;
    @FXML
    public TableColumn<StudentInfo, String> exam;

    @FXML
    public TableColumn<StudentInfo, String> gr;
    @FXML
    public TableColumn<StudentInfo, String> reg;

    @FXML
    public TableColumn<StudentInfo, String> roll;
    @FXML
    public TextField search;
    private ObservableList<StudentInfo> studentInfoObservableList;


    @FXML
    void SearchResult(ActionEvent event) {
        HelloApplication.changeScene("search");
    }

    @FXML
     public void newStudent(ActionEvent event) {
        HelloApplication.changeScene("createStudent");

    }
    @FXML
    void startSearcging(KeyEvent event) {
         String searchValue= search.getText();
         InfoDataStore infoDataStore = new InfoDataStore();
         List<StudentInfo> Nstu = infoDataStore.getlist();
        List<StudentInfo> fL = Nstu.stream().filter(u-> (u.getName().toLowerCase()
                         .contains(searchValue.toLowerCase()))||u.getRoll().toLowerCase().startsWith(searchValue))
                 .collect(Collectors.toList());
        studentInfoObservableList.clear();
        studentInfoObservableList.addAll(fL);
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        nameC.setCellValueFactory(c-> new SimpleStringProperty(c.getValue().getName()));
        roll.setCellValueFactory(c-> new SimpleStringProperty(c.getValue().getRoll()));
        reg.setCellValueFactory(c-> new SimpleStringProperty(c.getValue().getReg()));
        gr.setCellValueFactory(c-> new SimpleStringProperty(c.getValue().getGroup()));
        exam.setCellValueFactory(c-> new SimpleStringProperty(c.getValue().getExam()));
        studentInfoObservableList = FXCollections.observableArrayList();
        InfoDataStore infoDataStore = new InfoDataStore();
        List<StudentInfo>studentInfoList = infoDataStore.getlist();
        studentInfoObservableList.addAll(studentInfoList);
        table.setItems(studentInfoObservableList);
    }
    public static StudentInfo select;
    @FXML
    void selectedTAble(MouseEvent event) {
    select = table.getSelectionModel().getSelectedItem();
    }
    @FXML
    void update(ActionEvent event) {
        String exam =select.getExam();
        String group = select.getGroup();
        if (group.equals("Science")&& exam.equals("SSC")){
            InfoDataStore infoDataStore = new InfoDataStore();
            infoDataStore.deleteuser4(select.getRoll());
            infoDataStore.deleteuser15(select.getRoll());
            infoDataStore.deleteuser11(select.getRoll());
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
    }
    @FXML
    void delete(ActionEvent event) {
        if(select!=null){
            InfoDataStore infoDataStore = new InfoDataStore();
            infoDataStore.deleteuser4(select.getRoll());
            infoDataStore.deleteuser15(select.getRoll());
            infoDataStore.deleteuser11(select.getRoll());
        studentInfoObservableList.clear();
        studentInfoObservableList.addAll(infoDataStore.getlist());
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("delete");
        alert.showAndWait();
        }

    }
}
