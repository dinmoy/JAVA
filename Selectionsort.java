package JAVA;

import java.util.Scanner;

public class Selectionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] score=new int[10];
		int space;
		
		for(int i=0;i<score.length;i++) {
			System.out.print((i+1)+"번쨰 학생 점수: ");
			score[i]=sc.nextInt();
		}
		
		for(int i=0;i<score.length-1;i++) {
			//꼭 i+1이여야함
			for(int j=i+1;j<score.length;j++) {
				if(score[i]>score[j]) {
					space=score[i];
					score[i]=score[j];
					score[j]=space;
				}
			}
		}
		//for문이 다르므로 출력문은 다르게 해야함
		for(int i=0;i<score.length;i++) System.out.println(score[i]);

	}

}
