package crackingthecode;
import java.util.HashMap;

/**
 * Given an array of integers, return indices of the two numbers 
 * such that they add up to a specific target. You may assume that 
 * each input would have exactly one solution, and you may not use the same element twice.
 * 
 * Example:
 * Given nums = [1, 2, 4, 4], target = 8,
 * Because nums[2] + nums[3] = 4 + 4 = 8,
 * return [2, 3].
 * 
 * @author chhaya
 *
 */

public class twoSum {
	
	public static int[] TwoSum(int[] arr, int target){
		int[] result = new int[2];
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0; i < arr.length; i++) {
			if(map.containsKey(target - arr[i])){
				result[0] = map.get(target - arr[i]);
				result[1] = i;
			}
			
			map.put(arr[i], i);
		}
		return result;
	}

	public static void main(String[] args) {
		int[] arr = {1,2,4,4};
		int target = 8;
		int[] result =  TwoSum(arr, target);

		for(int i = 0; i < result.length; i++){
			System.out.printf(result[i]+  " ");
		}
	}

}
