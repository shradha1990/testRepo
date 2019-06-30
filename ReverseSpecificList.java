import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class ReverseSpecificList {
	private static String reversedByK(String[] nums, int k) {
	    StringBuilder result = new StringBuilder();
	    for (int i = k - 1; i < nums.length; i += k) {
	        for (int j = i; i - j <= k - 1; j--) {
	            result.append(',').append(nums[j]);
	        }       
	    }

	    for (int i = nums.length - nums.length % k; i < nums.length; i++) {
	        result.append(',').append(nums[i]);
	    }
	    return result.substring(1);
	}
	
	public static void main(String[] args){
		String[] val={"3","2","4","5","6"};
		System.out.println(reversedByK(val,3));
	}

}