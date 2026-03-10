package learing.InnerClass.demo1;

public class Car {//TODO 汽车是一个外部类
    /*需求:写一个Javabean类描述汽车。
    属性:汽车的品牌，车龄，颜色，发动机的品牌，使用年限。
    内部类的访问特点:
    内部类可以直接访问外部类的成员，包括私有；外部类要访问内部类的成员，必须创建对象*/
    private String CarBrand;
    private int CarAge;
    private String Carcolor;

    public void show(){
        System.out.println("CarBrand: " + CarBrand);
        //TODO 外部类要访问内部类的成员，必须创建对象
        Engine e = new Engine("Benz", 2023);
        System.out.println("EngineBrand: " + e.getEngineBrand());
        System.out.println("EngineAge: " + e.getEngineAge());
    }


     class Engine{//TODO 发动机是汽车的一个部件，所以发动机是汽车的内部类
        private String EngineBrand;
        private int EngineAge;

        void showtoo(){
            //TODO 内部类可以直接访问外部类的成员，包括私有
            System.out.println("CarBrand: " + CarBrand);
        }

         public Engine() {
         }

         public Engine(String engineBrand, int engineAge) {
             EngineBrand = engineBrand;
             EngineAge = engineAge;
         }

         public String getEngineBrand() {
             return EngineBrand;
         }

         public void setEngineBrand(String engineBrand) {
             EngineBrand = engineBrand;
         }

         public int getEngineAge() {
             return EngineAge;
         }

         public void setEngineAge(int engineAge) {
             EngineAge = engineAge;
         }
     }

    public Car(String carBrand, int carAge, String carcolor) {
        CarBrand = carBrand;
        CarAge = carAge;
        Carcolor = carcolor;
    }

    public Car() {
    }


    public String getCarBrand() {
        return CarBrand;
    }

    public void setCarBrand(String carBrand) {
        CarBrand = carBrand;
    }

    public int getCarAge() {
        return CarAge;
    }

    public void setCarAge(int carAge) {
        CarAge = carAge;
    }

    public String getCarcolor() {
        return Carcolor;
    }

    public void setCarcolor(String carcolor) {
        Carcolor = carcolor;
    }
}
