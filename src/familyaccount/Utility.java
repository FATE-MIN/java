package familyaccount;
import java.util.Scanner;
/**
 * 
 * @Description
 * @author 86131
 * @date 2022年2月15日上午11:51:13
 */
public class Utility {
	private static Scanner scanner = new Scanner(System.in);

	public static String readKeyBoard(int limit) {
		String line = "";
		while(scanner.hasNext()) {                 //判断键盘输入是否还有下一项
			line = scanner.nextLine();
			if(line.length() <1 || line.length() > limit) {
				System.out.println("输入错误，请重新输入！");
				continue;
			}
			else {
				break;
			}
		}
		
		return line;
	}
	
	public static char readMenuSelection() {
		char c;
		for(; ; ) {
			String str = readKeyBoard(1);
			c = str.charAt(0);
			if(c != '1' && c != '2' && c != '3' && c != '4') {
				System.out.print("输入错误，请重新输入！\n");
			}
			else break;
		}
		return c;
		}
	public static int readNumber() {
		int n;
		for(; ; ) {
			String str = readKeyBoard(4);
			try {
				n = Integer.parseInt(str);
				break;
			} catch (NumberFormatException e) {
				System.out.print("输入数字错误，请重新输入！");
			}
		}
		return n;
	}
	public static String readString() {
		String str = readKeyBoard(8);
		return str;
	}
	public static char readConfirmSelection() {
		char c;
		for(; ; ) {
			String str = readKeyBoard(1).toUpperCase();
			c = str.charAt(0);
			if(c == 'Y' || c == 'N') {
				break;
			} else {
				System.out.print("选择错误，重新输入！");
			}
		}
		return c;
	}
}