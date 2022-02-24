package bll;

import be.Classes;
import be.Student;
import dal.DALManager;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.List;

public class AttendanceManager implements AttendanceFacade {

    private DALManager dalManager;

    public AttendanceManager(){
        dalManager = new DALManager();
    }

    public ObservableList<Classes> getAllClasses() {
        return dalManager.getClassesData();
    }


    public ObservableList<Student> getAllStudent() {
        return dalManager.getStudentData();
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
