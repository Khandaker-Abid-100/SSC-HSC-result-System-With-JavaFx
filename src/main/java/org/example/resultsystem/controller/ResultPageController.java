package org.example.resultsystem.controller;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import org.example.resultsystem.HelloApplication;
import org.example.resultsystem.databaseConnection.InfoDataStore;
import org.example.resultsystem.model.MarksInfoScience;
import org.example.resultsystem.model.StudentInfo;

import java.net.URL;
import java.util.Collections;
import java.util.List;
import java.util.ResourceBundle;

public class ResultPageController implements Initializable {
    @FXML
    private Label boardField;

    @FXML
    private Label boardShow;

    @FXML
    private Label fnameField;

    @FXML
    private Label gpaField;

    @FXML
    private Label grpField;

    @FXML
    private Label mnameField;

    @FXML
    private Label nameField;

    @FXML
    private Label resultField;

    @FXML
    private Label rollField;

    @FXML
    private Label yearShow;
    @FXML
    public TableView<MarksInfoScience> resultTable;
    @FXML
    public TableColumn<MarksInfoScience, String> subjectTa;
    @FXML
    private TableColumn<MarksInfoScience, String> gradeTa;
    @FXML
    private TableColumn<MarksInfoScience,Number> marksTa;

    private ObservableList<MarksInfoScience> name;



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        subjectTa.setCellValueFactory(c->new SimpleStringProperty(c.getValue().getSubject()));
        marksTa.setCellValueFactory(c->new SimpleDoubleProperty(c.getValue().getMarks()));
        gradeTa.setCellValueFactory(c->new SimpleStringProperty(c.getValue().getGrade()));
        name = FXCollections.observableArrayList();
        InfoDataStore infoDataStore = new InfoDataStore();
       List<MarksInfoScience> resultTableList = infoDataStore.getNumberlist(SearchController.studentInfo.getRoll(),SearchController.studentInfo.getReg());
               //infoDataStore.getNumberless(SearchController.studentInfo.getRoll(),SearchController.studentInfo.getReg());
        name.addAll(resultTableList);
        resultTable.setItems(name);
        boardShow.setText(SearchController.studentInfo.getYear());
        yearShow.setText(SearchController.studentInfo.getBoard());
        nameField.setText(SearchController.studentInfo.getName());
        fnameField.setText(SearchController.studentInfo.getFatherName());
        mnameField.setText(SearchController.studentInfo.getMotherName());
        gpaField.setText(SearchController.marksInfo.getFinalGpa()+"");
        resultField.setText(SearchController.marksInfo.getFinalGrade());
        rollField.setText(SearchController.studentInfo.getRoll());
        boardField.setText(SearchController.studentInfo.getBoard());
        grpField.setText(SearchController.studentInfo.getGroup());
    }
    @FXML
    void bts(ActionEvent event) {
      HelloApplication.changeScene("search");
    }

}
