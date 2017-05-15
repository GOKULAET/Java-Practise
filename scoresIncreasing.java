public boolean scoresIncreasing(int[] scores) {
boolean flag=true;
for(int i=0;i<scores.length-1;i++){
flag=scores[i]<=scores[i+1] && flag;
}
return flag; 
}



//Another Method
public boolean scoresIncreasing(int[] scores) {
int y=0;
for(int x:scores)
{if(x>y)
y=x;
else
return false;}
return true;
}
