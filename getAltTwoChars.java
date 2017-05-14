public String altPairs(String str) {
String s="";
int i=0;
while(i<=str.length()-1){
s=s+str.charAt(i);
if(i+1 <= str.length()-1)
s+=str.charAt(i+1);
i=i+4;
if(i>str.length()-1)
break;
}
return s;
}
