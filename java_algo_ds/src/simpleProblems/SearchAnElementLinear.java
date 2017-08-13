package simpleProblems;

public class SearchAnElementLinear {
	
	public static boolean search(int[] arr, int searchElement) {
		for (int element : arr) {
			if (element == searchElement) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int arr[] = {5, 6, 7, 19, 20, 25};
		int searchElement = 4;
		if (search(arr, searchElement)) {
			System.out.println(searchElement + " exists in the array");
		}
		else {
			System.out.println(searchElement + " does not exist in the array");
		}
	}
}
