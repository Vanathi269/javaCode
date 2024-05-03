package exersize;

public class primeNumber {

	public static void main(String[] args) {
		int flag=0,num=6;
		
		 if(num==0||num==1) {
			System.out.println("the number is not prime");
		}else {
			for(int i=2;i<=num;i++){      
				
			    if(num%i==0){      
			        System.out.println(" is not prime number");      
			        flag=1;
			        break;

		}
			}
		}
	
		 if (flag==0){
			System.out.println("the number is prime");
		}

	
	}
		
}