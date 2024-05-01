package basic;

public class sorting {

	public static void main(String[] args) {
		//int temp = 0;
		System.out.println("sorted order");
		int[] num=new int[]{90,67,34,45,78};
		for(int i=0;i<num.length;i++) {
			for(int  j=i+1;i<num.length;j++) {
				int temp = 0;
				if(num[i] > num[j]) {
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
			System.out.println(num[i]);
		}
	}

}