

public int divide(int x, int y){
int count=0;
while((x-y)>=0){
count++;
x=x-y;
}
return count;
}

//Another Method

public int divide(int x, int y){
int min=Math.min(x,y);
int max=Math.max(x,y);
for(int i=1;i<=max;i++)
{
if(min*i==max)
max=i;
}
return max;
}


