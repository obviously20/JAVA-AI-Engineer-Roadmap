package learing.faceObject;

public class Cat {
    //定义猫类Cat。属性:毛的颜色color，品种breed。行为:吃饭eat()，抓老鼠catchMouse()
    private String color;
    private String breed;
    public Cat(){
    }
    public Cat(String color,String breed){
        this.color=color;
        this.breed=breed;
    }

    public void setColor(String color){
        this.color=color;
    }
    public String getColor(){
        return color;
    }
    public void setBreed(String breed){
        this.breed=breed;
    }
    public String getBreed(){
        return breed;
    }
    //行为:吃饭eat()，抓老鼠catchMouse()
    public void eat(){
        System.out.println(color+"的"+breed+"正在吃鱼.....");
    }
    public void catchMouse(){
        System.out.println(color+"的"+breed+"正在逮老鼠....");
    }
}
