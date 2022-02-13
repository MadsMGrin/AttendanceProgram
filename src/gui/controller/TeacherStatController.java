package gui.controller;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.Axis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.ResourceBundle;

public class TeacherStatController implements Initializable {

    @FXML
    private LineChart chartOne;

    @FXML
    private LineChart chartTwo;

    @FXML
    private LineChart chartThree;

    @FXML
    private LineChart chartFour;
    @FXML

    private AnchorPane tabAnchor;

    @FXML
    private Button backBTN;

    @FXML
    private Button goToBTN;

    List<LineChart> charts;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        initializeLineCharts();
        }

    private void initializeLineCharts() {
        charts = new ArrayList<>();
        charts.addAll(FXCollections.observableArrayList(chartOne, chartTwo, chartThree, chartFour));
        for (LineChart lineChart : charts) {
            Axis xAxis = lineChart.getXAxis();
            Axis yAxis = lineChart.getYAxis();

            xAxis.setLabel("Weeks");
            yAxis.setLabel("Average attendance");

            XYChart.Series<Integer, Integer> series = new XYChart.Series<>();

            Random random = new Random();
            for (int i = 1; i < 12; i++) {
                series.getData().add((new XYChart.Data<Integer, Integer>(i, random.nextInt(35 - 15) + 15)));
            }
            lineChart.getData().setAll(series);
        }
    }
}
