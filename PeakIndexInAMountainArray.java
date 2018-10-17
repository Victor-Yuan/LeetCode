class Solution {
    public int peakIndexInMountainArray(int[] A) {
        int left = 0;
        int right = A.length - 1;
        for(int i = 0; i < A.length; i++) {
            if (A[left] >= A[right]){
                right--;
            }
            if (A[left] < A[right]) {
                left++;
            }
            if (left == right){
                break;
            }
        }
        return left;
    }
}