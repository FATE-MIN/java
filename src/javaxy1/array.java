package javaxy1;
import java.util.Scanner;
/**
 * 
 * @Description
 * @author 86131
 * @date 2022年2月15日上午11:49:21
 */
public class array {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int ids[];
		ids = new int[] {1,2,3,4,5};//静态初始化数组
		int[] a = new int[5]; //动态定义数组
		String[] str = new String[5]; 
		System.out.print(a.length);
		System.out.println("请输入常数：");
		for(int i=0;i<5;i++) {
			a[i] = scan.nextInt();
		}
		System.out.println("请输入字符串：");
		for(int i=0;i<5;i++) {
			str[i] = scan.next();
		}
		for(int i=0;i<5;i++) {
			System.out.print(str[i] + "\t");
		}
		
		int[] arr =  new int[] {8, 2, 1, 0, 3 };
		int[] index = new int[] {2, 0, 3, 2, 4, 0, 1, 3, 2, 3, 3};
		String tel = "";
		for(int i = 0; i < index.length; i++) {
			tel += arr[index[i]];
		}
		System.out.println("联系方式, " + tel);
		System.out.println();
		//二维数组
		
		int arr1[][] = new int[][] {{1,2,3},{4,5},{6,7,8}};
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				System.out.print(arr1[i][j] + "\t");
			}
//			System.out.print("\n");
		}
//		System.out.print(arr1[1].length);//alt+/ :补全代码
		//杨辉三角
		int YHSJ[][] = new int[10][];
		for(int i=0;i<10;i++) {
			YHSJ[i] = new int[i + 1];
		}
		for(int i=0;i<10;i++) {
			YHSJ[i][0] = 1;
			YHSJ[i][i] = 1;
			label:for(int j=1;j<YHSJ[i].length-1;j++) {
				if(i == 0) {
					break label;
				}
				YHSJ[i][j] = YHSJ[i-1][j] + YHSJ[i-1][j-1];
			}
		}
		for(int i=0;i<YHSJ.length;i++) {
			for(int j=0;j<YHSJ[i].length;j++) {
				System.out.print(YHSJ[i][j] + "\t");
			}
			System.out.print("\n");
		}
		
	}
}
