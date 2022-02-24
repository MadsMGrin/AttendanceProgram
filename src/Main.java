import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("gui/view/MainView.fxml"));
        //Parent root = FXMLLoader.load(getClass().getResource("gui/view/TeacherStatView.fxml"));
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
        setUserAgentStylesheet("MainCSS.css");
    }

    public static void main(String[] args) {
        launch(args);
    }
}