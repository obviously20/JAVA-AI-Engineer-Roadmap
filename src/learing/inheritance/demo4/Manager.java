package learing.inheritance.demo4;

public class Manager extends Employee {
    private double managerMoney;


    public Manager() {
//        super();
        // 调用有参构造方法，设置默认值
        this(null, null, 0.0, 10000);
    }

    public Manager(String id, String name, double money, double managerMoney) {
        super(id, name, money);
        this.managerMoney = managerMoney;
    }

    public double getManagerMoney() {
        return managerMoney;
    }

    public void setManagerMoney(double managerMoney) {
        this.managerMoney = managerMoney;
    }

    @Override
    public void work() {
        System.out.println(super.getName()+"正在管理其他人");
    }
}
