//  Author: Tushar Jayanti
//  github: https://github.com/tusharjayanti
// LinkedIn: https://www.linkedin.com/in/tusharjayanti/

/*
1.2
Check Permutation: Given two strings,write a method to decide if one is a permutation of the
other.

Basically check if one is string is an anagram (String with same character count but different order)
*/
// TC : O(n) -> n is length of String
import java.util.HashMap;
class CheckPermutation {
	public static boolean checkPerm(String s, String t) {
		if(s.length()!=t.length()) {
			return false;
		}
		HashMap<Character, Integer> frequencies = new HashMap<>();
		for(int i = 0; i<s.length();i++) {
			frequencies.put(s.charAt(i),frequencies.getOrDefault(s.charAt(i),0)+1);
		}

		for(int i = 0; i<s.length();i++) {
			if(!frequencies.containsKey(t.charAt(i))) {
				return false;
			}
			frequencies.put(t.charAt(i),frequencies.get(t.charAt(i))-1);
		}

		for(int i : frequencies.values()) {
			if(i!=0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println(checkPerm("testest","estxest"));
		System.out.println(checkPerm("testest","esttest"));
	}
}