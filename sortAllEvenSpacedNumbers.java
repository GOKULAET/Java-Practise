public int[] sortAllEvenSpacedNumbers(int [] arr){
Set<Integer> set=new TreeSet<Integer>();
for(int i=0;i<arr.length;i+=2){
set.add(arr[i]);
}
int[] nums=new int[set.size()];
int i=0;
Iterator iterator = set.iterator();
int count=0;
while (iterator.hasNext()){
     nums[i++]=(Integer)iterator.next();
}
return nums;
}


//Another Method

public int[] sortAllEvenSpacedNumbers(int [] arr){
int [] a =new int[(arr.length-1)/2+1];
for(int i=0;i<a.length;i++)
{
a[i]=arr[i*2];
}
Arrays.sort(a);
return a;
}
