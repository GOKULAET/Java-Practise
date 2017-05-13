public boolean more14(int[] nums){
int count1=0;
int count2=0;
for(int a:nums){
if(a==1)
count1+=1;
if(a==4)
count2+=1;
}
return count1>count2;
}
