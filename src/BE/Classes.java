package BE;

public class Classes {
    private String name;
    private int amount;
    private String teacher;

    public Classes(String name, int amount,String teacher){
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
}
