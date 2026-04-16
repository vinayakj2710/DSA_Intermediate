import java.util.*;

class MaximumSubArraySum{

    public static long maxSubArraySum(int[] A, int K){
        int N = A.length;
        long sum = 0;
        for(int i=0; i<K; i++){
            sum += A[i];
        }
        int si = 1, ei = K;
        long ans = sum;
        while(ei < N){
            sum = sum - A[si-1] + A[ei];
            ans = Math.max(ans, sum);
            si++;
            ei++;
        }

        return ans;
    }

    public static void main(String args[]){
        System.out.println("Find the maximum sub array sum of size K");

        int[] A = {2, 1, 5, 1, 3, 2};
        int K = 3;

        System.out.println("Maximum subarray sum of size " + K + " is: " + maxSubArraySum(A, K));
    }
}