package gui.controller;

import com.sun.tools.javac.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {

    @FXML
    private AnchorPane root;

    Main mainApp;

    public void setMainApp(Main mainApp){
        this.mainApp = mainApp;
    }

    public void handleStudent(ActionEvent actionEvent) throws IOException {
        openLoginWindow();
    }

    public void handleTeacher(ActionEvent actionEvent) throws IOException {
        openLoginWindow();
    }

    private void openLoginWindow() throws IOException {
        Parent newRoot = FXMLLoader.load(getClass().getResource("../view/LoginView.fxml"));
        Scene scene = new Scene(newRoot);
        Stage newStage = new Stage();
        newStage.setScene(scene);
        newStage.show();

        Stage stage = ((Stage) root.getScene().getWindow());
        stage.close();
    }
}
