package assignment4;

public class reversestring {

	public static void main(String[] args) {
		
			    String str="hi everyone...";
				String words[]=str.split("\\s");  
			    String reverseWord="";  
			    for(String w:words){  
			        StringBuilder sb=new StringBuilder(w);  
			        sb.reverse();  
			        reverseWord+=sb.toString()+" ";  
			    }  
			    System.out.println(reverseWord);
			    //return reverseWord.trim();  
			  


	}

}
