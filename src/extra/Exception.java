package extra;

public class Exception {
	static String a=null,s = "abc";
	static int i;
	public static void main(String[] args) {
		/*try {
				System.out.println(a.length());
			} catch (NullPointerException e) {
				System.out.println(e);
			}*/
		try {
			int i=Integer.parseInt(s);
		} catch (NumberFormatException e) {
			
			System.out.println(i);
		}
	}
}

