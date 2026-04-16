package learing.dynamicproxy;

public class Test {
    public static void main(String[] args) {
        //需求：
        //     *   外面的人想要大明星唱一首歌
        //     *   1. 获取代理的对象
        //     *      代理对象 = ProxyUtil.createProxy(大明星的对象);
        //     *   2. 再调用代理的唱歌方法
        //     *      代理对象.唱歌的方法("只因你太美");


        //1. 获取代理的对象
        BigStar star = new BigStar("ikun");
        Star starProxy = ProxyUtil.createProxy(star);
        //2. 再调用代理的唱歌方法
        String result = starProxy.sing("只因你太美");
        System.out.println(result);
        //3. 再调用代理的跳舞方法
        starProxy.dance();


    }
}
