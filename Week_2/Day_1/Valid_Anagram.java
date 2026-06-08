class Solution {
    public boolean isAnagram(String s, String t) {
        int freq1[]=new int[26];
        int freq2[]=new int[26];
        if(s.length()!=t.length()) return false;
        for(int i=0;i<s.length();i++)
        {
            int k=s.charAt(i)-'a';
            int m=t.charAt(i)-'a';
            freq1[k]++;
            freq2[m]++;
        }
        for(int i=0;i<s.length();i++)
        {
            int k=s.charAt(i)-'a';
            if(freq1[k]!=freq2[k])
                return false;
        }
        return true;
    }
}