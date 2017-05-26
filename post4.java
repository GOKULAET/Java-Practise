public int[] post4(int[] nums) {
		int count=0;
		ArrayList<Integer> list=new ArrayList<Integer>();
		if(nums[nums.length-1]==4)
		return nums;
		else
		{
		for(int i=nums.length-1;i>0;i--){
		if(nums[i]!=4)
		list.add(nums[i]);
		else
		break;
		}
		count=list.size();
		System.out.println(count);
		int[] result=new int[count];
		int z=count-1;
		for(int i=0;i<count;i++){
		result[i]=list.get(z);
		z--;
		}
		return result;
		}
}
