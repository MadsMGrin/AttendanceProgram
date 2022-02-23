package gui.controller;

import BE.Classes;
import BE.Student;
import BE.Teacher;
import gui.Model.MainModel;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

import java.util.List;


public class TeacherHubController {
    MainModel mainModel= new MainModel();
    @FXML
    private TableColumn <Classes, String> classNameColumn,teacherColumn, classSizeColumn;
    @FXML
    private TableColumn <Student, String> studentNameColumn, absenceColumn;
    @FXML
    private TableView<Classes> tableView;
    @FXML
    private TableView tableViewStudent;
    private ObservableList<Student> studentsInClassList;


    public void initialize() {
        try {
            tableViewProperty();
           // tableViewStudentProperty();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    private void tableViewProperty() {
        classNameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        classSizeColumn.setCellValueFactory(new PropertyValueFactory<>("amount"));
        teacherColumn.setCellValueFactory(new PropertyValueFactory<>("teacher"));
        tableView.setItems(mainModel.getAllClasses());
    }
   /* private  void tableViewStudentProperty(){
        studentNameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        absenceColumn.setCellValueFactory(new PropertyValueFactory<>("absence"));
        tableViewStudent.setItems(mainModel.getAllStudent());
    }*/
    @FXML
    void studentsInClass(MouseEvent event) {
        List studentsToShow = tableView.getSelectionModel().getSelectedItem().getAllStudentsInClass();
        studentsInClassList = FXCollections.observableArrayList();
        studentsInClassList.setAll(studentsToShow);
        studentNameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        absenceColumn.setCellValueFactory(new PropertyValueFactory<>("absence"));
        tableViewStudent.setItems(studentsInClassList);

    }




}