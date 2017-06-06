public long recursive_sumOfDigits(int number){
if(number<10)
return number;
else
return number%10+recursive_sumOfDigits(number/10);
}



//Another Method


public long recursive_sumOfDigits(int number)
{
if(number==0)
return 0;
else
return number%10+recursive_sumOfDigits(number/10);
}
