/*
 * Given a string s, return the longest palindromic substring in s.
	
	Example 1:
	
	Input: s = "babad"
	Output: "bab"
	Explanation: "aba" is also a valid answer.
	Example 2:
	
	Input: s = "cbbd"
	Output: "bb"
	 
	//what if no palindromic substring like "cccc"? 

	
	Constraints:
	
	1 <= s.length <= 1000
	s consist of only digits and English letters.
 * */

import java.util.ArrayList;

public class Solution {
	
	
	public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }
        if (s.length() == 1) {
            return s;
        }
        
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i); // Odd length palindrome
            int len2 = expandAroundCenter(s, i, i + 1); // Even length palindrome
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
	public static void main(String[] args) {
		Solution solution = new Solution();
		String a = "babad";
		String b = "cbbd";
		String c = "ac";
		String d = "ccccc";
		String e = "ccccac";
		String f = "cccaacccccc";
		String g = "c";
		
		System.out.println(solution.longestPalindrome(a));
		System.out.println(solution.longestPalindrome(b));
		System.out.println(solution.longestPalindrome(c));
		System.out.println(solution.longestPalindrome(d));
		System.out.println(solution.longestPalindrome(e));
		System.out.println(solution.longestPalindrome(f));
		System.out.println(solution.longestPalindrome(g));

}

}
