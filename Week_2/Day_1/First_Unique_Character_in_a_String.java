class Solution {
    public int firstUniqChar(String s) {
        int [] freq =new int[26];
        for(int i=0;i<s.length();i++)
        {
            int temp=s.charAt(i)-'a';
            freq[temp]++;
        }
        for(int i=0;i<s.length();i++)
        {
            int temp=s.charAt(i)-'a';
            if(freq[temp]==1)
                return i;
        }
        return -1;
    }
}