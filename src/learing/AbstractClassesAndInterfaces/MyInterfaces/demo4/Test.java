package learing.AbstractClassesAndInterfaces.MyInterfaces.demo4;

public class Test {
    public static void main(String[] args) {
        Coach coach = new BasketballCoach("John", 30);
        System.out.println(coach.getName()+" is "+coach.getAge()+" years old.");
        coach.teach();

        PingpangCoach pingpangCoach = new PingpangCoach("Mary", 25);
        System.out.println(pingpangCoach.getName()+" is "+pingpangCoach.getAge()+" years old.");
        pingpangCoach.teach();
        pingpangCoach.speak();

        PingpangPlayer pingpangPlayer = new PingpangPlayer("May", 25);
        System.out.println(pingpangPlayer.getName()+" is "+pingpangPlayer.getAge()+" years old.");
        pingpangPlayer.play();
        pingpangPlayer.speak();

        Player BasketballPlayer = new BasketballPlayer("Bill", 25);
        System.out.println(BasketballPlayer.getName()+" is "+BasketballPlayer.getAge()+" years old.");
        BasketballPlayer.play();
    }
}
