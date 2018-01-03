package crackingthecode;

import java.util.Arrays;

/**
 * Check Permutation: Given two strings, write a method to decide if one
 * is a permutation of the other.
 * @author chhaya
 *
 * Time Complexity: O(n logn)
 */

public class Permutation {
	
	public static boolean isPermute(String str1, String str2) {
		
		if(str1.length() != str2.length()) {
			return false;
		}
		
		char[] a = str1.toCharArray();
		char[] b = str2.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		return Arrays.equals(a, b);
	}

	public static void main(String[] args) {
		String str1 = "Arrays";
		String str2 = "syarrA";
		
		if(isPermute(str1, str2)) {
			System.out.println("Str1 is permutation of str2.");
		}
		else {
			System.out.println("No permutation exist.");
		}

	}

}
