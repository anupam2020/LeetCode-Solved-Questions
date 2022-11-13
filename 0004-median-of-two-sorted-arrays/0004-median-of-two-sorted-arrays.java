class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int nums[]=new int[nums1.length + nums2.length];
        
        int i=0,j=0,k=0;
        
        while(i<nums1.length && j<nums2.length)
        {
            if(nums1[i] < nums2[j])
            {
                nums[k++]=nums1[i++];
            }
            else
            {
                nums[k++]=nums2[j++];
            }
        }
        
        while(i<nums1.length)
        {
            nums[k++]=nums1[i++];
        }
        
        while(j<nums2.length)
        {
            nums[k++]=nums2[j++];
        }
        
//         int j=0;
//         for(int i : nums1)
//         {
//             nums[j++]=i;
//         }
        
//         for(int i : nums2)
//         {
//             nums[j++]=i;
//         }
        
        //Arrays.sort(nums);
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