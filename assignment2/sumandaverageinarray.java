package assignment2;

public class sumandaverageinarray {

	public static void main(String[] args) {
		int sum = 0;
		int a[]= {1,3,6,10};
		int n=a.length;
		for(int i=0;i<n;i++) {
			sum=sum+a[i];
		} 
		System.out.println("the sum of the array elements is"+sum);
		int avg=sum/n;
		System.out.println("the average of the array element is"+avg);
	}

}
