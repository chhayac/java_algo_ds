package simpleProblems;
/*
 * Program to build lowest number by removing n digits from a given number.
 * Example:
 * Input: str = "4325043", n = 3
 * Output: "2043"
 * 
 * Input: str = "121198", n = 2
 * Output: "1118" 
 */


public class BuildLowestNumber {
	
	public static void BLN(String digit, int n, String res) {
		char[] ch = digit.toCharArray();
		
		// if number of elements to remove is 0
		if(n == 0) {
			res += digit;
			System.out.println("Lowest number from the string is: " + res);
			return;
		}
		
		// number of digits to remove is more than the digit length
		if(digit.length() <= n) {
			res += "0";
		}
		
		// find the smallest digit in first (n+1) digits and 
		// find the index of the smallest digit
		int minIndex = 0;
		for(int i = 1; i <= n; i++) {
			if(ch[i] < ch[minIndex]) {
			
				minIndex = i;
			}
		}
		
		// append the smallest digit to resultant smallest number
		res += ch[minIndex];
		System.out.println("res: " + res);
		System.out.println("len of digit= " + digit.length());
		// take left part of digit after the minIndex till last element of digit
		// to make it the new digit for recursion
		String new_digit = digit.substring(minIndex+1, digit.length());
		System.out.println("New_digit = " + new_digit);
		// recurse same logic on remaining string
		BLN(new_digit, n-minIndex, res);
	} 

	public static void main(String[] args) {
		String digit = "121198";
		int remove = 2;
		String result = "";
		BLN(digit, remove, result);
	}
}
