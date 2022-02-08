package BE;

import java.util.List;

public class Teacher {
    private String name;
    private String email;
    private List<String> classes;

    public Teacher(String name, String email, List<String> classes){
        this.name = name;
        this.email = email;
        this.classes = classes;
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

    public List<String> getClasses() {
        return classes;
    }

    public void setClasses(List<String> classes) {
        this.classes = classes;
    }
}
