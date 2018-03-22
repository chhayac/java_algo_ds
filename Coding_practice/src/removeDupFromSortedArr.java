/*
 * Given a sorted array, remove the duplicates such that each element appear only once 
 * and return the new length.
 * 
 * Example: Given nums = [1,1,2]
 * Output: 2
 */
public class removeDupFromSortedArr {
	
	public static int removeDup(int[] arr, int n) {
		if(n == 0 || n == 1) {
			return n;
		}
		int[] temp = new int[n];
		
		int j = 0;
		for(int i = 0; i < n-1; i++) {
			if(arr[i] != arr[i+1]) {
				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[n-1];
		for(int i = 0; i < j; i++) {
			arr[i] = temp[i];
		}
		return j;
	}

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 4, 4, 5, 5};
		int n = arr.length;
		
		int res = removeDup(arr, n);
		System.out.println("New Length: " + res);
	}
}
