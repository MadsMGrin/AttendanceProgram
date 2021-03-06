package gui.controller;

import be.Classes;
import be.Student;
import gui.model.StatModel;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.Axis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.ResourceBundle;

public class TeacherStatController implements Initializable {

    @FXML
    private TableColumn nameColumn;
    @FXML
    private TableColumn absenceColumn;
    @FXML
    private TableView<Student> tableViewStudent;
    @FXML
    private Label classNameTxt;
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

    List<LineChart> charts;

    StatModel model;

    public TeacherStatController(){
        model = new StatModel();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        initializeLineCharts();
        initializeColumns();
        populateTable();
        }

    private void initializeColumns() {
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        absenceColumn.setCellValueFactory(new PropertyValueFactory<>("absence"));
    }

    private void populateTable() {
        tableViewStudent.setItems(model.getStudents());
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

    public void setFields(Classes selectedClass) {
        classNameTxt.setText("Class: " + selectedClass.getName());
    }

    @FXML
    private void handleBack(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/TeachersHubView.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        Stage stage = ((Stage) tabAnchor.getScene().getWindow());
        stage.setScene(scene);
        stage.centerOnScreen();
    }

    public void handleGoToStudent(ActionEvent actionEvent) throws IOException {
        if (tableViewStudent.getSelectionModel().getSelectedIndex()==-1)
            return;
        Student selectedStudent = tableViewStudent.getSelectionModel().getSelectedItem();
        openStudentView(selectedStudent);
    }

    private void openStudentView(Student selectedStudent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/StudentView.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        StudentController studentController = loader.getController();
        studentController.setFields(selectedStudent);
        Stage stage = ((Stage) tabAnchor.getScene().getWindow());
        stage.setScene(scene);
        stage.centerOnScreen();
    }
}
