package learing.inheritance.homework01;

public class Employee {
    private String id;
    private String name;
    private String responsibility;

    public Employee() {
    }

    public Employee(String id, String name, String responsibility) {
        this.id = id;
        this.name = name;
        this.responsibility = responsibility;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResponsibility() {
        return responsibility;
    }

    public void setResponsibility(String responsibility) {
        this.responsibility = responsibility;
    }

    public void work(){
        System.out.println("员工" + name + "正在工作");
    }
}
