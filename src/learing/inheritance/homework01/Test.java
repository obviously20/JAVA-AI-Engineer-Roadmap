package learing.inheritance.homework01;

public class Test {
    public static void main(String[] args) {
        //创建讲师对象
        Lecturer l = new Lecturer("001", "张三", "讲课");
        System.out.println(l.getId()+" "+l.getName()+" "+l.getResponsibility());
        l.work();

        //创建助教对象
        Tutor t = new Tutor("002", "李四", "辅导");
        System.out.println(t.getId()+" "+t.getName()+" "+t.getResponsibility());
        t.work();

        //创建采购专员对象
        Buyer b = new Buyer("003", "王五", "采购");
        System.out.println(b.getId()+" "+b.getName()+" "+b.getResponsibility());
        b.work();

        //创建维护专员对象
        Maintainer m = new Maintainer("004", "赵六", "维护");
        System.out.println(m.getId()+" "+m.getName()+" "+m.getResponsibility());
        m.work();
    }
}
