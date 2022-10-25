class Solution {
    public boolean containsNearbyDuplicate(int[] arr, int k) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<arr.length;i++)
        {
            if(!map.containsKey(arr[i]))
            {
                map.put(arr[i],i);
            }
            else
            {
                if(Math.abs(map.get(arr[i]) - i) <= k)
                {
                    return true;
                }
                else
                {
                    map.put(arr[i],i);
                }
            }
        }
        
        return false;
        
    }
}