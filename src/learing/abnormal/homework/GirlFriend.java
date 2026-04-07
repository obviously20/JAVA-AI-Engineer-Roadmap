package learing.abnormal.homework;

public class GirlFriend {
    private String name;
    private int age;


    public GirlFriend() {
    }

    public GirlFriend(String name, int age) {
        this.name = name;
        this.age = age;
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
        if(name.length() < 3 || name.length() > 10){
            throw new NameFormatException(name+"姓名长度不在3-10之间");//"抛出异常给调用者处理
        }else{
            this.name = name;
        }
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
    public void setAge(int age) /*throws AgeFormatException*/ {//todo throws:声明出异常,如果是运行时异常,就不需要强制throws声明，可选写，
                                                                //todo 如果抛出的是编译异常,则必须throws声明，不能直接抛出
        if(age < 18 || age > 40){
            throw new AgeFormatException(age+"岁不在18-40岁");//"抛出异常给调用者处理
        }else{
            this.age = age;
        }
    }

    public String toString() {
        return "GirlFriend{name = " + name + ", age = " + age + "}";
    }
}
