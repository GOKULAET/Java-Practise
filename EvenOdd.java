public int[] evenOdd(int[] nums) {
int[] num1=new int[nums.length];
int[] num2=new int[nums.length];
int b=0;int d=0;int c=0;
for(int a=0;a<=nums.length-1;a++){
if((nums[a]%2)==0){
num1[b]=nums[a];
b++;}
else
{
num2[d]=nums[a];
d++;
}
}
for(;b<num1.length;b++){
num1[b]=num2[c];
c+=1;
}
return num1;
}


//Another Method
for(int i=0;i<nums.length;i++)
{if(i!=0&&nums[i]%2==0&&nums[i-1]%2!=0)
{nums[i-1]= nums[i]^nums[i-1];
nums[i]= nums[i]^nums[i-1];
nums[i-1]= nums[i]^nums[i-1];
i=0;}
}
return nums;
}
