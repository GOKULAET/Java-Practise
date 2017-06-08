public class Test2 {

	public static void main(String[] args) {
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
		   //Slight Modification
public static void printX(String s){
        for(int i=0;i<s.length();i++){
            for(int j=0;j<s.length();j++){
                if(j==i)
                    System.out.print(s.charAt(j)+"");
                else if(s.substring(j).length()==i+1 && !(j==i))
                    System.out.print(s.charAt(j)+"");
                else
                    //System.out.print(s.charAt(j));
                    System.out.print(" ");
                
            }
            System.out.println(" ");
        }
    
    }
		
		//output:
Program
P     m 
 r   a  
  o r   
   g    
  o r   
 r   a  
P     m
		
