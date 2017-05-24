public int[] sortArray(int [] arr){
int temp=0;
for(int i=0;i<arr.length;i++){
for(int j=i;j<arr.length;j++){
	if(arr[i]>arr[j])
	{
		temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		}
}
}
return arr;	
} 

//Another Method

public int[] sortArray(int [] arr){
 Arrays.sort(arr);
 return arr;
} 
		
//Another Method
public int[] sortArray(int [] arr){int j;
for(int i=0;i<arr.length-1;i++)
{
if(arr[i]>arr[i+1])
{arr[i]=arr[i]^arr[i+1];
arr[i+1]=arr[i]^arr[i+1];
arr[i]=arr[i]^arr[i+1];
i=-1;}
}
return arr;
} 
			
