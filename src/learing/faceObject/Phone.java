package learing.faceObject;

public class Phone {
    //类的属性：品牌、颜色、价格、屏幕尺寸等
    private String brand;
    private double price;
    private String color;


    //构造方法：用于创建对象时初始化对象的状态
    //构造方法的名称与类名相同，没有返回值类型（也不能写void）
    //可以有多个构造方法（构造方法的重载）
    //构造方法：用于虚拟机创建对象时调用，初始化对象的状态（给成员变量赋值）
    //构造方法的名称与类名相同，没有返回值类型（也不能写void）
    //TODO:构造方法的作用：创建对象时初始化对象的状态（给成员变量赋值）
    //TODO:如果没有定义构造方法，系统会提供一个默认的无参构造方法
    //TODO:如果定义了构造方法，系统就不会提供默认的无参构造方法
    //TODO:构造方法可以重载（可以定义多个构造方法，参数列表不同）
    public Phone(){
        System.out.println("Phone constructor is called.");
    }

    //构造方法的重载：可以定义多个构造方法，参数列表不同
    public Phone(String brand, double price,String color){
        this.brand = brand;
        this.price = price;
        this.color = color;
    }





    //TODO:this关键字：可以区分成员变量和局部变量（成员变量：类中定义的变量；局部变量：方法中定义的变量）
    //private修饰的成员变量，只能在本类中访问，不能在其他类中访问
    //如果需要在其他类中访问private修饰的成员变量，需要提供相应的操作（setter和getter方法）
    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getBrand(){
        return brand;
    }

    public void setPrice(double price){
        if(price>0){
            this.price = price;
        }else {
            System.out.println("Price is invalid.");
        }
    }
    public double getPrice(){
        return price;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }


    //类的方法：打电话、发短信、拍照等
    public void call(){
        System.out.println("Calling Phone...");
    }
    public void sendMessage(){
        System.out.println("Sending Message...");
    }
    public void takePhoto(){
        System.out.println("Taking Photo...");
    }
}
