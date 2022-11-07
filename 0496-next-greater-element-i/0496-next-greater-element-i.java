class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        ArrayList<Integer> list=new ArrayList<>();
        
        for(int i : nums2)
        {
            list.add(i);
        }
        
        int nums[]=new int[nums1.length];
        Arrays.fill(nums,-1);
        int k=0;
        
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=list.indexOf(nums1[i])+1 ;j<list.size();j++)
            {
                if(list.get(j) > nums1[i])
                {
                    nums[k]=list.get(j);
                    break;
                }
            }
            k++;
        }
        
        return nums;
        
    }
}