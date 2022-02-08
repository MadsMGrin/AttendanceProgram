package gui.controller;

import BE.Classes;
import BE.Teacher;
import gui.Model.MainModel;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;


public class TeacherHubController {
    MainModel mainModel= new MainModel();
    @FXML
    private TableColumn <Classes, String> classNameColumn, classSizeColumn;
    @FXML
    private TableColumn <Teacher, String> teacherColumn;
    @FXML
    private TableView<Classes> tableView;
    @FXML
    private TableView tableViewStudent;

    public TeacherHubController() {
    }


    public void initialize() {
        try {
            tableViewProperty();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void tableViewProperty() {
        classNameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        classSizeColumn.setCellValueFactory(new PropertyValueFactory<>("amount"));
        tableView.setItems(mainModel.getClassesObservableList());
    }

}
//teacherColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
//tableView.setItems(mainModel.getTeacherObservableList());