package BLL;

import BE.Classes;
import BE.Student;
import DAL.DALInterface;
import DAL.DALManager;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.List;

public class AttendanceManager implements AttendanceFacade {

    private DALInterface dalInterface;

    public AttendanceManager(){
        dalInterface = new DALManager();
    }

    public List<Classes> getAllClasses() {
        return dalInterface.getClassesData();
    }


    public List<Student> getAllStudent() {
        return dalInterface.getStudentData();
    }

    @Override
    public ObservableList queryClasses(String query) {
        List<Classes> queriedClasses = getAllClasses();
        for(char character: query.toCharArray()){
            if (queriedClasses.size()>1)
                queriedClasses.remove(queriedClasses.size()-1);
        }
        return FXCollections.observableArrayList(queriedClasses);

    }

    @Override
    public ObservableList queryStudents(String query) {
        List<Student> queriedStudents = getAllStudent();
        for(char character: query.toCharArray()){
            if (queriedStudents.size()>1)
                queriedStudents.remove(queriedStudents.size()-1);
        }
        return FXCollections.observableArrayList(queriedStudents);

    }


}
