package Sample;

import java.util.Scanner;
public class Array_Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] score=new int[10];

		//입력
		for(int i=0;i<score.length;i++) {
			System.out.print((i+1)+"번쨰 학생의 점수: ");
			score[i]=sc.nextInt();
		}

		int max=score[0];

		//처리
		for(int j=0;j<score.length;j++) {
			if(score[j]>max) max=score[j];
			else max=max;
		}

		//출력
		System.out.println("최고점수: "+max);

	}

}
