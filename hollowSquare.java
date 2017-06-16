public static void hollowSquare(int len){
		for(int i=1;i<=len;i++){
			for(int j=1;j<=len;j++){
				if(i==1 || i==len || j==1 || j==len)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
	}
  
  
  output
Enter the Sidelength of Hollow Square
6
******
*    *
*    *
*    *
*    *
******
