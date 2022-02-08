package gui.controller;

import com.sun.tools.javac.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
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
        openLoginWindow(false);
    }

    public void handleTeacher(ActionEvent actionEvent) throws IOException {
        openLoginWindow(true);
    }

    private void openLoginWindow(boolean b) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/LoginView.fxml"));
        Parent newRoot = loader.load();
        Scene scene = new Scene(newRoot);
        Stage newStage = new Stage();
        newStage.setScene(scene);
        newStage.show();

        Stage stage = ((Stage) root.getScene().getWindow());
        stage.close();

        LoginController controller = loader.getController();
        controller.setTeacherMode(b);
    }
}
