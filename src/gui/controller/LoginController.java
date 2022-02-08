package gui.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;

public class LoginController {

    @FXML
    private AnchorPane root;

    @FXML
    private TextField usernameTxt;

    @FXML
    private PasswordField passwordTxt;

    @FXML
    void handleCancel(ActionEvent event) throws IOException {
        ((Stage) root.getScene().getWindow()).close();

        Parent newRoot = FXMLLoader.load(getClass().getResource("../view/MainView.fxml"));
        Scene scene = new Scene(newRoot);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void handleOk(ActionEvent event) {

    }

}

