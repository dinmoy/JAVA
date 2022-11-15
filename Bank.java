package JAVA;

import java.util.Scanner;

class Account{

	private String accountNo;
	private int balance;
	static int cnt;

	Account(String accountNo){
		this.accountNo=accountNo;
		System.out.println(toString());
		cnt++;

	}
	public void deposit(int money) {
		balance+=money;
		System.out.println(toString());
	}

	public void withdraw(int money) {

		if(balance<money) System.out.println("잔액이 부족합니다");
		else 	balance-=money;
		System.out.println(toString());

	}
	//자바의 최상위 클래스 Object
	public String toString() {
		return "계좌번호 "+accountNo+"의 잔액은"+balance+"원 입니다";
	}


	String getaccountNo(){ 
		return accountNo; 
	} 
	int getbalance() { 
		return balance;
	} //set은 주로 void , get은 기본형 void setbalance(int a) { balance=a; }


}

public class Bank{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Account[] acc=new Account[5];
		int foundAcc=0;

		while(true) {
			System.out.println("1.계좌생성  2.입금  3.출금  4.잔액조회  5.계좌전채조회  0.종료");
			int menu=sc.nextInt();
			switch(menu) {
			case 1:
				System.out.print("계좌번호 입력 : ");
				acc[Account.cnt]=new Account(sc.next());

				break;
			case 2:
				System.out.print("계좌번호 입력 : ");
				String temp=sc.next();
				for(int i=0;i<Account.cnt;i++) {
					if(temp.equals(acc[i].getaccountNo())) {
						foundAcc=i;
						break;
					}
				}
				System.out.print("입금액 입력 : ");
				acc[foundAcc].deposit(sc.nextInt());
				break;
			case 3:
				System.out.print("계좌번호 입력 : ");
				temp=sc.next();
				for(int i=0;i<Account.cnt;i++) {
					if(temp.equals(acc[i].getaccountNo())) {
						foundAcc=i;
						break;
					}
				}
				System.out.print("입금액 입력 : ");
				acc[foundAcc].withdraw(sc.nextInt());
				break;
			case 4:
				//System.out.println(acc[i].toString());
				break;
			case 5:
				for(int i=0;i<Account.cnt;i++) {
					System.out.println(acc[i].toString());
				}
				break;
			case 0:
				return;
			default:

			}
		}


	}

}


