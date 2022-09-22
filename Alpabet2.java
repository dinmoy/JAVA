package Sample;

import java.util.Scanner;
public class Alpabet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		int num=(int)(sc.next().charAt(0));
		char base;
		
		
		//base=(num>='A' && num<='Z')?'A':'a';
		if(num>='A' && num<='Z')
			base='A';
		else base='a';
		
		
		char[] alpabet=new char[num-base+1];

		//입력
		for(int i=0;i<alpabet.length;i++) {
			alpabet[i]=(char)('A'+i);
		}

		//출력
		for(int i=0;i<alpabet.length;i++) {
			System.out.print(alpabet[i]+" ");
		}

		System.out.println();

		for(int i=0;i<alpabet.length;i++) {
			System.out.print((char)(alpabet[i]+('a'-'A'))+" ");
		}
	}
}
