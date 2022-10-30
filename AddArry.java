package JAVA;

import java.util.Scanner;

public class AddArry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int count1=sc.nextInt();
		int count2=sc.nextInt();

		int[] arr1=new int[count1];
		int[] arr2=new int[count2];

		int i,j,temp;

		for(i=0;i<arr1.length;i++) arr1[i]=sc.nextInt();

		for(i=0;i<arr2.length;i++) arr2[i]=sc.nextInt();

		int result=arr1.length+arr2.length;

		int[] arrsum=new int[result];
		
		for(i=0;i<arr1.length;i++) arrsum[i]+=arr1[i];
		
		for(i=0;i<arr2.length;i++) arrsum[i+arr1.length]+=arr2[i];
		

		for(i=0;i<arrsum.length-1;i++) {
			for(j=i+1;j<arrsum.length;j++) {
				if(arrsum[i]>arrsum[j]) {
					temp=arrsum[i];
					arrsum[i]=arrsum[j];
					arrsum[j]=temp;
				}
			}
		}

		for(i=0;i<arrsum.length;i++) System.out.print(arrsum[i]+" ");
	}

}
