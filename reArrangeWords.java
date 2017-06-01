public ArrayList<String> reArrangeWords(ArrayList<String> words){
ArrayList<String> list=new ArrayList<String>();
for(String s:words){
if(s.matches(".*\\d.*"))
list.add(s);
}
words.removeAll(list);
words.addAll(list);
return words;
}


//Another Method

public ArrayList<String> reArrangeWords(ArrayList<String> words){
ArrayList<String> z=new ArrayList<String>();
for(String x:words)
{
if(!(x.matches(".*[1-9].*")))
z.add(x);
}
for(String x:words)
{
if(x.matches(".*[1-9].*"))
z.add(x);
}
return z;
}
