public int makeChocolate(int small, int big, int goal) 
{
int n=goal-(big*5);
if(n==small)
return n;
else
return n>small?-1:small-n;
}

//Another Method

public int makeChocolate(int small, int big, int goal) 
{
  int smallsize=1;
  int bigsize=5;
    if((smallsize*small)+(bigsize*big)<goal)
     return -1;
      int bigcount=goal/bigsize;
      if(bigcount>big)
       bigcount=big;
     int smallcount=goal-(bigcount*bigsize);
  return smallcount;
}


//Another Method

public int makeChocolate(int small, int big, int goal) 
{
int s=small+5*big-goal;
if(s==0)
return small;
if(s>0&&s>small)
return 0;
if(s>0)
return s;
else
return -1;
}

