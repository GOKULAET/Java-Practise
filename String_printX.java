public class Test2 {

	public static void main(String[] args) {
		int[] nums={0,2,0,3,4,5,6,2,7};
		String s1="PROGRAM";
		System.out.println(s1);
		printX(s1);
	}
	
	public static void printX(String s){
		        for(int i=0;i<s.length();i++){
		             for(int j=0;j<s.length();j++){
		            	 if(s.substring(j).length()==(i+1) )
		                     System.out.print(s.charAt(j)+"");
		                 if(j==i && j!=(s.length()/2))
		                     System.out.print(s.charAt(j)+"");
		                 else
		                    System.out.print(" ");
		                 
		             }
		             System.out.println(" ");
		         }
		     
		     }
	
