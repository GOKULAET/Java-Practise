public int[] tenRun(int[] nums){
int lastTen=0;
for(int i=0;i<nums.length;i++){
if((nums[i]%10)==0)
lastTen=nums[i];
if((nums[i]%10)!=0 && lastTen>0)
nums[i]=lastTen;
}
return nums;
}

//Another Method


public int[] tenRun(int[] nums)
 {
  for(int i=0;i<nums.length-1;i++)
   {
     if(nums[i]%10==0&&nums[i+1]%10!=0)
       {
        nums[i+1]=nums[i];
       }
   }
    return nums;
 }  
