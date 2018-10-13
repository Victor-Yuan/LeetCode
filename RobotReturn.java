class Solution {
    public boolean judgeCircle(String moves) {
        int[] route = new int[2];
        route[0] = 0;
        route[1] = 0;
        
        for(int i = 0; i < moves.length(); i++) {
            char t = moves.charAt(i);
            switch(t) {
                case 'U' : route[1]++; break;
                case 'D' : route[1]++; break;
                case 'L' : route[0]--; break;
                case 'R' : route[0]++; break;
            }
        }
        if(route[0]==0 && route[1]==0){
            return true;
        }else{
            return false;
        }
    }
}