//家庭收支记账软件
public class FamliyAccount {
    public static void main(String[] args){
        boolean isFlag =true;
        //用于记录用户的收入和支出详情
        String details="收支\t账户金额\t收支金额\t说   明\n";
        //初始金额
        int balance =10000;
        while (isFlag){
            System.out.println("------------------家庭收支记账软件------------------------\n");
            System.out.println("                   1.收支明细");
            System.out.println("                   2.登记收入");
            System.out.println("                   3.登记支出");
            System.out.println("                   4.退出\n");
            System.out.print("                   请选择(1-4): \n");

            //获取用户的选择1-4之间
            char selection = Utility.readMenuSelection();
            switch (selection){
                case '1':
                    System.out.print("------------------当前收支明细信息-----------------------\n");
                    System.out.print(details);
                    System.out.print("------------------------------------------------------\n");
                    break;
                case '2':
                    System.out.print("本次收入金额:");
                    int addmoney = Utility.readNumber();
                    System.out.print("本次收入说明:");
                    String addinfo = Utility.readString();
                    //处理余额
                    balance+=addmoney;

                    //处理details
                    details+=("收入\t"+balance+"\t"+addmoney+"\t\t"+addinfo)+"\n";

                    System.out.print("----------------------登记完成--------------------------\n");
                    break;
                case '3':
                    System.out.print("本次支出金额:");
                    int minusmoney = Utility.readNumber();
                    System.out.print("本次支出说明:");
                    String minusinfo = Utility.readString();
                    //处理余额
                    if (balance>=minusmoney){
                        balance -= minusmoney;
                    }else {
                        System.out.println("支出超出额度，支付失败！");
                    }

                    //处理details
                    details+=("支出\t"+balance+"\t"+minusmoney+"\t\t"+minusinfo)+"\n";

                    System.out.print("----------------------登记完成--------------------------\n");
                    break;
                case '4':
                    //System.out.println("4.退   出");
                    System.out.print("确认是否退出(Y/N)? ");
                    char isExit = Utility.readConfirmSelection();
                    if (isExit=='Y'){
                        isFlag=false;
                    }
                    break;
            }
        }
    }
}

