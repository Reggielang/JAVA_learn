public class Exceptiondemo5 {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5};
        int[] arr = null;
        //好处：为了能让代码继续往下执行
        try{
            //有可能发生异常的代码
            printArr(arr);
        }catch(NullPointerException e){
            //如果出现了这样的异常，进行什么操作
            System.out.println("参数不能为Null");
        }
        System.out.println("我执行了么");
    }

    private static void printArr(int[] arr) {
        if (arr ==null){
            throw new NullPointerException();// 当参数为null的时候，手动创建了一个异常对象给调用者
        }else {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
        }
        }
    }
}
