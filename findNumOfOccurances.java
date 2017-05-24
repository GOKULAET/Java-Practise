public int findNumOfOccurances(String input,String matcher){
int count=0;
input=input.replaceAll(matcher,"@");
char[] ca=input.toCharArray();
for(char c:ca){
if (c=='@')
count++;
}
return count;
}


//Another Method

public int findNumOfOccurances(String input,String matcher)
{
input=" "+input+" ";
return (input.split(matcher)).length-1;
}

//Another Method

public int findNumOfOccurances(String input,String matcher)
{
int a = 0;
	    int count =0;

	    while(a != -1){

	       a = input.indexOf(matcher,a);

	           if( a != -1){
	                 count ++;
	                a+=matcher.length();
	          }
	    }
return count;
}
