package dal;

import be.Classes;
import be.Student;
import be.Teacher;
import javafx.collections.ObservableList;

public class DALManager implements DALInterface{
    private AttendanceDAL attendanceDAL;

    public DALManager() {
        attendanceDAL = new AttendanceDAL();
    }

    @Override
    public ObservableList<Student> getStudentData() {
        return attendanceDAL.getStudentData();
    }

    @Override
    public ObservableList<Teacher> getTeacherData() {
        return attendanceDAL.getTeacherData();
    }

    @Override
    public ObservableList<Classes> getClassesData() {
        return attendanceDAL.getClassesData();
    }
}
