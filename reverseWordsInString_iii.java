class Solution {
    public String reverseWords(String s) {
        String result = "";
        String[] field = s.split(" ");
        int i = 0;
        int j = field.length-1;
        String temp = "";
        char temp1;
        while(i < j) {
            temp = field[i];
            field[i] = field[j];
            field[j] = temp;
            i++;
            j--;
        }
        StringBuffer str = new StringBuffer();
        for(i = 0; i < field.length-1; i++) {
            str.append(field[i]);
            str.append(" ");
        }
        str.append(field[i]);  
        String str1 = str.toString();
        char[] t = str1.toCharArray();
        i = 0; j = t.length-1;
        while(i < j) {
            temp1 = t[i];
            t[i] = t[j];
            t[j] = temp1;
            i++;
            j--;
        }
        return new String(t);
        
        
        
    }
}