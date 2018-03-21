package crackingthecode;

/**
 * Is Unique: Implement an algorithm to determine if a string has all 
 * unique characters and you cannot use additional data structures.
 * 
 * @author chhaya
 * Example:
 * 
 * I/p: "Hel world"
 * O/p: String doesn't have all the unique characters.
 *
 */

public class IsUniqueChar {
	
	public static boolean isUniquechar(String str) {
		
		if(str.length() > 128) {
			return false;
		}
		
		boolean[] bool = new boolean[128];
		for(int i = 0; i < str.length(); i++) {
			int value = str.charAt(i);
			if(bool[value]) {
				return false;
			}  //already found this char in string
			bool[value] = true;
		}
		return true;		
	}

	public static void main(String[] args) {
		String str = "Hel world";
		
		if(isUniquechar(str)) {
			System.out.println("String has all unique characters.");
		}
		else {
			System.out.println("String doesn't have all the unique characters.");
		}

	}

}
