public int sum67(int[] nums)
{
boolean found6=false;
int sum=0;
for(int i=0;i<nums.length;i++){
if(nums[i]!=6 && !found6)
sum=sum+nums[i];
if(nums[i]==6)
found6=true;
if(nums[i]==7)
found6=false;
}
return sum;
}


//Another Method
public int sum67(int[] nums)
{int sum=0;
for(int i=0;i<nums.length;i++)
{if(nums[i]==6)
{while(i<nums.length){
if(nums[i]==7)
break;
i++;}
sum+=0;
}
else
sum+=nums[i];
} 
return sum;
}
