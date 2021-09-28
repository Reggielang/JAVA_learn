public class Exceptiondemo7 {
    public static void main(String[] args) {

//        public String getMessage() 返回此throwable的详细消息字符串
//            public String toString() 返回此可抛出的简短描述
//            public void printStackTrace() 把异常的错误信息输出在控制台
        try {
            int[] arr = {1,2,3,4,5};
            System.out.println(arr[10]); //虚拟机自动创建了一个异常对象
        } catch (ArrayIndexOutOfBoundsException e) {
//            String message = e.getMessage();
//            System.out.println(message);
//            String s = e.toString();
//            System.out.println(s);
            e.printStackTrace();
        }

    }
}
