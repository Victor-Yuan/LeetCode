class Solution {
    public int findComplement(int num) {
        int temp = 0;
        int a = 0;
        if(num == 0) {
            return 1;
        }
        while(num != 0) {
            int b = num % 2;
            b = b ^ 1;
            num = num >> 1;
            a = a + (b * ((int)Math.pow(2, temp)));
            temp ++;
        }
        
        return a;
    }
}