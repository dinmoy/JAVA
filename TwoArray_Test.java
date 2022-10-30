package JAVA;

import java.util.Scanner;
public class TwoArray_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		
		int[][] arr=new int[num][num];
		int i,j;
		int a=1;
		
		for(i=0;i<arr.length;i++) {
			for(j=0;j<arr.length;j++) {
				arr[i][j]=a;
				System.out.print(arr[i][j]+" ");
				a++;
			}
			System.out.println();
		}
   }
}
