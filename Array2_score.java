package Sample;

import java.util.Scanner;

public class Array2_score {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);


		int[][] score=new int[5][3];
		int[] count=new int[5];
		int group=1;
		String[] str = {"완성도", "창의성", "이해도"};

		for(int i=0;i<score.length;i++) {
			System.out.println("=== "+(i+1)+"조 ===");
			for(int j=0;j<score[i].length;j++) {
				System.out.print(str[j]+" 점수: ");
				score[i][j]=sc.nextInt();
			}
		}

		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++)
				count[i]+=score[i][j];
		}

		int max=count[0];
		for(int i=0;i<score.length;i++) {
			if (max<count[i]) {
				max=count[i];
				group=i+1;
			}


		}
		System.out.println("최고팀:"+group+"번쨰 팀 -> 점수: "+max);



	}
									
} 
//선택정렬
