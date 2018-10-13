class Solution {
    public int hammingDistance(int x, int y) {
        int count = 0;
        int temp = x ^ y;
        while(temp != 0){
            int t = temp % 2;
            if(t == 1){
                count ++;
            }
            temp = temp / 2;
        }
        return count;
    }
}


/**
 * class Solution {
    public int hammingDistance(int x, int y) {
         if(x==y) return 0;
        int z =  x ^ y;
        int count = 1;
        while (z != 1){
            count += z&1;
            z = z >> 1;
        }
        return count;
    }
}
 */