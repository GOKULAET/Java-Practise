public boolean isStringUnique(String s){
boolean b=true;
for(int i=0;i<s.length()-1;i++){
if (s.substring(i+1).contains(s.charAt(i)+""))
return b=false;
}
return b;
}



//Another Method

public boolean isStringUnique(String s){
for(int i=0;i<s.length();i++)
{String str=""+s.charAt(i);
if(s.indexOf(str,i+1)>=0)
return false;
}
return true;
}
