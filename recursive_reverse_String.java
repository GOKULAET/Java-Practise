public  String recursive_reverse(String str)
{
if(str.length()==1)
return str;
else
return str.charAt(str.length()-1)+""+recursive_reverse(str.substring(0,str.length()-1));
}


//Another Method

public  String recursive_reverse(String str)
{
if((str==null) || (str.length() <=1))
return str;
else
return recursive_reverse(str.substring(1))+str.charAt(0);
}
			
