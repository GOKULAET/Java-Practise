public static void main(String[] args) {
		
		int[] a={10,20,30,40,50};
		int b=0;
		int d =0;
	
		for(int c:a)
		{
			b=b+c;
		}
		System.out.println("Through for each loop RESULT===>"+b);
		for(int i=0;i<(a.length);i++)
		{
			d=d+a[i];
		}
		System.out.println("Through for loop RESULT===>"+d);
		
	}
