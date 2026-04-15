package learing.reflection.homework.t1;

public class Hero {
    private String name;
    private int age;
    private String skill;
    private String weapon;//武器
    private Double blood;//血量


    public Hero() {
    }

    public Hero(String name, int age, String skill, String weapon, Double blood) {
        this.name = name;
        this.age = age;
        this.skill = skill;
        this.weapon = weapon;
        this.blood = blood;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return skill
     */
    public String getSkill() {
        return skill;
    }

    /**
     * 设置
     * @param skill
     */
    public void setSkill(String skill) {
        this.skill = skill;
    }

    /**
     * 获取
     * @return weapon
     */
    public String getWeapon() {
        return weapon;
    }

    /**
     * 设置
     * @param weapon
     */
    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    /**
     * 获取
     * @return blood
     */
    public Double getBlood() {
        return blood;
    }

    /**
     * 设置
     * @param blood
     */
    public void setBlood(Double blood) {
        this.blood = blood;
    }

    public String toString() {
        return "Hero{name = " + name + ", age = " + age + ", skill = " + skill + ", weapon = " + weapon + ", blood = " + blood + "}";
    }
}
