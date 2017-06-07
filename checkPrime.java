public static String checkPrime(int n){
	if(n<0)
		return "Invalid number";
	if ((n>2 && (n&1)==0) || n==1) /*|| n%5==0)*/
	return "not prime";
	if(n==2)
		return "Prime";
	else
		
	{
		int count=0;
		for(int i=3;i<n;i+=2){
			if(n%i==0)
				{count++;
				System.out.println(i);}
		}
		System.out.println("count is "+count);
		return count==0?"prime":"not prime";
	}		
}
