package learing.faceObject;

public class Dog {
    //定义狗类Dog。属性:毛的颜色color，品种breed。行为:吃饭()，看家lookHome()
    private String color;
    private String breed;
    public Dog(){
    }
    public Dog(String color,String breed){
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
    //行为:吃饭()，看家lookHome()
    public void eat(){
        System.out.println(color+"的"+breed+"正在啃骨头.....");
    }
    public void lookHome(){
        System.out.println(color+"的"+breed+"正在看家.....");
    }
}
