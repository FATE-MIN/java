package javaxy1;

//JDK=JRE+java开发工具
//JRE=JVM+java核心类库
//双指针
/**
 * 
 * @Description
 * @author 86131
 * @date 2022年2月15日上午11:49:56
 */
public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello,Eclipse!");
		int x = 10,i;
		String y = "xy";
		boolean b = false;
		System.out.println(b);
		System.out.println(y);
		System.out.println(x);
		for(i=0;i<5;i++) {
			System.out.println(i);
		}
		if(i==3) {
			System.out.println(i);
		}
		else {
			System.out.println(i+1);
		}
		byte s = 4;
		System.out.print("s=");
		System.out.println(s);
		String name;
		name = "NJAU";
		System.out.println(name);
		int myNumber = 10001;
		System.out.println(myNumber);
		double f = 3.141592635;
		float f1 = 3.24f;
		long l = 10000l;
		System.out.println(f);
		System.out.println(f1);
		System.out.println(l);
		System.out.println(f*10);
		int a = 10;
		char c = 'a';
		String str = "hi";
		System.out.println(c+str+a);
		System.out.println(str+c+a);
		System.out.println(c+a+str);
		System.out.println('a'+1); 
		System.out.println('*'+"\t"+"*");
		System.out.println('*'+'*');
		System.out.println("hello"+2+5);
		for(i=0;i<=9;i++) {
			System.out.println(i);
		}
		int num = 0b001001;
		int num2 = 0x1283ad;
		System.out.println(num);
		System.out.println(num2);
		System.out.println(num+0x234);
		System.out.println(num+0b1101110);
		System.out.println(1);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		double d = 19.54;
		System.out.println(d);
		System.out.println("println");
		System.out.println(5%2);
		int k = 0,k2 =0;
		for(i=0;i<=10;i++) {
			if(i%2==0) {
				k = ++i;
				k2 = i++;
				System.out.print("k:");
				System.out.print(k);
				System.out.print("\t");
				System.out.print("k2:");
				System.out.print(k2);
				System.out.print("\t");
			}
		}
		System.out.print("\n");
		System.out.println((int)d);
		int i1 = 10;
		int i2 = 20;
		i = i1++;
		System.out.print("i="+i);
		System.out.println("i1="+i1);
		i = ++i1;
		System.out.print("i="+i);
		System.out.println("i1="+i1);
		i = i2--;
		System.out.print("i="+i);
		System.out.println("i2="+i2);
		i = --i2;
		System.out.print("i="+i);
		System.out.println("i2="+i2);
		//任意一个三位数，给出百位、十位以及个位。
		int x1 = 198;
		System.out.print("百位:");
		System.out.print(x1/100);
		System.out.print("十位:");
		System.out.print(x1%100/10);
		System.out.print("个位");
		System.out.print(x1%100%10);
		System.out.println(1);
		System.out.println(2&3);
		//System.out.println(0&&1);
		boolean b1 =true;
		//一个&:左边false时两边都执行，双&&不执行右边
		System.out.println(b&b1);
		System.out.println(b&&b1);
		int x2 = 1;
		int y2 = 1;
		if(x2++==2 && ++y2==2) {
			System.out.println("df1");
		}
		else {
			System.out.println("y2=" +y2);
			System.out.println("x2=" +x2);
		}
	}
}
