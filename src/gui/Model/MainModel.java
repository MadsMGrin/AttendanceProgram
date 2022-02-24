package gui.Model;

import be.Classes;
import be.Student;
import bll.AttendanceFacade;
import bll.AttendanceManager;
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

    public ObservableList queryClasses(String query) {
        return bllFacade.queryClasses(query);
    }

    public ObservableList queryStudents(String text) {
        return bllFacade.queryStudents(text);
    }
}
