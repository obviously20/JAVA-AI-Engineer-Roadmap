package learing.inheritance.demo4;

public class Employee {

    // 1.属性私有化
    private String id;
    private String name;
    private double money;


    //2.空参构造和有参构造
    public Employee() {
    }

    public Employee(String id, String name, double money) {
        this.id = id;
        this.name = name;
        this.money = money;
    }

    //3.提供getter和setter方法
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

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    //4.一些其他方法
    public void work() {
        System.out.println(name+"正在工作");
    }

    public void eat(){
        System.out.println(name+"正在吃米饭");
    }
}
