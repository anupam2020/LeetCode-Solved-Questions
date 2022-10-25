class Solution {
    public int lengthOfLastWord(String s) {
        
        s=s.trim();
        return s.trim().substring(s.lastIndexOf(' ')+1,s.length()).length();
        
    }
}