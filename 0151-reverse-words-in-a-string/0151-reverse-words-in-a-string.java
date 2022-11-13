class Solution {
    public String reverseWords(String s) {
        
        String str[]=s.split(" ");
        s="";
        for(int i=str.length-1;i>=0;i--)
        {
            if(str[i].trim().equals("") || str[i].trim().equals(" "))
            {
                continue;
            }
            if(i==0)
            {
                s+=str[i];
            }
            else
            {
                s+=str[i]+" ";
            }
        }
        
        return s.trim();
        
    }
}