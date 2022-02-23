package gui.Model;

import BE.Classes;
import BE.Student;
import BE.Teacher;
import BLL.AttendanceFacade;
import BLL.AttendanceManager;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


public class MainModel {

     AttendanceFacade bllFacade;
    private ObservableList<Classes> classesObservableList;
    private ObservableList<Student> studentObservableList;

    public ObservableList getAllClasses() {
        classesObservableList = FXCollections.observableArrayList();
        classesObservableList.setAll(bllFacade.getAllClasses());
        return classesObservableList;
    }

    public ObservableList getAllStudent() {
        studentObservableList = FXCollections.observableArrayList();
        studentObservableList.setAll(bllFacade.getAllStudent());
        return studentObservableList;
    }


    public MainModel()
    {
        bllFacade = new AttendanceManager();

    }
}
