package javaxy1;
import java.util.Scanner;
/**
 * 
 * @Description
 * @author 86131
 * @date 2022年2月15日上午11:50:10
 */
public class scan {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*System.out.println("please input the name :");
		String name = scan.next();
		System.out.println("please input the age :");
		int age = scan.nextInt();
		System.out.println("please input the weigth :");
		double weight = scan.nextDouble();
		System.out.println("are you siger?(yes/no)");
		boolean issinger = scan.nextBoolean();
		
		System.out.print("please input the gender :");
		String gender = scan.next();
		
		char genderchar = gender.charAt(1);//提取字符串上的字符
		System.out.println("name="+name);
		System.out.println("age="+age);
		System.out.println("sisinger="+issinger);
		System.out.println("gender="+genderchar);
		System.out.print("please input m=:");
		int m = scan.nextInt();
		System.out.print("please input n=");
		int n = scan.nextInt();
		int i;
		int min = (m>n)? n:m;
		for(i=min;i>0;i--) {
			if(m%i==0 && n%i==0) {
				System.out.println("the max gcd is:"+i);
				break;
			}
		}
		int max = (m>n)? m:n;
		for(i=max;i<=m*n;i++) {
			if(i%m==0 && i%n==0) {
				System.out.print("the min acd is:"+i);
				break;
			}
		}
		*/
		long start = System.currentTimeMillis();
		int n = 2;
		int i;
		int counts = 0;
		boolean isFlag = true;
		while(n<=100000) {
			for(i=2;i<=Math.sqrt(n);i++) {
				if(n % i == 0) {
					isFlag = false;
					break;//指定结束的循环标签
				}
			}
			if(isFlag == true) {
				counts++;
				//System.out.print(n);
				//System.out.print("\t");
			}
			isFlag = true;//标记isFlag为true
			n++;
		}
		long end = System.currentTimeMillis();//单位：毫秒
		System.out.print("\n");
		System.out.println("质数个数为:"+counts);
		System.out.print("the time wastes is :"+(end - start));
	}
	
}