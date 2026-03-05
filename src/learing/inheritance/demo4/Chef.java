package learing.inheritance.demo4;

public class Chef extends Employee {
    public Chef() {
        super();
    }

    public Chef(String id, String name, double money) {
        super(id, name, money);
    }

    @Override
    public void work() {
        System.out.println(super.getName()+"正在炒菜");
    }
}
