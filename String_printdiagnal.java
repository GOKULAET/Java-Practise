public static void printdiagnal(String s){
        for(int i=0;i<s.length();i++){
            for(int j=0;j<=i;j++){
                if(j==i)
                    System.out.print(s.charAt(j)+"");
                else
                    System.out.print(s.charAt(j));             
            }
            System.out.println(" ");
        }
    }
    
   // output
P 
 r 
  o 
   g 
    r 
     a 
      m 
