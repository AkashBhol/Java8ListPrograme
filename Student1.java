/**
 * Student
 */
public class Student1 {

    private int id;
    private String name;
    private Double sal;
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public Double getSal() {
        return sal;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSal(Double sal) {
        this.sal = sal;
    }
    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", sal=" + sal + "]";
    }
    public Student1(int id, String name, Double sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    
}