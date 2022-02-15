package javaxy1;
//import java.awt.datatransfer.SystemFlavorMap;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		System.out.println(4/3);
		Scanner scan =  new Scanner(System.in);
		int i0 = scan.nextInt();
		System.out.println("i0="+i0);
		boolean x;
		boolean y;
		short z = 42;
		if((z++==42)&&(y=true)) {
			z++;
		}
		if((x=false)||(++z==45)) z++;
		System.out.println("z="+z);
		System.out.println("6&3=" + (6&3));
		System.out.println(20%12);
		System.out.println(3<<2); //左移两位，原数乘以2的2(移位数)次幂
		System.out.println(3>>2);//右移两位，原数除以2的2(移位数)次幂
		//交换两数
		int a1 = 1,a2 = 2;
		int temp;
		temp = a1;
		a1 = a2;
		a2 = temp;
		System.out.println("a1="+a1);
		System.out.println("a2="+a2);
		int max = (a1 > a2)? a1 : a2;
		System.out.println(max);

	}
}