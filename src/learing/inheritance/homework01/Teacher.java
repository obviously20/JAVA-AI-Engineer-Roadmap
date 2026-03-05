package learing.inheritance.homework01;

public class Teacher extends Employee{

    public Teacher() {
    }

    public Teacher(String id, String name, String responsibility) {
        super(id, name, responsibility);
    }

    //教研部员工
    @Override
    public void work() {
        System.out.println("教研部员工" + getName() + "正在工作");
    }
}
