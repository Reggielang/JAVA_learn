public class Factorial3 {
    public static void main(String[] args) {
    //递归求阶乘
        int result = getJc(5);
        System.out.println(result);

    }

    private static int getJc(int i) {
        if (i==1){
            return 1;
        }else {
            return i*getJc(i-1);
        }
    }
}
