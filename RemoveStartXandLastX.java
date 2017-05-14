public String withoutX(String str) {
if((str.charAt(0)+"").equals("x") && ((str.charAt(str.length()-1)+"").equals("x")))
{return str.substring(1,str.length()-1);}
if(!(str.charAt(0)+"").equals("x") && ((str.charAt(str.length()-1)+"").equals("x")))
{return str.substring(0,str.length()-1);}
if((str.charAt(0)+"").equals("x") && (!(str.charAt(str.length()-1)+"").equals("x")))
{return str.substring(1);}
return str;
}


//Another Method
public String withoutX(String str) { 
if(str.charAt(0)=='x'&&str.charAt(str.length()-1)=='x')
return str.substring(1,str.length()-1);
else if(str.charAt(0)=='x')
return str.substring(1,str.length());
else if(str.charAt(str.length()-1)=='x')
return str.substring(0,str.length()-1);
else return str;
}
