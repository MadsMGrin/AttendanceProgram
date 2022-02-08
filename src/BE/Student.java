package BE;

public class Student {
    private String name;
    private String email;
    private String eclass;
    private double absence;

    public Student(String name, String email, String eclass, double absence){
        this.name = name;
        this.email = email;
        this.eclass = eclass;
        this.absence = absence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEclass() {
        return eclass;
    }

    public void setEclass(String eclass) {
        this.eclass = eclass;
    }

    public double getAbsence() {
        return absence;
    }

    public void setAbsence(double absence) {
        this.absence = absence;
    }
}
