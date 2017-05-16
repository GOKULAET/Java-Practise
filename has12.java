public boolean has12(int[] nums) {
boolean flag=false;
for(int i=0;i<=nums.length-1;i++){
int a=nums[i];
if(a==1 && !flag)
flag=true;
if(flag && a==2)
return flag;
if(flag && i==(nums.length-1)) 
flag=false;
}
return flag;
}




//Another Method

public boolean has12(int[] nums){
int c1=0,c2=0;
for(int x:nums)
{if(x==1)
c1++;
if(x==2)
c2++;}
if(c1>0&&c2>0)
return true;
else return false;
}

