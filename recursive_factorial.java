public long recursive_fact(int n)
{
if(n==1)
return 1;
else
return n*recursive_fact(--n);
}
	
