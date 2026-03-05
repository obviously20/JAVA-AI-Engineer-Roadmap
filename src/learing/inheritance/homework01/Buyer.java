package learing.inheritance.homework01;

public class Buyer extends AdminStaff{

    public Buyer() {
    }

    public Buyer(String id, String name, String responsibility) {
        super(id, name, responsibility);
    }

    //采购专员
    @Override
    public void work() {
        System.out.println("采购专员" + getName() + "正在采购商品");
    }
}
