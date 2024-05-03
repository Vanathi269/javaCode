package exersize;

import java.util.Arrays;

public class longestnumberinarray {

	public static int longestConsecutive(int[] nums) {
		  if (nums.length == 0) return 0;
		  Arrays.sort(nums);
		  int longSequence = 1;
		  int currentSequence = 1;
		  for (int i = 1; i < nums.length; i++) {
		    if (nums[i] != nums[i-1]) {
		      if (nums[i] == nums[i-1]+1) {
		        currentSequence += 1;
		      }
		      else {
		        longSequence = Math.max(longSequence, currentSequence);
		        currentSequence = 1;
		      }
		    }
		  }
		  return Math.max(longSequence, currentSequence);
		}
		public static void main(String[] args) {
		  int nums[]={4,3,25,6,7,8,9,2,3,10};
		  System.out.println(longestConsecutive(nums));
		}
	
}

