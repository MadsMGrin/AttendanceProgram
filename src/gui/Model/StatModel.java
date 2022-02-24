package gui.Model;

import BE.Student;
import BLL.AttendanceFacade;
import BLL.AttendanceManager;
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
