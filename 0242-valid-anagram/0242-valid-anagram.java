class Solution {
    public boolean isAnagram(String s, String t) {
        
        ArrayList<Character> list1=new ArrayList<>();
        
        for(char c : s.toCharArray())
        {
            list1.add(c);
        }
        
        ArrayList<Character> list2=new ArrayList<>();
        
        for(char c : t.toCharArray())
        {
            list2.add(c);
        }
        
        Collections.sort(list1);
        Collections.sort(list2);
        
        if(list1.equals(list2))
        {
            return true;
        }
        return false;
        
    }
}