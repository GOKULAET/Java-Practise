public boolean has12(int[] nums) {
boolean flag=false;
boolean flag1=false;
for(int a: nums){

if(a==1 && flag==false)
flag=true;
flag1=true;
if(flag==true && a==2)
flag=true;


if(a!=1 | a!=2 && flag==false) 
flag=false;
if(a!=1 | a!=2 && flag==true && flag1==false) 
flag=flag1;
}
return flag;
}
