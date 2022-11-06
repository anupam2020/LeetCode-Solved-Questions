class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            int count=0,sum2=0;
            for(int j=i;j<arr.length;j++)
            {
                count++;
                sum2+=arr[j];
                if(count%2!=0)
                {
                    sum+=sum2;
                }
            }
        }
        
        return sum;
        
    }
}