class Solution {
    public void reverseString(char[] s) {
        int f = 0;
        int l = s.length - 1;
        char x = s[0];
        while(f < l){
            char temp = s[f];
            s[f] = s[l];
            s[l] = temp;
            f++;
            l--;
        }
      
    }
}