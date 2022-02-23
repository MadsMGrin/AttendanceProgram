package BE;

import java.util.List;

public class Classes {
    private String name;
    private int amount;
    private String teacher;
    private List<Student> studentList;

    public Classes(String name, int amount,String teacher,List<Student> studentList){
        this.studentList = studentList;
        this.name = name;
        this.amount = amount;
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public List<Student> getAllStudentsInClass() {return studentList;}
}
