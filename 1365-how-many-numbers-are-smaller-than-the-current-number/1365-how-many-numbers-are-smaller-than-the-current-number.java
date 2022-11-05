class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        int arr[]=new int[nums.length];
        
        for(int i=0;i<nums.length;i++)
        {
            arr[i]=nums[i];
        }
        
        Arrays.sort(arr);
        
        ArrayList<Integer> list=new ArrayList<>();
        
        for(int i : arr)
        {
            list.add(i);
        }
        
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=list.indexOf(nums[i]);
        }
        
        return arr;
        
    }
}