package learing.inheritance.homework05;

public class Test {
    public static void main(String[] args) {
        Manage manage = new Manage("张三", "001", 15000, 10000);
        System.out.println(manage.getName()+"的奖金是"+manage.getBonus()+"工号是"+manage.getId()+"工资是"+manage.getSalary());
        manage.work();

        Coder coder = new Coder("李四", "002", 12000);
        System.out.println(coder.getName()+"的工号是"+coder.getId()+"工资是"+coder.getSalary());
        coder.work();

    }
}
