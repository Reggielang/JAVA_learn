package lambda5;

public class test {
    public static void main(String[] args) {
        useCalculator(new Calculator() {
            @Override
            public int calu(int a, int b) {
                return a+b;
            }
        });
        //lambda实现
        useCalculator((a,b)->{return a+b;});
    }
    public static  void useCalculator(Calculator calculator){
        int result = calculator.calu(10,20);
        System.out.println(result);
    }
}

interface Calculator{
    int calu(int a,int b);
}