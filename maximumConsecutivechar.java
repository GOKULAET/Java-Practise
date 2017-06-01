public String maximumConsecutivechar(String str){
int count=0;String res="";
String[] sa=str.split(" ");
for(String s:sa){
int temp=0;
for(int i=0;i<s.length()-1;i++){
if(s.charAt(i)==s.charAt(i+1))
temp++;
}
if (temp>count){
count=temp;
res=s;}
}
return res;
}
