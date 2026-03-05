package learing.inheritance.homework01;

public class AdminStaff extends Employee{

    public AdminStaff() {
    }

    public AdminStaff(String id, String name, String responsibility) {
        super(id, name, responsibility);
    }

    //行政部员工
    @Override
    public void work() {
        System.out.println("行政部员工" + getName() + "正在工作");
    }
}
