package learing.inheritance.homework01;

public class Lecturer extends Teacher{

    public Lecturer() {
    }

    public Lecturer(String id, String name, String responsibility) {
        super(id, name, responsibility);
    }

    //讲师
    @Override
    public void work() {
        System.out.println("讲师" + getName() + "正在讲课");
    }
}
