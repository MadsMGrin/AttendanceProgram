package DAL;
import BE.Classes;
import BE.Student;
import BE.Teacher;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.List;


public class AttandenceDAL {

    private List<String> listOfClasses;

    private void makeClassList(){
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
        studentData.add(new Student("Martin", "Mueller", "German", 1);
        return studentData;
    }

    public ObservableList<Teacher> getTeacherData() {
        ObservableList<Teacher> teacherData = FXCollections.observableArrayList();
        teacherData.add(new Teacher("Hans", "Muster", listOfClasses));
        teacherData.add(new Teacher("Jeppe", "Moritz", "3"));
        teacherData.add(new Teacher("Peter", "Stegger", "3"));
        teacherData.add(new Teacher("Trine", "Hansen", "3"));
        teacherData.add(new Teacher("Magnus", "Skaregaard", "3"));
        teacherData.add(new Teacher("Laura", "Karlsen", "3"));
        teacherData.add(new Teacher("Marcus", "Madsen", "3"));
        teacherData.add(new Teacher("Lars", "Lindgren", "3"));
        teacherData.add(new Teacher("Mads", "Stefansson", "3"));
        return teacherData;
    }

    public ObservableList<Classes> getClassesData() {
        ObservableList<Classes> classesData = FXCollections.observableArrayList();
        classesData.add(new Classes("English", 3, "4"));
        classesData.add(new Classes("Computer Science", 2, "2"));
        classesData.add(new Classes("Litareture", 1, "2"));
        classesData.add(new Classes("Spanish", 2, "4"));
        classesData.add(new Classes("Geometry", 3, "4"));
        classesData.add(new Classes("Latin", 4, "4"));
        classesData.add(new Classes("Math", 4, "5"));
        classesData.add(new Classes("Physics", 2, "2"));
        classesData.add(new Classes("German", 1, "2"));
        return classesData;
    }

}
