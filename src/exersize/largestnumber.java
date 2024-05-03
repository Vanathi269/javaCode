package exersize;

public class largestnumber {

	public static void main(String[] args) {
		int a[]= {12,34,54,11};
		int total=3,temp,i,j = 0;
		for (i = 0; i < total; i++)   
        {  
            for (j = i + 1; j < total; j++)   
            {  
                if (a[i] > a[j])   
                {  
                    temp = a[i];  
                    a[i] = a[j];  
                    a[j] = temp;  
                }  
            }  
        }  
		System.out.println(a[j]);
	}

}
