public class Exceptiondemo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(arr[10]); //ArrayIndexOutOfBoundsException

        String s = null;
        System.out.println(s.equals("嘿嘿")); //NullPointerException

        //当代码出现了异常，那么就在这里创建了一个异常对象
        //首先会看，程序中有没有自己处理异常的代码，如果没有交给本方法的调用者处理，
        //最终会交给虚拟机默认处理
        //JVM默认处理异常做了什么：1.将异常信息以红色字体展示在控制台上 2.停止程序的运行，下面的代码无法执行
    }
}
