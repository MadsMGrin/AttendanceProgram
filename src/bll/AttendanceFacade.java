package bll;

import be.Classes;
import be.Student;
import javafx.collections.ObservableList;

import java.util.List;

public interface AttendanceFacade {

    List<Classes> getAllClasses() ;

    List<Student> getAllStudent() ;

    ObservableList queryClasses(String query);

    ObservableList queryStudents(String query);
}
