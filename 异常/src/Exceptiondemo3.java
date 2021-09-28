public class Exceptiondemo3 {
    public static void main(String[] args) {
        System.out.println("adadadadadadada");
        System.out.println("adadadadadadada");
        System.out.println("adadadadadadada");
        System.out.println("adadadadadadada");
        System.out.println("adadadadadadada");
/*
throws 用在方法声明后面，跟的是异常类名 表示声明异常，调用该方法有可能会出现这样的异常
throw 用再方法体内，跟的是异常对象名，表示手动抛出一个异常对象，由方法体内的语句处理

 */
        throw new RuntimeException();//当代码执行到这里，就创建一个异常对象
        //该异常创建之后，暂时没有手动处理，抛给了调用者处理
        //下面的代码不会再执行了
//        System.out.println("你执行了么");
    }
}
