package learing.inheritance.homework04;

public class Worker extends Person {
    private String unit;
    private double workAge;

    public Worker() {
    }

    public Worker(String name, String gender, int age, String nationality, String unit, double workAge) {
        super(name, gender, age, nationality);
        this.unit = unit;
        this.workAge = workAge;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public double getWorkAge() {
        return workAge;
    }

    public void setWorkAge(double workAge) {
        this.workAge = workAge;
    }

    @Override
    public void work() {
        System.out.println("工人的工作是盖房子");
    }
}
