package Sample;

import java.util.Scanner;
public class Alpabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int num=(int)(sc.next().charAt(0)-64);
		
		 char[] alpabet=new char[num];
		
		 //입력
		 for(int i=0;i<alpabet.length;i++) {
			 alpabet[i]=(char)(65+i);
		 }
		
		 //출력
		 for(int i=0;i<alpabet.length;i++) {
			 System.out.print(alpabet[i]+" ");
		 }
		
		 System.out.println();
		
		 for(int i=0;i<alpabet.length;i++) {
			 System.out.print((char)(alpabet[i]+32)+" ");
		 } 
	}
}
