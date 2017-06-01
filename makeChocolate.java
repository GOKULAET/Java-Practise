public int makeChocolate(int small, int big, int goal) 
{
int n=goal-(big*5);
if(n==small)
return n;
else
return n>small?-1:small-n;
}

//Another Method

