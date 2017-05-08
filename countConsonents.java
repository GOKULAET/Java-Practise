public static int countConsonents(String s){
		
		s=s.toLowerCase();
		int d=0;
		for(char c:s.toCharArray())
		{
			System.out.println((int)c);
			if(((int)c>96) && (int)c<123)
			{
			if((c!='a') & (c!='e') & (c!='i') & (c!='o')& (c!='u'))
			{
				d=d+1;
			}	
			}
		}
		return d;
	}
