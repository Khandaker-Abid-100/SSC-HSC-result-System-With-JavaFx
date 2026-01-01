package org.example.resultsystem.controller;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import org.example.resultsystem.HelloApplication;
import org.example.resultsystem.databaseConnection.InfoDataStore;
import org.example.resultsystem.model.StudentInfo;
import org.example.resultsystem.model.Versity;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class ViewPrivateController implements Initializable {
    @FXML
    private TableView<String> table;

    @FXML
    private TableColumn<String, String> tableColumn;
    private ObservableList<String> tableobserve;

    public void initialize(URL url, ResourceBundle resourceBundle) {
//        InfoDataStore infoDataStore = new InfoDataStore();
//        Versity Nstu = infoDataStore.getreqlist(ShowPrivateController.sscRoll1);
//         double totalseu = Nstu.getTotalgpa();

      double hm = ShowPrivateController.marksssc.getHm();
        double phy = ShowPrivateController.marksssc.getPhy();
        double chem = ShowPrivateController.marksssc.getChem();
        double sscPoint = ShowPrivateController.marksssc.getFinalGpa();
        double hscPoint = ShowPrivateController.markhsc.getFinalGpa();
        double totalPoint = sscPoint + hscPoint;
        int b=0,m=0,d=0,gst=0;
        tableColumn.setCellValueFactory(c->new SimpleStringProperty(c.getValue()));
        tableobserve = FXCollections.observableArrayList();
        for(int i = 0;7>i;i++) {
            if (8 >= totalPoint && b==0) {
                tableobserve.add("seu");
                b++;
            } else if (4.5 >= totalPoint && m==0) {
                tableobserve.add("BRUC");
                m++;
            } else if (5.5 >= totalPoint && d==0) {
                tableobserve.add("SEU");
                d++;
            }else if (6 >= totalPoint && gst==0){
                tableobserve.add("uap");
                gst++;
            }
        }
        table.setItems(tableobserve);

    }
    public void back(){
        HelloApplication.changeScene("showPrivate");
    }
}


