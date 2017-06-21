package com.gokul.matrix;

import java.util.Map;
import java.util.TreeMap;

public class TestPalindrome {

	public static void main(String[] args) {
		String s1="Malayalam";
		String s2="o";
		String s3="uu";
		String s4="testbs";
		String s5="Abcddcbbca";
		String s6="amma";
		canBePalindrome(s1);
		canBePalindrome(s2);
		canBePalindrome(s3);
		canBePalindrome(s4);
		canBePalindrome(s5);
		canBePalindrome(s6);
	}
	public static void canBePalindrome(String str){
		str=str.toLowerCase();
		int count=0;
		Map<Character, Integer> map=new TreeMap<>();
		for(char c:str.toCharArray()){
			map.put(c, map.get(c)==null?1:map.get(c)+1);
		}
		System.out.println(map.entrySet());
		
		for(Map.Entry<Character, Integer> entry :map.entrySet()){
			if((entry.getValue()&1)==1)
				count++;
		}
		if(count<=1)
			System.out.println("Palindrome possible for "+str);
		else
			System.out.println("Palindrome is not possible "+str);
	}
}

//Output
/*    [a=4, l=2, m=2, y=1]
			Palindrome possible for malayalam
			[o=1]
			Palindrome possible for o
			[u=2]
			Palindrome possible for uu
			[b=1, e=1, s=2, t=2]
			Palindrome is not possible testbs
			[a=2, b=3, c=3, d=2]
			Palindrome is not possible abcddcbbca
			[a=2, m=2]
			Palindrome possible for amma                 */
