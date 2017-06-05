public long recursive_Sum(int value){ 
if(value==1)
return 1;
else
return value + recursive_Sum(--value);
}


//Another Method

public long recursive_Sum(int value)
{
   if(value>0)
   return value+recursive_Sum(value-1);
   else
   return 0;  
}
