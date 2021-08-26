package lambda4;

import java.util.Random;

public class test {
    public static void main(String[] args) {
        useRamdomnumHandler(new RamdomnumHandler() {
            @Override
            public int getnum() {
                Random r = new Random();
                int num = r.nextInt(10)+1;
                return num;
            }
        });
        //lambda实现 --无参数有返回值 如果lambda所操作的接口中的方法，有返回值，一定要return
        useRamdomnumHandler(()->{
            Random r = new Random();
            int num = r.nextInt(10)+1;
            return num;
        });

    }
    public static void useRamdomnumHandler(RamdomnumHandler ramdomnumHandler){
        int result = ramdomnumHandler.getnum();
        System.out.println(result);
    }
}


interface RamdomnumHandler{
    int getnum();
}