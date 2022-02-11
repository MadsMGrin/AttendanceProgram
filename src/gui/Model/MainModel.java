package gui.Model;

import BE.Classes;
import BE.Teacher;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


public class MainModel {
    //private final BLLFacade bllFacade;
    private ObservableList<Classes> classesObservableList;
    private ObservableList<Teacher> teacherObservableList;

    public ObservableList getClassesObservableList() {
        classesObservableList = FXCollections.observableArrayList();
        //classesObservableList.setAll(bllFacade.getAllClasses);
        classesObservableList.setAll(getClassesList());
        return classesObservableList;
    }

    public ObservableList getTeacherObservableList() {
        teacherObservableList = FXCollections.observableArrayList();
        //teacherObservableList.setAll(bllFacade.getAllTeacher);
        return teacherObservableList;
    }





    private ObservableList<Classes> ClassesList;

    public MainModel()
    {
        ClassesList = FXCollections.observableArrayList();
    }

    public ObservableList<Classes> getClassesList() {
        return ClassesList;
    }

}

