public boolean either24(int[] nums) {
int c=0;
for(int i=0;i<nums.length-1;i++){
if((nums[i]==2 && nums[i+1]==2) || (nums[i]==4 && nums[i+1]==4))
c+=1;
} 
return (c==1);
}
