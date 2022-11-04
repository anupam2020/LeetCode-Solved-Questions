class Solution {
    public String reverseVowels(String s) {
        
        List<Character> list=new ArrayList<>();
        
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' ||
              s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='A' ||
              s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' ||
              s.charAt(i)=='U')
            {
                list.add(s.charAt(i));
            }
        }
        
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' ||
              s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='A' ||
              s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' ||
              s.charAt(i)=='U')
            {
                s=s.substring(0,i) + list.get(list.size()-1) +                  
                    s.substring(i+1,s.length());
                list.remove(list.size()-1);
            }
        }
        
        return s;
        
    }
}