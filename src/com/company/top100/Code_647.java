package com.company.top100;

public class Code_647 {
    /**
     * 考虑有多少个子串，然后每个中心往外拓展，看他有几个回文子串
     * @param s
     * @return
     */
    public int countSubstrings(String s) {
        int length = s.length();
        int count = 0;
        for(int i = 0;i<2*length-1;i++){
            int l = i/2;
            int r = l+i%2;
            while(l>=0&&r<length&&s.charAt(l)==s.charAt(r)){
                l--;
                r++;
                count++;
            }
        }
        return count;
    }
}
