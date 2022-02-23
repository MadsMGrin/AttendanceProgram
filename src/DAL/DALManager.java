package DAL;

import BE.Classes;
import BE.Student;
import BE.Teacher;
import javafx.collections.ObservableList;

public class DALManager implements DALInterface{
    private AttandenceDAL attandenceDAL;

    public DALManager() {
        attandenceDAL = new AttandenceDAL();
    }

    @Override
    public ObservableList<Student> getStudentData() {
        return attandenceDAL.getStudentData();
    }

    @Override
    public ObservableList<Teacher> getTeacherData() {
        return attandenceDAL.getTeacherData();
    }

    @Override
    public ObservableList<Classes> getClassesData() {
        return attandenceDAL.getClassesData();
    }
}
