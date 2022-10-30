package JAVA;

import java.util.Scanner;

public class Bubbelsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int count=sc.nextInt();
		int[] arr=new int[count];
		int i,j,temp;
		
		for(i=0;i<arr.length;i++) arr[i]=sc.nextInt();
		
		for(i=0;i<arr.length;i++) {
			for(j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		for(i=0;i<arr.length;i++) System.out.println(arr[i]);
		

	}

}
