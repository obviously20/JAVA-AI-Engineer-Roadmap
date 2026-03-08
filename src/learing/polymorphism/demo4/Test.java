package learing.polymorphism.demo4;

public class Test {
        public static void main(String[] args) {
            Pet dog = new Dog("黄色",1);
            Pet cat = new Cat("白色",1);
            Person person = new Person("张三",18);
            person.keepPet(dog,"骨头");
            System.out.println("————————————————————————————————————");
            person.keepPet(cat,"鱼");

            //批量修改选中后“shift+F6”-----变量在不同位置错落时
//            Pet p = new Dog("黄色",1);
//            System.out.println(p.eat("鱼"));

            
            //变量都在一列时要一起修改 按住alt选中要修改的内容
//            Pet p = new Dog("黄色",1);
//            Pet p = new Dog("黄色",1);

        }
}
