package Sample;

import java.util.Scanner;

public class Array_Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 명의 학생을 입력하시겠습니까 : ");
		int stu_num = sc.nextInt();
		String[] subj_name = {"국어", "영어", "수학", "자바", "C", "과학", "사회", "기가", "한국사", "일본어"};
		
		System.out.print("몇 과목을 입력하시겠습니까 : ");
		int subj_count=sc.nextInt();
		
		
		for(int i = 1; i <= stu_num; i++) {
			System.out.println(i + "번째 학생 입력");
			String name_Num, name;
			System.out.print("학번 : ");
			name_Num = sc.next();
			System.out.print("이름 : ");
			name = sc.next();

			int[] score=new int[5];
			
			for(int j=0; j<score.length-1; j++) {
				do {
					System.out.print(subj_name[j]+": ");
					score[j] = sc.nextInt();
					// if(score[0] >= 0 && score[0] <= 100) break;

				} while(score[j] < 0 || score[j] > 100);
				score[4] += score[j];
			}

			double avg = (double)score[4] / 4;
	
			char result;
			switch((int)avg / 10) {
				case 10 : case 9 : 
					result ='A'; 
					break;
				case 8 : 
					result ='B';
					break;
				case 7 : 
					result ='C';
					break;
				case 6 :
					result ='D';
					break;
				default : 
					result = 'E';
			}

			System.out.print(name_Num + " " + name + " ");
			for(int k=0; k<score.length; k++) {
				System.out.print(score[k] + " ");
			}
			System.out.printf(" %.2f %c\n", avg, result);
		}
	}

}
