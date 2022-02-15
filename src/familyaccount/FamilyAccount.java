package familyaccount;
import java.util.Scanner;
/**
 * 
 * @Description
 * @author 86131
 * @date 2022年2月15日上午11:51:04
 */
public class FamilyAccount {
	Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean isFlag = true;
		String details = "";
		//初始金额
		int balance = 10000;
		while(isFlag) {
			System.out.println("---------------家庭收支记录---------------\n");
			System.out.println("               1.收支明细                  ");
			System.out.println("               2.登记支出                  ");
			System.out.println("               3.登记收入                  ");
			System.out.println("               4.退    出                  \n");
			System.out.println("               请选择(1-4):");
			
			char selection = Utility.readMenuSelection();//获取用户选择
			switch(selection) {
			case '1':
				//System.out.println("1.收支明细");
				System.out.println(" ------------当前收支------------");
				System.out.println("收支\t账户金额\t收支金额\t说   明\n");
				//details = "初始金额\t" + balance + "\t" ;
				System.out.println("\n");
				System.out.println(details);
				System.out.println("----------------------------------");
				break;
			case '2':
				//System.out.println("2.登记支出");
				System.out.print("本次支出(大于零)为:\t");
				int outcome = Utility.readNumber();
				if(outcome > balance) {
					System.out.println("余额不足！！！");
					break;
				}
				System.out.print("支出说明:\t");
				String str = Utility.readString();
				details = "支出\t" + (balance-outcome) + "\t" + outcome + "\t" + str;
				System.out.print("\n");
				balance -= outcome;
				break;
			case '3':
				//System.out.println("3.登记收入");
				System.out.print("本次收入为:\t");
				int money = Utility.readNumber();
				System.out.print("本次收入说明:\t");
				String info = Utility.readString();
				details += "收入\t" + (balance+money) + "\t" + money + "\t" + info ;
				balance += money ;
				System.out.println("\n");
				System.out.println("---------------登记完成-----------------");
				break;
			case '4':
				//System.out.println("4.退    出");
				System.out.println("确认是否退出(y/n)");
				char isExit = Utility.readConfirmSelection();
				if(isExit == 'Y') {
					isFlag = false;
					System.out.println("退出成功");
					break;
				}
			}
		}
	}
}