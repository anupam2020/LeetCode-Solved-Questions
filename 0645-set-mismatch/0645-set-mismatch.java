class Solution {
    public static int[] findErrorNums(int[] nums)
	{
		int arr[]=new int[2];
		HashMap<Integer,Integer> map=new HashMap<>();
		
		for(int i : nums)
		{
			map.put(i, map.getOrDefault(i, 0)+1);
		}
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet())
		{
			if(entry.getValue()==2)
			{
				arr[0]=entry.getKey();
			}
		}
		
		for(int i=1;i<=nums.length;i++)
		{
			if(!map.containsKey(i))
			{
				arr[1]=i;
			}
		}
		
		return arr;
        
    }
}