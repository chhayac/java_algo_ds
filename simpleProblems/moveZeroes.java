package simpleProblems;
/*
 * Given an array of random numbers, move all the zero’s to the end of the array. 
 * The order of all other elements should be same. 
 * Example:
 * Input : {1, 3, 0, 8, 0, 1, 0, 3, 0};
 * Output : Array after moving zeroes to the end: 
 * {1, 3, 8, 1, 3, 0, 0, 0, 0};
 */
public class moveZeroes {

	public static void main(String[] args) {
		int arr[] = {1, 3, 0, 8, 0, 1, 0, 3, 0};
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != 0) {
				arr[count] = arr[i];
				count++;
			}
		}
		while(count < arr.length) {
			arr[count++] = 0;
		}
		System.out.println("Array after moving zeroes to the end: ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
