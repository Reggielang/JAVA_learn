package GenericitySummarize;

import java.util.ArrayList;

/*
泛型方法
 */
public class Genericity6 {
    public static void main(String[] args) {
        GenericityImpl1<String> genericity = new GenericityImpl1<>();
        genericity.method("啊啊啊啊啊啊");

        GenricityImpl2 genricity2 = new GenricityImpl2();
        genricity2.method(19);
    }


}


//泛型接口
interface Genericty<E>{
    public abstract void method(E e);
}

//接口的实现类
class GenericityImpl1<E> implements Genericty<E>{

    @Override
    public void method(E e) {
        System.out.println(e);
    }
}

class GenricityImpl2 implements Genericty<Integer>{

    @Override
    public void method(Integer integer) {
        System.out.println(integer);
    }
}