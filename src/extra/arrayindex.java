package extra;

public class arrayindex {
	static int[] b={10,2,54};
	public static void main(String[] args) {
		try {
			System.out.println(b[6]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}

}
