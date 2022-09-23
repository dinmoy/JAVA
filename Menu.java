import java.util.Scanner;
public class Menu{
	public static void main(String args[ ]){
		Scanner sc=new Scanner(System.in);
		System.out.println("====To Do list====\n");
		System.out.println("1. 밥을 먹는다");
		System.out.println("2. 공부를 하다");
		System.out.println("3.편의점에 가다");
		System.out.print("=>입력=>");
		System.out.println("===========");
		int menu=sc.nextInt();
	
		switch(menu){
			case 1: eat();break;
			case 2: study(); break;
			case 3: costore();break;
		}
			
		
	}
}