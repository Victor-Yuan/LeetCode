class Solution {
    public String reverseString(String s) {
        String result = "" ;
        char[] s1 = s.toCharArray();
        int i,j;
        for(i = 0, j = s1.length-1; i<j; i++,j--) {
            
            char temp = s1[i];
            s1[i] = s1[j];
            s1[j] = temp;
        }
        return new String(s1);
    }
}