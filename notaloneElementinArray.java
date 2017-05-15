public int[] notAlone(int[] nums, int val){
for(int i=1;i<=(nums.length-2);i++){
if((nums[i]==val) && (nums[i-1]<nums[i+1]))
nums[i]=nums[i+1];
if((nums[i]==val) && (nums[i-1]>nums[i+1]))
nums[i]=nums[i-1];
}
return nums;
}


//Another Method

public int[] notAlone(int[] nums, int val)
{int l= nums.length;
for(int i=0;i<l;i++)
{
if(i>0&&i<l-1)
{if(nums[i]==val&&nums[i-1]!=val&&nums[i+1]!=val)
{if(nums[i-1]>nums[i+1])
nums[i]=nums[i-1];
else
nums[i]=nums[i+1];}}
}
return nums;
}
