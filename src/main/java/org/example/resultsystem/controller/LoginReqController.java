//package org.example.resultsystem.controller;
//
//public class LoginReqController {
//}
package org.example.resultsystem.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import org.example.resultsystem.HelloApplication;

public class LoginReqController {

    @FXML
    public TextField mobileField;

    @FXML
    public TextField pinField;

    @FXML
    void login(ActionEvent event) {
        String mobile = mobileField.getText();
        String pin = pinField.getText();
        if (mobile.equals("a")&&pin.equals("1")){
            HelloApplication.changeScene("setRequirement");
        }else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setContentText("Mobile or password is incorrect");
            alert.showAndWait();
        }
    }
    public void back(){
        HelloApplication.changeScene("frontPage");
    }

}
