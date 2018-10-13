class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        for (int i=0; i < A.length ;i++ ) {
        	int j=0; 
        	int q=A[i].length-1;
        	for ( ; j != q ;j++,q-- ) {
        		if (j > q) {
        			break;
        		}
        		int t = 0;
        		//元素交换
        		t = A[i][j];
        		A[i][j] = A[i][q];
        		A[i][q] = t;
        		//元素翻转
        		if (A[i][j] == 1) {
        			A[i][j] = 0;
        		}else {
        			A[i][j] = 1;
        		}

        		if (A[i][q] == 1) {
        			A[i][q] = 0;
        		}else {
        			A[i][q] = 1;
        		}
        	}
        	if (j>q) {
        		continue;
        	}else{
        		if (A[i][j] == 1) {
        			A[i][j] = 0;
        		}else {
        			A[i][j] = 1;
        		}     
        	}
        	  	
        }
        return A;
    }
}

/**
 * 最短方法
 * class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int x = A.length, y = A[0].length;
        int[][] B = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                B[i][j] = A[i][y - 1 - j] ^ 1;
            }
        }
        return B;
    }
}
 */