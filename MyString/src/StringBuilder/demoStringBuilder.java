package StringBuilder;

public class demoStringBuilder {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i <= 50000; i++) {
            sb.append(i);
        }
        System.out.println(sb);
        long end = System.currentTimeMillis();

        long spend = end - start;
        System.out.println(spend);


//        oldmethod();

    }

    private static void oldmethod() {
        long start = System.currentTimeMillis(); // 1970年1月1日，到当前时间的经历的毫秒值
        String s = "";

        for (int i = 0; i <= 50000; i++) {
            s+=i;
        }
        long end = System.currentTimeMillis();
        System.out.println(s);
        long spend = end - start;
        System.out.println(spend);
    }

}
