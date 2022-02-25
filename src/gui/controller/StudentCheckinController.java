package gui.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.Axis;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

public class StudentCheckinController implements Initializable {
    @FXML
    private BarChart barChart;
    @FXML
    private ImageView studentImage;
    @FXML
    private Button checkinBtn;

    public void handleCheckin(ActionEvent actionEvent) {
        checkinBtn.setDisable(true);
        checkinBtn.setText("Checked in ✓");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        studentImage.setImage(new Image("student2.png"));
        initializeChart();
    }

    private void initializeChart() {
        Axis xAxis = barChart.getXAxis();
        Axis yAxis = barChart.getYAxis();

        xAxis.setLabel("Subjects");
        yAxis.setLabel("Grade");

        XYChart.Series<String,Double> series = new XYChart.Series<>();

        Random r = new Random();

        series.getData().add(new XYChart.Data<String,Double>("Animation",r.nextDouble(10)));
        series.getData().add(new XYChart.Data<String,Double>("Graphic design",r.nextDouble(10)));
        series.getData().add(new XYChart.Data<String,Double>("Web design",r.nextDouble(10)));
        series.getData().add(new XYChart.Data<String,Double>("Photography",r.nextDouble(10)));


        barChart.getData().add(series);

    }

    public void handleLogOut(ActionEvent actionEvent) throws IOException {
        Scene root = ((Scene) ((Button) actionEvent.getSource()).getScene());
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/MainView.fxml"));
        Parent newRoot = loader.load();
        Scene scene = new Scene(newRoot);
        Stage stage = ((Stage) root.getWindow());
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }
}
