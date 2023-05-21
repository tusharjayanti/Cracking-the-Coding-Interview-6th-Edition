//  Author: Tushar Jayanti
//  github: https://github.com/tusharjayanti
// LinkedIn: https://www.linkedin.com/in/tusharjayanti/

/*
Is Unique: Implement an algorithm to determine if a string has all unique characters. 
What if you cannot use additional data structures?
*/


import java.util.*;

class IsUnique {
	public static boolean isUnique(String input) {
		if(input.length()<2 || input.length()>128) {
			return true;
		}

		// HashMap of 128 ascii chars which results in SC -> O(1)
		HashMap<Character,Integer> frequencies = new HashMap<>(128);
		for(int i=0;i<input.length();i++) {
			if(frequencies.containsKey(input.charAt(i))) {
				return false;
			}
			frequencies.put(input.charAt(i),1);
		}
		return true;
	}

	public static boolean test0() {
		String input = "abc";
		return (isUnique(input)==true);

	}
	public static boolean test1() {
		String input = "abcc";
		return (isUnique(input)==false);

	}
	public static boolean test2() {
		String input = "a";
		return (isUnique(input)==true);

	}
	public static void main(String[] args) {
				System.out.println(test0());
				System.out.println(test1());
				System.out.println(test2());
	}
}