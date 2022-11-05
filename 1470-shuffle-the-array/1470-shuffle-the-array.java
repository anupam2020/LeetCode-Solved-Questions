class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        int arr1[]=new int[n];
        int arr2[]=new int[n];
        
        for(int i=0;i<n;i++)
        {
            arr1[i]=nums[i];
        }
        int j=0;
        for(int i=n;i<2*n;i++)
        {
            arr2[j]=nums[i];
            j++;
        }
        
        int arr[]=new int[n*2];
        j=0;
        int k=0;
        for(int i=0;i<2*n;i+=2)
        {
            arr[i]=arr1[j++];
            arr[i+1]=arr2[k++];
        }
        
        return arr;
        
    }
}