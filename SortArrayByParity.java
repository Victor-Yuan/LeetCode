class Solution {
    public int[] sortArrayByParity(int[] A) {
        int[] result = new int[A.length];
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for(int i = 0; i < A.length; i++){
        	if (A[i]%2 == 0) {
        		temp.add(A[i]);
        		A[i] = -1;
        	}
        }
        for (int i = 0; i < A.length ;i++ ) {
        	if (A[i] > 0) {
        		temp.add(A[i]);
        	}
        }
        for (int i = 0; i < A.length ;i++) {
        	result[i] = temp.get(i);
        }
    }
}

/*
时间25ms
短时间优解：
	只进行一次数组遍历，分别从前往后，从后往前来保存新数组
	偶数从前保存，奇数从后保存


 */