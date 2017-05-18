public String convertCase(String s){
for(char c: s.toCharArray()){
	if((int)c>=65 && (int)c<=90)
	s=s.replace(c, (char)(c+32));
	if((int)c>=97 && (int)c<=122)
	s=s.replace(c, (char)(c-32));
	}
return s;
}


//Another Method


public String convertCase(String s){
String s1="";
char c;
for(int i=0;i<s.length();i++)
 {
c=s.charAt(i);
  if(Character.isUpperCase(c))
   s1=s1+Character.toLowerCase(c);
  else
  if(Character.isLowerCase(c))
   s1=s1+Character.toUpperCase(c);
  else
  s1=s1+c; 
}
return s1;
}
