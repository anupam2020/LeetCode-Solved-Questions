class Solution {
    public int largestAltitude(int[] gain) {
        
        int n=gain.length;
        int arr[]=new int[n+1];
        arr[0]=0;
        
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum+=gain[i-1];
            arr[i]=sum;
        }
        int max=0;
        //System.out.println(Arrays.toString(arr));
        for(int i : arr)
        {
            max=Math.max(max,i);
        }
        return max;
        
    }
}