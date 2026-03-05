package learing.inheritance.homework01;

public class Tutor extends Teacher{

    public Tutor() {
    }

    public Tutor(String id, String name, String responsibility) {
        super(id, name, responsibility);
    }

    //助教
    @Override
    public void work() {
        System.out.println("助教" + getName() + "正在辅导");
        System.out.println("助教" + getName() + "正在帮你模拟面试");
        System.out.println("助教" + getName() + "正在教你如何投递简历");
    }
}
