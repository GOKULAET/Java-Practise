public long recursive_squareOf(int n)
{
if(n==0)
return 0;
else
return (recursive_squareOf(n-1)+(2*n)-1);
}


//Another Method

public long recursive_squareOf(int n)
{ if(n==0)
return 0;
else
return (recursive_squareOf(n-1)+(2*n)-1);
}
