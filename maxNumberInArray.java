public int findMaximumAcrrossArrays(int[] arr1,int[] arr2){
int max=arr1[0]-1;
for(int a:arr1){
max=a>max?a:max;}
for(int a:arr2){
max=a>max?a:max;}
return max;
}


//Another Method
public int findMaximumAcrrossArrays(int[] arr1,int[] arr2){
Arrays.sort(arr1);
Arrays.sort(arr2);
return Math.max(arr1[arr1.length-1],arr2[arr2.length-1]);
}
