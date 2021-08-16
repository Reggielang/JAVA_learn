package Homework;

public class ExerTest {
    public static void main(String[] args) {
        ExerTest test = new ExerTest();
        //1测试
//        test.method();
        //2测试
//        int area = test.method();
//        System.out.println(area);
        //System.out.println(test.method());
        int area = test.method(10,8);
    }
//    //1
//    public void method(){
//        for (int i =0;i<10;i++){
//            for (int j=0;j<8;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
    //2
//    public int method(){
//        for (int i =0;i<10;i++){
//            for (int j=0;j<8;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        return 10 * 8;
//    }
    //3
        public int method(int m,int n){
        for (int i =0;i<m;i++){
            for (int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        return m * n;
    }
}
