package assignment9;
import java.util.HashMap;
import java.util.Map;

public class HashMapCount {
	
		public static void main(String[] args)
		{
			String str = "Alice is girl and Bob is boy";
			Map<String, Integer> hashMap = new HashMap<String, Integer>();
			String[] words = str.split(" ");
			for (String word : words) {
				Integer integer = hashMap.get(word);
				if (integer == null)
					hashMap.put(word, 1);
				else {
					hashMap.put(word, integer + 1);
				}
			}
			System.out.println(hashMap);
		}
}

