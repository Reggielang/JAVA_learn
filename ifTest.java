//分支结构 if else （条件判断结构）

//三种形式
//if（条件表达式）{执行表达式}
//if(条件表达式){执行表达式}else{执行表达式}
//if(条件表达式){执行表达式}else if（条件表达式）{执行表达式}else{执行表达式}


public class ifTest {
    public static void main(String[] args){
        int heartBeats = 178;
        if (heartBeats <60|heartBeats>100){
            System.out.println("需要进行检查了");
        }
        System.out.println("检查结束");

        int age =23;
        if(age<18){
            System.out.println("可以看动画片");
        }else{
            System.out.println("长大了，不看动画片");
        }

        if (age<0){
            System.out.println("输入不合法");
        }else if(age<18){
            System.out.println("青少年时期");
        }else if(age<35){
            System.out.println("青壮年时期");
        }else if(age <60){
            System.out.println("中年时期");
        }else{
            System.out.println("老年时期");
        }




//        测试

    }
}
