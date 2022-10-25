class Solution {
    public boolean checkIfPangram(String sentence) {
        
        HashSet<Character> letters=new HashSet<>();
        HashSet<Character> set=new HashSet<>();
        
        for(char c='a';c<='z';c++)
        {
            letters.add(c);
        }
        
        for(int i=0;i<sentence.length();i++)
        {
            set.add(sentence.charAt(i));
        }
        
        return letters.size() == set.size() ? true : false;
        
    }
}