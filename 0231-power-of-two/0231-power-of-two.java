class Solution {
    public boolean isPowerOfTwo(int n) {
        
        if(n==1) return true;
        double num=n;
        while(num>2)
        {
            num=num/2;
        }
        
        return num == 2 ? true : false;
    }
}