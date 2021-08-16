package Homework;

public class People {
        String name;
        int age;
        int sex;

        public void study(){
            System.out.println("学习");
        }
        public void showage(){
            System.out.println(age);
        }

        public int addAge(int i){
            age+=i;
            return age;
        }
}
