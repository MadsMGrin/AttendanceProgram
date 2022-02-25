import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("gui/view/MainView.fxml"));
        //Parent root = FXMLLoader.load(getClass().getResource("gui/view/TeacherStatView.fxml"));
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
        primaryStage.getIcons().add(new Image("easv-logo-transparent.png"));
    }

    public static void main(String[] args) {
        launch(args);
    }
}