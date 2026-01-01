package org.example.resultsystem.controller;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import org.example.resultsystem.HelloApplication;
import org.example.resultsystem.model.StudentInfo;

import java.net.URL;
import java.util.ResourceBundle;

public class ViewPublicController implements Initializable {

    @FXML
    private TableView<String> table;

    @FXML
    private TableColumn<String, String> tableColumn;
    private ObservableList<String> tableobserve;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        double totalBuet =  ShowPublicController.markhsc.getHm()+ShowPublicController.markhsc.getPhy()+ShowPublicController.markhsc.getChem();
        double totalBuetgst =  ShowPublicController.markhsc.getEng()+ShowPublicController.markhsc.getHm()+ShowPublicController.markhsc.getPhy()+ShowPublicController.markhsc.getChem();
        double hm = ShowPublicController.marksssc.getHm();
        double phy = ShowPublicController.marksssc.getPhy();
        double chem = ShowPublicController.marksssc.getChem();
        double sscPoint = ShowPublicController.marksssc.getFinalGpa();
        double hscPoint = ShowPublicController.markhsc.getFinalGpa();
        double totalPoint = sscPoint + hscPoint;
        int b=0,m=0,d=0,gst=0;
        tableColumn.setCellValueFactory(c->new SimpleStringProperty(c.getValue()));
        tableobserve = FXCollections.observableArrayList();
       for(int i = 0;7>i;i++) {
           if (totalBuet > 270 && b==0) {
               tableobserve.add("buet");
               b++;
           } else if (9.5 >= totalPoint && m==0) {
               tableobserve.add("medical");
               m++;
           } else if (8.5 >= totalPoint && d==0) {
            tableobserve.add("du");
            d++;
        }else if (9.5 >= totalPoint && gst==0){
               tableobserve.add("gst");
               gst++;
           }
       }
        table.setItems(tableobserve);

    }
    public void back(){
        HelloApplication.changeScene("showPublic");
    }
}


