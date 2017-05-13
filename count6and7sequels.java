public int array667(int[] nums) {
int a=0;
for(int i=0;i<nums.length-1;i++){
if(nums[i]==6 && nums[i+1]==6 || (nums[i]==6 && nums[i+1]==7))
a+=1;
}
return a;
}
