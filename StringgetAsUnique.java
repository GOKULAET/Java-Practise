public String getAsUnique(String  s){
for (int i = 0; i < s.length(); i++) {
String temp=""+s.charAt(i);
String s1=s.substring(0,i+1);
String s2=s.substring(i+1);
if((int)temp.charAt(0)<91)
s2=s2.replaceAll(temp.toLowerCase(), "");
else
s2=s2.replaceAll(temp.toUpperCase(), "");
s=s1+s2.replaceAll(temp, "");
s=s.replaceAll(" ","");
}
return s.trim();
}



//Another Method
public String getAsUnique(String  s)
{
  String str="";
char[] c=s.toCharArray();
for(int i=0;i<s.length();i++)
{int count=0;
for(int j=0;j<str.length();j++)
if(Character.toLowerCase(c[i])==Character.toLowerCase(str.charAt(j)))
count++;
if(count==0)
str=str+c[i];
}return str.replace(" ","");
}
