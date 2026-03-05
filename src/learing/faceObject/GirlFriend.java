package learing.faceObject;

public class GirlFriend {
    //类的属性：姓名、年龄、性别、手机号等
    private String name;
    private int age;
    private String sex;
    private String phoneNumber;
    private double height;
    private double weight;

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        if(age<=0){
            System.out.println("Age is invalid");
        }
        else{
            this.age=age;
        }
    }
    public int getAge(){
        return age;
    }
    public void setSex(String sex){
        this.sex=sex;
    }
    public String getSex(){
        return sex;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void setHeight(double height){
        if(height<=0){
            System.out.println("Height is invalid");
        }
        else{
            this.height=height;
        }
    }
    public double getHeight(){
        return height;
    }
    public void setWeight(double weight){
        if(weight<=0){
            System.out.println("Weight is invalid");
        }
        else{
            this.weight=weight;
        }
    }
    public double getWeight(){
        return weight;
    }

    //类的行为：聊天、送礼物、购物、撒娇、生气等
    public void chat(){
        System.out.println("Chatting with "+name+"...");
    }
    public void sendGift(){
        System.out.println(name+"Sending Gift to me"+"...");
    }
    public void buy(){
        System.out.println(name+"Buying something"+"...");
    }
    public void beLazy(){
        System.out.println(name+"Be Lazy"+"...");
    }
    public void beAngry(){
        System.out.println(name+"Be Angry:"+"哼...");
    }
}
