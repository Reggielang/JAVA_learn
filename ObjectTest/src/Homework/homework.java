package Homework;

public class homework {
    public static void main(String[] args) {
        People p1 = new People();
        p1.name= "Tom";
        p1.age=18;
        p1.sex = 1;//1为男，0为女
        p1.study();
        p1.showage();
        int newage = p1.addAge(2);
        System.out.println(newage);


        //*******************
        People p2 = new People();
        p2.showage();
    }
}


