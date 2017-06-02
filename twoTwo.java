public boolean twoTwo(int[] nums) {
boolean flag=true;

if(nums[0]==2){
for(int i=nums.length-1;i>1;i--){
if(nums[i]==2 && nums[i-1]!=2)
flag=false;
}
return flag;}
else{
for(int i=nums.length-1;i>1;i--){
if(nums[i]==2 && nums[i-1]!=2)
flag=false;
}
if(flag==true && nums[1]==2 && nums[2]!=2)
flag=false;
return flag;
}

}


// Another Method

public boolean twoTwo(int[] nums) {boolean b=false;
for(int i=0;i<nums.length-1;i++)
{
if(nums[i+1]==2&&nums[i]==2)
b=true;
if(nums[i+1]==2&&nums[i]!=2)
b=false;
}
return b;
}


//Another Method
public boolean twoTwo(int[] nums) {

if((nums[0]==2 && nums[1]!=2) || (nums[nums.length-1]==2 && nums[nums.length-2]!=2))
return false;
for(int i=1;i<nums.length-1;i++)
    { 
       if(nums[i]==2 && !(nums[i+1]==2 || nums[i-1]==2) )
       {
         return false;  
       }
        
    }
       return true;
}

			
