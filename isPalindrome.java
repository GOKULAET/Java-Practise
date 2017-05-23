public boolean isPalindrome(int num){
String s1=""+num;
String s2="";
for(int i=(s1.length()-1);i>=0;i--){
s2=s2+s1.charAt(i);
}
return s1.equals(s2);
}

//Another Method

public boolean isPalindrome(int num){
StringBuilder sb = new StringBuilder();
StringBuilder sb1 = new StringBuilder();
sb.append(num);
sb1.append(num);
sb1.reverse();
String s1=sb.toString();
String s2=sb1.toString();
return s1.equals(s2);

}
			
