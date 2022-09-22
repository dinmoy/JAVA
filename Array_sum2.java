package Sample;

public class Array_sum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//더하기 식을 1번만 사용
		
		int[] arr=new int[100];
		int sum=0;
		
		//입력
		for(int i=0;i<arr.length;i++) arr[i]=i+1;
		
		
		//처리
		int tog=-1;
		for(int i=0;i<arr.length;i++) {
			
			//-1 1
			tog=tog*-1; //tog*=-1;
			sum=sum+(arr[i]*tog);
			if(arr[i]%2==0) { 
				 //sum=sum-arr[i]
				System.out.print("-");
			}
			else {
				//sum=sum+arr[i]
				if(i!=0) System.out.print("+");
			}
			System.out.print(arr[i]); 
		}
		                                               
		//출력
		System.out.print("="+sum);
	}

}
