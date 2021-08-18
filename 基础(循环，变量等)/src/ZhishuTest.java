//输出质数的方式2
public class ZhishuTest {
    public static void main(String[] args){
        long start = System.currentTimeMillis();
        int count =0;
        label:for (int i = 2;i<=100000;i++){
            for (int j = 2;j<=Math.sqrt(i);j++){
                if (i%j==0){
                    continue label;
                }
            }
            //走到这里的都是质数
            System.out.println(i);
            count++;
        }
        long end = System.currentTimeMillis();
        System.out.println(count);
        System.out.println(end-start);
    }
}
