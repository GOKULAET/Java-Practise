public class PrintPyramidStars {

	public static void main(String[] args) {

System.out.println("Lets print Pyramid of stars");
		System.out.println("Enter the number of rows");
		Scanner sc1=new Scanner(System.in);
		int rows=sc1.nextInt();
		pyramidStars(rows);
		System.out.println("Reverse pyramid for the same");
		reversePyramidStars(rows);
		

	}
	public static void pyramidStars(int rows){
		for(int row=1;row<=rows;row++){
			
			for(int colspace=(rows-row);colspace>=1;colspace--){
				System.out.print(" ");
			}
			for(int colstar=1;colstar<=((row*2)-1);colstar++){
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	public static void reversePyramidStars(int rows){
		for(int row=rows;row>=1;row--){
			
			for(int colspace=(rows-row);colspace>=1;colspace--){
				System.out.print(" ");
			}
			for(int colstar=((row*2)-1);colstar>=1;colstar--){
				System.out.print("*");
			}
			System.out.println("");
		}
	}
  
  
  Output:
    *
   ***
  *****
 *******
*********
Reverse pyramid for the same
*********
 *******
  *****
   ***
    *
Combination of both codes leads to Rhombus(Note: Reduce the total number of rows by 1 in the 
first loop of reverse pyramid i.e row=rows-1)
    
