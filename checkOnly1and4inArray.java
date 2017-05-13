public boolean only14(int[] nums) {
int count=0;
for(int a:nums){
if(a==1 || a==4)
count++;
}
return count%nums.length==0;
}
