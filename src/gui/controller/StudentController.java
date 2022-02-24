package gui.controller;

import BE.Student;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.Axis;
import javafx.scene.chart.Chart;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.DateCell;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Callback;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.ResourceBundle;

public class StudentController implements Initializable {
    @FXML
    private DatePicker datePicker1;
    @FXML
    private Label attendanceLabel,avgGradeLabel,rankLabel,attendanceLabel1,avgGradeLabel1,rankLabel1;
    @FXML
    private LineChart chart1;
    @FXML
    private LineChart chart2;
    @FXML
    private AnchorPane root;
    @FXML
    private ImageView studentImage;
    @FXML
    private Label nameLabel;
    @FXML
    private Label classesLabel;
    @FXML
    private Label schoolMailLabel;

    @FXML
    private DatePicker datePicker;

    List<LineChart> charts;

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        initializeDatePicker();
        initializeCharts();
        initializeStudentInfo();
        studentImage.setImage(new Image("student2.png"));
    }

    private void initializeStudentInfo() {
        List<Label> labels = new ArrayList<>();
        labels.addAll(FXCollections.observableArrayList(avgGradeLabel,avgGradeLabel1,rankLabel,rankLabel1));
        Random r = new Random();
        for (Label label: labels)
            label.setText(String.valueOf(r.nextInt(10)));

        attendanceLabel.setText(String.valueOf(r.nextInt(100)+"%"));
        attendanceLabel1.setText(String.valueOf(r.nextInt(100)+"%"));
    }

    private void initializeCharts() {
        charts = new ArrayList<>();
        charts.addAll(FXCollections.observableArrayList(chart1,chart2));
        for (LineChart lineChart : charts) {
            Axis xAxis = lineChart.getXAxis();
            Axis yAxis = lineChart.getYAxis();

            xAxis.setLabel("Weeks");

            XYChart.Series<Integer, Integer> series = new XYChart.Series<>();

            Random random = new Random();
            for (int i = 1; i < 8; i++) {
                series.getData().add((new XYChart.Data<Integer, Integer>(i, random.nextInt(7) + 3)));
            }
            lineChart.getData().setAll(series);
        }
    }

    private void initializeDatePicker() {

        Callback<DatePicker, DateCell> dayCellFactory = dp -> new DateCell()
        {
            @Override
            public void updateItem(LocalDate item, boolean empty)
            {
                super.updateItem(item, empty);

                if(item.isBefore(LocalDate.of(2022,01,01)) || item.isAfter(LocalDate.now()))
                {
                    setStyle("-fx-background-color: #ffc0cb; -fx-text-fill: darkgray;");
                    setDisable(true);
                }
                else if(item.isEqual(LocalDate.of(2022,02,22))){
                    setStyle("-fx-background-color: green; -fx-text-fill: #C1EEF2;");
                }
            }
        };

        datePicker.setDayCellFactory(dayCellFactory);
        datePicker.setPromptText("dd/mm/yyyy");
        datePicker.setValue(LocalDate.now());

    }



    public void setFields(Student selectedStudent) {
        nameLabel.setText(selectedStudent.getName());
        classesLabel.setText("SCO,SDE,ITO");
        schoolMailLabel.setText(selectedStudent.getName()+"123@easv.dk");
    }

    public void handleBack(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/TeachersHubView.fxml"));
        Parent parentRoot = loader.load();
        Scene scene = new Scene(parentRoot);
        Stage stage = ((Stage) root.getScene().getWindow());
        stage.setScene(scene);
    }
}
