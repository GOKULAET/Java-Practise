public int[] makeUniQueElementArray(int[] a)
{
Set<Integer> set = new LinkedHashSet<Integer>();
		for(int n:a){
			set.add(n);
		}
		int[] nums=new int[set.size()];
		Iterator iterator = set.iterator();
		int count=0;
		while (iterator.hasNext()){
	        nums[count++]=(Integer)iterator.next();
			   }
return nums;
}


//Another Method
public int[] makeUniQueElementArray(int[] a)
{
			List<Integer> Llist = new ArrayList<Integer>();
                         for(int i=0;i<a.length;i++)
			{
				if(!Llist.contains(a[i]))
					Llist.add(a[i]);					
                         }
                      int[] ret = new int[Llist.size()];
                  for(int i = 0;i < Llist.size();i++)
				  
			    ret[i] = Llist.get(i);
return ret;
}
		
