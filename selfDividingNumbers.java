class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<Integer>();
        for(int num = left; num <= right; num++) {
            boolean flag = true;
            int num1 = num;
            
            if(num<10) {
                result.add(num);
            }else{
                while(num1 != 0) {
                    int a = num1 % 10;   
                    if(a==0){
                        flag = false;
                        break;
                    }else if(num%a != 0) {
                    flag = false;
                    }
                    num1 = num1 / 10;
                }
                if(flag) {
                result.add(num);
                }
            }   
        }
        return result;
    }
}