public int countXX(String str)
{
	str=str.toLowerCase();
	int count=0;
	if(str.contains("x"))
	{
	int c=str.indexOf('x');
	for(int i=c;i<(str.length()-1);i++) {
	if(str.charAt(c)==(str.charAt(++c)))
	count=count+1;
	}
	return count;
	}
	return count;
	
}

//another method
public int countXX(String str)
{
 int l=0,i=-1;
			i=str.indexOf("xx",i+1);

			while(i!=-1)
			{i=str.indexOf("xx",i+1);
			l++;} 
return l;
}
