import java.util.Scanner;
public class Menu{
	public static void main(String args[ ]){
		Scanner sc=new Scanner(System.in);
		System.out.println("====To Do list====\n");
		System.out.println("1. ���� �Դ´�");
		System.out.println("2. ���θ� �ϴ�");
		System.out.println("3.�������� ����");
		System.out.print("=>�Է�=>");
		System.out.println("===========");
		int menu=sc.nextInt();
	
		switch(menu){
			case 1: eat();break;
			case 2: study(); break;
			case 3: costore();break;
		}
			
		
	}
}