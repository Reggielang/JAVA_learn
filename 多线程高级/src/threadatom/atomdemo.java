package threadatom;

public class atomdemo {
    public static void main(String[] args) {
        myatomthread atom = new myatomthread();
        for (int i = 0; i < 100; i++) {
            new Thread(atom).start();
        }
    }
}
