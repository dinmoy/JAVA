package Sample;

import java.util.Scanner;
public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 명의 학생을 입력하시겠습니까 : ");
		int stu_num = sc.nextInt();
		System.out.print("몇 과목을 입력하시겠습니까 :");
		int grade_num=sc.nextInt();
		int[] grade;

		String[] subject_name= {"국어","영어","수학","자바","C언어","과학","사회","기가","한국사","일본어"};
		
		
		
		for(int i = 1; i <= stu_num; i++) {
			grade=new int[grade_num+1];
			System.out.println(i + "번째 학생 입력");
			String name_Num, name;
			System.out.print("학번 : ");
			name_Num = sc.next();
			System.out.print("이름 : ");
			name = sc.next();

			int korea, english, math, java;

			for(int j=0;j<grade.length-1;j++) {
				do {
					System.out.print(subject_name[j]+" : ");
					grade[j]= sc.nextInt();
					// if(korea >= 0 && korea <= 100) break;

				} while(grade[j] < 0 || grade[j] > 100);
				grade[grade_num] += grade[j];
			}
				
				double avg = (double)grade[grade_num] / grade_num;
				
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
				for(int k=0;k<grade.length;k++) {
					System.out.print(grade[k]+" ");
				}
				System.out.printf(" %.2f %c\n", avg, result);
		}

	}

}
//score배열은 정수형이고 길이는 10이다
//최대값을 결정하기 위한 변수 max를 사용해라
