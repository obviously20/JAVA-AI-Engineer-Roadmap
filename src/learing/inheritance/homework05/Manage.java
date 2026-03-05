package learing.inheritance.homework05;

public class Manage extends Employee {
    private double bonus;

    public Manage() {
    }

    public Manage(String name, String id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("Manage worked!");
    }
}
