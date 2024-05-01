package assignment;

public class sorting {
	public static void main(String[] args)
    {
		int temp = 0;
        int num[] = {84,03,52,31,13,44};
        for (int i = 0; i < num.length; i++) {
             for (int j = i + 1; j < num.length; j++) {
            	 if (num[i] > num[j]) {
                	temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
             System.out.println(num[i]);
        }
    }
}
