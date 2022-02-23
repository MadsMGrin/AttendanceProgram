package gui.controller;

import BE.Classes;
import BE.Student;
import BE.Teacher;
import gui.Model.MainModel;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;


public class TeacherHubController {
    @FXML
    private AnchorPane anchor;
    @FXML
    private TableColumn <Classes, String> classNameColumn,teacherColumn, classSizeColumn;
    @FXML
    private TableColumn <Student, String> studentNameColumn, absenceColumn;
    @FXML
    private TableView<Classes> tableViewClass;
    @FXML
    private TableView<Student> tableViewStudent;

    MainModel mainModel= new MainModel();


    public void initialize() {
        try {
            tableViewProperty();
            tableViewStudentProperty();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    private void tableViewProperty() {
        classNameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        classSizeColumn.setCellValueFactory(new PropertyValueFactory<>("amount"));
        teacherColumn.setCellValueFactory(new PropertyValueFactory<>("teacher"));
        tableViewClass.setItems(mainModel.getAllClasses());
    }
    private void tableViewStudentProperty(){
        studentNameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        absenceColumn.setCellValueFactory(new PropertyValueFactory<>("absence"));
        tableViewStudent.setItems(mainModel.getAllStudent());
    }

    @FXML
    private void handleGoToClass(ActionEvent actionEvent) throws IOException {
        if (tableViewClass.getSelectionModel().getSelectedIndex()==-1)
            return;
        Classes selectedClass = tableViewClass.getSelectionModel().getSelectedItem();
        openStatView(selectedClass);
    }

    private void openStatView(Classes selectedClass) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/TeacherStatView.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);

        TeacherStatController statController = loader.getController();
        statController.setFields(selectedClass);

        Stage stage = ((Stage) anchor.getScene().getWindow());
        stage.setScene(scene);
    }

    @FXML
    private void handleGoToStudent(ActionEvent actionEvent) throws IOException {
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

        Stage stage = ((Stage) anchor.getScene().getWindow());
        stage.setScene(scene);
    }

    @FXML
    private void handleSearchClass(KeyEvent keyEvent) {
        ObservableList classes = mainModel.queryClasses(((TextField) keyEvent.getSource()).getText());
        tableViewClass.setItems(classes);
    }

    @FXML
    private void handleSearchStudent(KeyEvent keyEvent) {
        ObservableList students = mainModel.queryStudents(((TextField) keyEvent.getSource()).getText());
        tableViewStudent.setItems(students);
    }
}