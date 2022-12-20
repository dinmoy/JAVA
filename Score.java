package Score;

import java.util.Scanner;

public class student {
	String name_Num;
	String name;
	int[] subject;
	double avg;
	char result;
	int rank;
	
	
}

public class Score {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 명의 학생을 입력하시겠습니까 : ");
		int stu_num = sc.nextInt();
		System.out.print("몇 과목을 입력하시겠습니까 : ");
		int sub = sc.nextInt();
		
		student[] stu = new student[stu_num];
		
		
		for(int i = 0; i < stu_num; i++) stu[i].rank = 1;
		
		String[] sub_name = {"국어", "영어", "수학", "자바", "C", "과학", "사회", "기가", "한국사", "일본어"};
		for(int i = 0; i < stu_num; i++) {
			System.out.println((i+1) + "번째 학생 입력");
			System.out.print("학번 : ");
			stu[i].name_Num = sc.next();
			System.out.print("이름 : ");
			stu[i].name = sc.next();

			for(int j = 0; j < stu[i].subject.length - 1; j++) {
				do {
					System.out.print(sub_name[j] + " : ");
					stu[i].subject[j] = sc.nextInt();
				} while(stu[i].subject[j] < 0 || stu[i].subject[j] > 100);

				stu[i].subject[sub] += stu[i].subject[j];
			}
			
			stu[i].avg = (double)stu[i].subject[sub] / sub;

			switch((int)stu[i].avg / 10) {
			case 10 : case 9 : 
				stu[i].result ='A'; 
				break;
			case 8 : 
				stu[i].result ='B';
				break;
			case 7 : 
				stu[i].result ='C';
				break;
			case 6 :
				stu[i].result ='D';
				break;
			default : 
				stu[i].result = 'E';
			}
		}
		
		for(int i = 0; i < stu[i].subject.length; i++) {
			for(int j = i+1; j < stu_num; j++) {
				if(stu[i].subject[sub] < stu[i].subject[sub]) stu[i].rank++;
				else if(stu[i].subject[sub] > stu[i].subject[sub]) stu[j].rank++;
			}
		}

		for(int i = 0; i < stu_num; i++) {
			System.out.printf("%4s %6s ",stu[i].name_Num, stu[i].name);
			for(int j = 0; j < stu[i].subject.length; j++)
				System.out.printf("%7d ", stu[i].subject[j]);
			System.out.printf(" %9.2f %4c %4d\n", stu[i].avg, stu[i].result, stu[i].rank);
		}
	}
}