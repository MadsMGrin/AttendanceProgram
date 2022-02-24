package dal;
import be.Classes;
import be.Student;
import be.Teacher;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.List;

public class AttendanceDAL {

    private List<String> listOfClasses;
    private List<Student> listOfStudents;

    private void makeClassList(){
        listOfStudents.add(new Student("Renars", "Renars.com", "English", 0.5));
        listOfClasses.add("English");
        listOfClasses.add("Computer Science");
        listOfClasses.add("Literature");
        listOfClasses.add("Spanish");
        listOfClasses.add("Geography");
        listOfClasses.add("Math");
        listOfClasses.add("Latin");
        listOfClasses.add("Physics");
        listOfClasses.add("German");

    }

    public ObservableList<Student> getStudentData() {
        ObservableList<Student> studentData = FXCollections.observableArrayList();
        studentData.add(new Student("Hans", "Muster", "English", 2));
        studentData.add(new Student("Ruth", "Mueller", "Computer Science", 5));
        studentData.add(new Student("Heinz", "Kurz", "Literature", 10));
        studentData.add(new Student("Cornelia", "Meier", "Spanish", 8));
        studentData.add(new Student("Werner", "Meyer", "Geography", 3));
        studentData.add(new Student("Lydia", "Kunz", "Math", 7));
        studentData.add(new Student("Anna", "Best", "Latin", 15));
        studentData.add(new Student("Stefan", "Meier", "Physics", 4));
        studentData.add(new Student("Martin", "Mueller", "German", 1));
        return studentData;
    }

    public ObservableList<Teacher> getTeacherData() {
        ObservableList<Teacher> teacherData = FXCollections.observableArrayList();
        teacherData.add(new Teacher("Hans", "Muster", listOfClasses));
        teacherData.add(new Teacher("Jeppe", "Moritz", listOfClasses));
        teacherData.add(new Teacher("Peter", "Stegger", listOfClasses));
        teacherData.add(new Teacher("Trine", "Hansen", listOfClasses));
        teacherData.add(new Teacher("Magnus", "Skaregaard", listOfClasses));
        teacherData.add(new Teacher("Laura", "Karlsen", listOfClasses));
        teacherData.add(new Teacher("Marcus", "Madsen", listOfClasses));
        teacherData.add(new Teacher("Lars", "Lindgren", listOfClasses));
        teacherData.add(new Teacher("Mads", "Stefansson", listOfClasses));
        return teacherData;
    }

    public ObservableList<Classes> getClassesData() {
        ObservableList<Classes> classesData = FXCollections.observableArrayList();
        classesData.add(new Classes("English", 3, "4", listOfStudents));
        classesData.add(new Classes("Computer Science", 2, "2", listOfStudents));
        classesData.add(new Classes("Literature", 1, "2", listOfStudents));
        classesData.add(new Classes("Spanish", 2, "4", listOfStudents));
        classesData.add(new Classes("Geometry", 3, "4", listOfStudents));
        classesData.add(new Classes("Latin", 4, "4", listOfStudents));
        classesData.add(new Classes("Math", 4, "5", listOfStudents));
        classesData.add(new Classes("Physics", 2, "2", listOfStudents));
        classesData.add(new Classes("German", 1, "2", listOfStudents));
        return classesData;
    }

}
