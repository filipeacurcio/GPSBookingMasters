package tpgps.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import tpgps.DbaseUtils;

import java.net.URL;
import java.util.ResourceBundle;

public class LogInController implements Initializable {

    @FXML private TextField txt_mail;
    @FXML private PasswordField txt_passAl;
    @FXML private Button btnLOGIN;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // BTN LOGIN
        btnLOGIN.setOnAction(event -> DbaseUtils.logInUser(event,txt_mail.getText(),txt_passAl.getText()));
    }
}
