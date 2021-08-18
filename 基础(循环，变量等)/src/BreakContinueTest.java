//break 使用在switch case 和循环结构中 --结束当前循环 --关键字后面不能声明执行语句

//continue 只能在循环结构中使用 --结束当次循环--关键字后面不能声明执行语句




public class BreakContinueTest {
    public static void main(String[] args){
            for (int i=1;i<=10;i++){
                if (i%4==0){
                    //break;123
                    continue; // 1235678910
                }
                System.out.print(i);
            }
            for (int i=1;i<=4;i++){
                for (int j=1;j<=10;j++){
                    if (j%4==0){
//                        break; //默认跳出包裹关键字的最近的一层循环
//                        continue;
                        //break label; //结束指定标识的一层循环结构


                    }
                    System.out.print(j);
                }
                System.out.println();
            }

    }
}
