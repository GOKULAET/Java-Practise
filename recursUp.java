public String recursUp(int begin_value){
String s=" ";
if(begin_value==16)
return " ";
else
s=begin_value+" "+recursUp(begin_value+1);
return s;
}


//Another Method

public String recursUp(int begin_value){
String s=" ";
if(begin_value<16)
return begin_value+" "+recursUp(begin_value+1);
else
return s;
}
