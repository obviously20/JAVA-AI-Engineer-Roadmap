package learing.inheritance.demo4;

public class Test {
    public static void main(String[] args) {
        Manager manager = new Manager("001", "张三", 15000, 10000);
        manager.work();
        manager.eat();
        System.out.println("manager的值："+manager.getId()+","+manager.getName()+","+manager.getMoney()+","+manager.getManagerMoney());
        System.out.println("--------------------------------------------------");

        Chef chef = new Chef("002", "李四", 7500);
        chef.work();
        chef.eat();
        System.out.println("chef的值："+chef.getId()+","+chef.getName()+","+chef.getMoney());
        System.out.println("--------------------------------------------------");

        Manager manager2 = new Manager();
        manager2.work();
        manager2.eat();
        System.out.println("manager2的默认值："+manager2.getId()+","+manager2.getName()+","+manager2.getMoney()+","+manager2.getManagerMoney());



    }
}
