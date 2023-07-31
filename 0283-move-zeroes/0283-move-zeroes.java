class Solution {
    public void moveZeroes(int[] nums) {
        
        ArrayDeque<Integer> deque1=new ArrayDeque<>();
        ArrayDeque<Integer> deque2=new ArrayDeque<>();
        ArrayDeque<Integer> deque=new ArrayDeque<>();
        
        for(int i : nums)
        {
            if(i!=0)
                deque1.add(i);
            else
                deque2.add(i);
        }
        
        for(int i : deque1)
        {
            deque.add(i);
        }
        
        for(int i : deque2)
        {
            deque.add(i);
        }
        //System.out.println(deque);
        
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=deque.pop();
        }
        
    }
}