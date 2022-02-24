package dal;

import be.Classes;
import be.Student;
import be.Teacher;
import javafx.collections.ObservableList;

public interface DALInterface {
    ObservableList<Student> getStudentData();

    ObservableList<Teacher> getTeacherData();

    ObservableList<Classes> getClassesData();

}
