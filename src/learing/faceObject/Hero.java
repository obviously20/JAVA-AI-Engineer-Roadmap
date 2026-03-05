package learing.faceObject;

import java.sql.SQLOutput;
import java.util.Random;

public class Hero {
    //类的属性：姓名、血量
    private String name;
    private int blood;
    private String gander;
    private String face;

    public Hero() {
    }
    public Hero(String name, int blood,String gander) {
        this.name = name;
        this.blood = blood;
        this.gander=gander;
        setFace(gander);
    }


    //容颜：

    String[] boyfaces= {"风流俊雅","气宇轩昂","相貌英俊","五官端正","相貌平平","一塌糊涂","面目狰狞"};
    String[] girlfaces ={"美奂绝伦","沉鱼落雁","婷婷玉立","身材娇好","相貌平平","相貌简陋","惨不忍睹"};


    //attack 攻击描述：
    String[] attacks_desc={
            "%s使出了一招【背心钉】，转到对方的身后，一掌向%s背心的灵台穴拍去。",
            "%s使出了一招【游空探爪】，飞起身形自半空中变掌为抓锁向%s。",
            "%s大喝一声，身形下伏，一招【劈雷坠地】，捶向%s双腿。",
            "%s运气于掌，一瞬间掌心变得血红，一式【掌心雷】，推向%s。",
            "%s阴手翻起阳手跟进，一招【没遮拦】，结结实实的捶向%s。",
            "%s上步抢身，招中套招，一招【劈挂连环】，连环攻向%s。"
    };

    //injured 受伤描述：
    String[] injureds_desc={
            "结果%s退了半步，毫发无损",
            "结果给%s造成一处瘀伤",
            "结果一击命中，%s痛得弯下腰",
            "结果%s痛苦地闷哼了一声，显然受了点内伤",
            "结果%s摇摇晃晃，一跤摔倒在地",
            "结果%s脸色一下变得惨白，连退了好几步",
            "结果『轰』的一声，%s口中鲜血狂喷而出",
            "结果%s一声惨叫，像滩软泥般塌了下去"
    };


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String gander) {
        if(gander.equals("男")){
            Random random = new Random();
            int index = random.nextInt(boyfaces.length);
            this.face=boyfaces[index];
        }else if(gander.equals("女")){
            Random random = new Random();
            int index = random.nextInt(girlfaces.length);
            this.face=girlfaces[index];
        }else{
            this.face="相貌异常";
        }
    }

    public String getGander() {
        return gander;
    }

    public void setGander(String gander) {
        this.gander = gander;
    }

    public void showData(){
        System.out.println("姓名："+name+" 血量："+blood+" 性别："+gander+" 容颜："+face);
    }

    public void attack(Hero hero2){
        //攻击描述
        Random random = new Random();
        int index = random.nextInt(attacks_desc.length);
        String attack_desc=attacks_desc[index];
        System.out.printf(String.format(attack_desc,this.getName(),hero2.getName()));
        System.out.println();

        int hurt = random.nextInt(20)+1;
        int lastblood=hero2.getBlood()-hurt;
        lastblood=lastblood<0?0:lastblood;
        hero2.setBlood(lastblood);

        //受伤描述
        if(lastblood>90){
            System.out.printf(injureds_desc[0],hero2.getName());
        }else if(lastblood>70){
            System.out.printf(injureds_desc[1],hero2.getName());
        }else if(lastblood>60){
            System.out.printf(injureds_desc[2],hero2.getName());
        }else if(lastblood>50){
            System.out.printf(injureds_desc[3],hero2.getName());
        }else if(lastblood>40){
            System.out.printf(injureds_desc[4],hero2.getName());
        }else if(lastblood>30){
            System.out.printf(injureds_desc[5],hero2.getName());
        }else if(lastblood>10){
            System.out.printf(injureds_desc[6],hero2.getName());
        }else{
            System.out.printf(injureds_desc[7],hero2.getName());
        }
        System.out.println();
    }
}
