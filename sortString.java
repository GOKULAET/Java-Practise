public String sortString(String str){
char[] ca=str.toCharArray();
Arrays.sort(ca);
str="";
for(char c:ca){
str=str+c;
}
return str;
}

//Another Method

public String sortString(String str){
char []c=str.toCharArray();
for(int i=0;i<c.length-1;i++)
{
char y;
if(c[i+1]<c[i])
{y=c[i];
c[i]=c[i+1];
c[i+1]=y;
i=-1;}
}
String s=new String(c);
return s;
}
