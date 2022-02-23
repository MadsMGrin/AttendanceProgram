package BLL;

import BE.Classes;
import BE.Student;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.List;

public class AttendanceManager implements AttendanceFacade {

    public List<Classes> getAllClasses() {
        //TODO we need to move it to DAL
        //
        ObservableList<Student> StudentList1;
        StudentList1 = FXCollections.observableArrayList();
        StudentList1.add(new Student("marek1", "DADADA@xD?.Xd?", "klassa1", 5.5));
        StudentList1.add(new Student("szparek1","eqwe@XDD.com", "klassa1", 3.3));
        ObservableList<Student> StudentList2;
        StudentList2 = FXCollections.observableArrayList();
        StudentList2.add(new Student("marek2", "DADADA@xD?.Xd?", "klassa2", 5.5));
        StudentList2.add(new Student("szparek2","eqwe@XDD.com", "klassa2", 3.3));
        ObservableList<Student> StudentList3;
        StudentList3 = FXCollections.observableArrayList();
        StudentList3.add(new Student("marek3", "DADADA@xD?.Xd?", "klassa3", 5.5));
        StudentList3.add(new Student("szparek3","eqwe@XDD.com", "klassa3", 3.3));
        //

        //
        ObservableList<Classes> ClassesList;
        ClassesList = FXCollections.observableArrayList();
        ClassesList.add(new Classes("klassa1", 2131,"JEPO", StudentList1));
        ClassesList.add(new Classes("klassa2", 2138956781,"JEPO", StudentList2));
        ClassesList.add(new Classes("klassa3", 2678,"JEPO", StudentList3));
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
        //
        return StudentList;
    }

}
