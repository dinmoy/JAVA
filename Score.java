package Score;

import java.util.Scanner;

class student {
	String name_Num;
	String name;
	int[] subject;
	double avg;
	char result;
	int rank=1;

	student(int subcnt){
		this.subject=new int[subcnt+1];
	}
	void print() {
		System.out.printf("%4s %6s ",name_Num, name);
		for(int j = 0; j < subject.length; j++)
			System.out.printf("%7d ", subject[j]);
		System.out.printf(" %9.2f %4c %4d\n", avg, result, rank);
	}
	
	void input(int i,String[] sub_name) {
		Scanner sc = new Scanner(System.in);
		System.out.println((i+1) + "번째 학생 입력");
		System.out.print("학번 : ");
		name_Num = sc.next();
		System.out.print("이름 : ");
		name = sc.next();

		for(int j = 0; j < subject.length-1; j++) {
			do {
				System.out.print(sub_name[j] + " : ");
				subject[j] = sc.nextInt();
			} while(subject[j] < 0 || subject[j] > 100);
		}
	}
	
	void calcul() {
		int sub=subject.length-1;
		
		for(int j = 0; j < sub; j++) 
			subject[sub] +=subject[j];
		avg = (double)subject[sub] / sub;
		

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
	}
	void ranking(student[] stu) {
		for(int j = 0; j < stu.length; j++) {
			if(subject[subject.length-1] < stu[j].subject[subject.length-1]) rank++;
		}
	}

}

public class Score {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 명의 학생을 입력하시겠습니까 : ");
		int stu_num = sc.nextInt();
		System.out.print("몇 과목을 입력하시겠습니까 : ");
		int sub = sc.nextInt();

		student[] stu = new student[stu_num];
		for(int i = 0; i < stu_num; i++) stu[i]=new student(sub);

		String[] sub_name = {"국어", "영어", "수학", "자바", "C", "과학", "사회", "기가", "한국사", "일본어"};
		
		for(int i = 0; i < stu_num; i++) {
			stu[i].input(i,sub_name);
			stu[i].calcul();
		}

		for(int i = 0; i < stu_num; i++) stu[i].ranking(stu);//stu[i]의 순위 결정
		
		for(int i = 0; i < stu_num; i++) stu[i].print(); //출력

	}
}