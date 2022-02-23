package BLL;

import BE.Classes;
import BE.Student;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.List;

public class AttendanceManager implements AttendanceFacade {

    public List<Classes> getAllClasses() {
        //
        ObservableList<Classes> ClassesList;
        ClassesList = FXCollections.observableArrayList();
        ClassesList.add(new Classes("klassa1", 2131,"JEPO", null));
        ClassesList.add(new Classes("klassa2", 2138956781,"JEPO", null));
        ClassesList.add(new Classes("klassa3", 2678,"JEPO", null));
        //

        return ClassesList;
    }
    public List<Student> getAllStudent() {

        //
        ObservableList<Student> StudentList;
        StudentList = FXCollections.observableArrayList();
        StudentList.add(new Student("marek", "DADADA@xD?.Xd?", "klassa1", 5.5));
        StudentList.add(new Student("szparek","eqwe@XDD.com", "klassa2", 3.3));
        StudentList.add(new Student("IMGAY","DAD@xd.com","klassa2", 6.6));
        StudentList.add(new Student("marek", "DADADA@xD?.Xd?", "klassa1", 5.5));
        StudentList.add(new Student("szparek","eqwe@XDD.com", "klassa2", 3.3));
        StudentList.add(new Student("IMGAY","DAD@xd.com","klassa2", 6.6));
        //
        return StudentList;
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
