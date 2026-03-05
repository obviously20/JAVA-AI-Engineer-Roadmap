package learing.inheritance.homework01;

public class Maintainer extends AdminStaff{

    public Maintainer() {
    }

    public Maintainer(String id, String name, String responsibility) {
        super(id, name, responsibility);
    }

    //维护专员
    @Override
    public void work() {
        System.out.println("维护专员" + getName() + "正在维护公司内部");
    }
}
