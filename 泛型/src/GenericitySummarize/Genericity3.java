package GenericitySummarize;

import java.util.ArrayList;

/*
自定义泛型类
 */
public class Genericity3 {
    public static void main(String[] args) {
        Box<String> box1 = new Box<>();
        box1.setElement("aaa");

        String s = box1.getElement();
        System.out.println(s);

        Box<Integer> box2 = new Box<>();
        box2.setElement(20);
        Integer element2 = box2.getElement();
        System.out.println(element2);
    }

}
