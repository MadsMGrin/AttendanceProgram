package gui.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    @FXML
    private ImageView easvImage;
    @FXML
    private ImageView studentImage;
    @FXML
    private ImageView teacherImage;
    @FXML
    private AnchorPane root;

    private void openLoginWindow(boolean b) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/LoginView.fxml"));
        Parent newRoot = loader.load();
        Scene scene = new Scene(newRoot);
        Stage stage = ((Stage) root.getScene().getWindow());
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
        LoginController controller = loader.getController();
        controller.setTeacherMode(b);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        teacherImage.setImage(new Image("teacher.png"));
        studentImage.setImage(new Image("student.png"));
        easvImage.setImage(new Image("easv-logo-transparent.png"));
    }

    public void handleTeacher(javafx.scene.input.MouseEvent mouseEvent) throws IOException {
        openLoginWindow(true);
    }

    public void handleStudent(javafx.scene.input.MouseEvent mouseEvent) throws IOException {
        openLoginWindow(false);
    }
}
