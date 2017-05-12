public int sumOfDigits(int num){
String s=num+"";
char[] ca=s.toCharArray();
int sum=0;
for(char c:ca)
{
sum+=(Character.getNumericValue(c));
}
return sum;
}


//Another method
int c=0;
while(num/10>0)
{c=num%10+c;
num=num/10;}
return c+num;
}
