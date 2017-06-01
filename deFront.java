public String deFront(String str)
    {
        if(str.startsWith("ab"))
            return str;
        if(str.charAt(0)=='a')
        return 'a'+str.substring(2);
        if(str.charAt(1)=='b')
        return str.substring(1);


        return str.substring(2);

    }
    
    
    //Another Method
    
    public String deFront(String str) 
{if((str.charAt(0)=='a')&&(str.charAt(1)=='b'))
return str;
if(str.charAt(0)=='a')
return str.replace(""+str.charAt(1),"");
if(str.charAt(1)=='b')
return str.replace(""+str.charAt(0),"");
return str.replace(""+str.charAt(0)+str.charAt(1),"");
}
