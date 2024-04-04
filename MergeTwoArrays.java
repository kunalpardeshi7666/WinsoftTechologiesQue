/*Q1: Merge two arrays by satisfying given constraints
Given two sorted arrays X[] and Y[] of size m and n each where m >= n and X[] has exactly n vacant cells,
 merge elements of Y[] in their correct position in array X[], i.e., merge (X, Y) by keeping the sorted order.

For example,

Input: X[] = { 0, 2, 0, 3, 0, 5, 6, 0, 0 }
Y[] = { 1, 8, 9, 10, 15 } The vacant cells in X[] is represented by 0 
Output: X[] = { 1, 2, 3, 5, 6, 8, 9, 10, 15 } */


import java.util.*;

class MergeArrays {
    void mergeArrays(int[] X, int[] Y) {
        int m = X.length;
        int n = Y.length;

        int k = m - 1;
        for (int i = m - 1; i >= 0; i--) {
            if (X[i] != 0) {
                X[k--] = X[i];
            }
        }

        
        int i = k + 1, j = 0;
        k = 0;
        while (i < m && j < n) {
            if (X[i] < Y[j]) {
                X[k++] = X[i++];
            } else {
                X[k++] = Y[j++];
            }
        }

        
        while (j < n) {
            X[k++] = Y[j++];
        }
    }

    public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter First Array Size");

	int xSize = sc.nextInt();

	System.out.println("Enter Second Array Size");
	int ySize = sc.nextInt();

        int[] X = new int[xSize];
        int[] Y = new int[ySize];

	
	System.out.println("Enter First Array Elements");
	for(int i =0;i<xSize;i++){
	    X[i] = sc.nextInt();
	}

	System.out.println("Enter Second Array Elements");
        for(int i =0;i<ySize;i++){
            Y[i] = sc.nextInt();
        }
	
	MergeArrays obj = new MergeArrays ();

     	obj.mergeArrays(X, Y);
        System.out.println("Merged Array: " + Arrays.toString(X));
    }
}
