//分支结构 Switch-case
//switch(表达式){
//    case 常量1:
//        执行语句1;
//        break;
//
//    case 常量2:
//        执行语句2;
//        break;
//
//    default;
//        执行语句n;
//        break;
//        }
//根据Switch表达式中的值，依次匹配各个case中的常量，一旦匹配成功，则进入相应case的执行语句
//然后继续向下执行其他case中的执行语句，直到遇到break语句才会退出
//Switch结构中的表达式只能是如下的6种数据类型之一，byte，short，char，int，枚举类型，string类型。
//case 只能声明常量不能声明范围
//break关键字是可选的
//default相当于不满足case的条件之后，执行（也是可选的，位置是灵活的）
public class SwitchcaseTest {
    public static void main(String[] args){
        int num =2 ;
        switch (num){
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            default:
                System.out.println("other");
                break;
        }
        System.out.println();
    }
}
