class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int nums[]=new int[nums1.length + nums2.length];
        
        int j=0;
        for(int i : nums1)
        {
            nums[j++]=i;
        }
        
        for(int i : nums2)
        {
            nums[j++]=i;
        }
        
        Arrays.sort(nums);
        double median=1.0;
        if(nums.length % 2 == 0)
        {
            median=(double)(nums[(nums.length)/2 - 1] + nums[nums.length/2]) / 2;
        }
        else
        {
            median=(double)nums[nums.length/2];
        }
        
        return median;
        
    }
}