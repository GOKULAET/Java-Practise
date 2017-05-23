public int findSum(int num){
int result=0;
if(num<1000)
{int a=(int)num%10;
int b=((int)num/10)%10;
int c=(int)num/100;
result=(a+(b*b)+(c*c*c));}
if(num<10000)
{
int a=(int)num%10;
int b=((int)num/10)%10;
int c=((int)num/100)%10;
int d=(int)num/1000;
result= (a+(b*b)+(c*c*c)+(d*d*d*d));
}
return result;
}

//Another Method

public int findSum(int num){
int a=0,sum=0,b=0;
		while(num!=0)
		{
			a=num%10;
			num=num/10;
			b=b+1;
			sum+=(int) Math.pow(a, b);
		}
		return sum;	
}
