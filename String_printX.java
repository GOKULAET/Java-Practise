public static void printX(String s){
        for(int i=0;i<s.length();i++){
            for(int j=0;j<s.length();j++){
                if(j==i)
                    System.out.print(s.charAt(j)+"");
                else
                    //System.out.print(s.charAt(j));
                    System.out.print(" ");
                if(s.substring(j).length()==i)
                    System.out.print(s.charAt(j)+"");
            }
            System.out.println(" ");
        }
    
    }
