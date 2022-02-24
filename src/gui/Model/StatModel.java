package gui.Model;

import be.Student;

import bll.AttendanceFacade;
import bll.AttendanceManager;
import javafx.collections.ObservableList;

public class StatModel {

    private AttendanceFacade manager;

    public StatModel(){
        manager = new AttendanceManager();
    }

    public ObservableList<Student> getStudents() {
        return (ObservableList<Student>) manager.getAllStudent();
    }
}
