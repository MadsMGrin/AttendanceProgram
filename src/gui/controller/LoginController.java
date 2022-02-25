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
import java.io.IOException;

public class LoginController{

    private boolean teacherMode;

    @FXML
    private AnchorPane root;

    @FXML
    private TextField usernameTxt;

    @FXML
    private PasswordField passwordTxt;

    public void setTeacherMode(boolean teacherMode) {
        this.teacherMode = teacherMode;
    }

    @FXML
    private void handleCancel(ActionEvent event) throws IOException {
        ((Stage) root.getScene().getWindow()).close();
        Parent newRoot = FXMLLoader.load(getClass().getResource("../view/MainView.fxml"));
        Scene scene = new Scene(newRoot);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }

    @FXML
    private void handleOk(ActionEvent event) throws IOException {
        if (!usernameTxt.getText().isEmpty()&&!passwordTxt.getText().isEmpty()){
            login(teacherMode);
        }
    }

    private void login(boolean teacherMode) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../view/TeachersHubView.fxml"));
        if (!teacherMode)
            root = FXMLLoader.load(getClass().getResource("../view/StudentCheckin.fxml"));
        Scene scene = new Scene(root);
        Stage stage = ((Stage) this.root.getScene().getWindow());
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }
}

