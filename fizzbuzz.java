public String[] fizzBuzz(int start, int end) 
	{
	String[] s=new String[end-start];
	for(int i=0;i<(end-start);i++){
	s[i]=""+(i+start);
	if(Integer.parseInt(s[i])%15==0)
	s[i]="FizzBuzz";
	else if(Integer.parseInt(s[i])%5==0)
	s[i]="Buzz";
	else if(Integer.parseInt(s[i])%3==0)
	s[i]="Fizz";
	}
	return s;
	}
  
  
  
  //Another Method
  
  public String[] fizzBuzz(int start, int end) 
{


  String[] s=new String[end-start];
	   int j=0;
	  for(int i=start;i<end;i++)
	{ 
	   if(i%3==0&&i%5==0)
	   s[j++]="FizzBuzz";
	   else if(i%3==0)
	    s[j++]="Fizz";
	   else if(i%5==0)
	    s[j++]="Buzz";
	   else
	    s[j++]=String.valueOf(i);
	}
	  return s;

}

//Another Method
public String[] fizzBuzz(int start, int end) 
{
String[] a=new String[end-start];
for(int i=0;i<a.length;i++)
{if((start+i)%15==0)
a[i]="FizzBuzz";
else if((start+i)%3==0)
a[i]="Fizz";
else if((start+i)%5==0)
a[i]="Buzz";
else
a[i]=""+(start+i);}
return a;
}

