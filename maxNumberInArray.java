public int findMaximumAcrrossArrays(int[] arr1,int[] arr2){
int max=arr1[0]-1;
for(int a:arr1){
max=a>max?a:max;}
for(int a:arr2){
max=a>max?a:max;}
return max;
}
