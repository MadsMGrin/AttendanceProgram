package DAL;

import BE.Classes;
import BE.Student;
import BE.Teacher;
import javafx.collections.ObservableList;

public interface DALInterface {
    ObservableList<Student> getStudentData();

    ObservableList<Teacher> getTeacherData();

    ObservableList<Classes> getClassesData();

}
