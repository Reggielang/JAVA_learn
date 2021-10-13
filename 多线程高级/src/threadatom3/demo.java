package threadatom3;

public class demo {
    public static void main(String[] args) {
        atomthread atom = new atomthread();
        for (int i = 0; i < 100; i++) {
            new Thread(atom).start();
        }
    }
}
