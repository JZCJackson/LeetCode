import java.util.ArrayList;

public class Solution {
	public int addTSTimes(int t, int s) {
		int rs = 0;
		for (int i=1; i<=s; i++) {
			rs += t;
		}
		return rs;
	}
	
	/*
		 * Given a string s, find the length of the longest 
	substring without repeating characters.
	
	Example 1:
	
	Input: s = "abcabcbb"
	Output: 3
	Explanation: The answer is "abc", with the length of 3.
	Example 2:
	
	Input: s = "bbbbb"
	Output: 1
	Explanation: The answer is "b", with the length of 1.
	Example 3:
	
	Input: s = "pwwkew"
	Output: 3
	Explanation: The answer is "wke", with the length of 3.
	Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
		 */
	public int longestSubstringWithoutRepeatingCharacters(String s) {
		int rs = 0;
		for (int i=0;i<s.length();i++) {
			int sub_length = 0;
			ArrayList<String> substring = new ArrayList<>();
			for(int j=i;j<(s.length());j++) { 
				String currentValue = String.valueOf(s.charAt(j));
				if (!substring.contains(currentValue) ) {
					substring.add(currentValue);
					sub_length+=1;
				}else {
					break;
				}
			}
		if (rs < sub_length) {
		rs = sub_length;
		}
		}
		return rs;
		
	}
	
	
	public static void main(String[] args) {
		Solution solution = new Solution();
		String str1 = "pwwkew";
		System.out.println("output is " + solution.addTSTimes(1,3));
		System.out.println(str1.charAt(2));
		System.out.println("-------------");
		//----------
		System.out.println("output is " + solution.longestSubstringWithoutRepeatingCharacters(str1));
		
	}

}

