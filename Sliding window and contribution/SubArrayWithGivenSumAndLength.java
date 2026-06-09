class SubArrayWithGivenSumAndLength{
    public static void main(String[] args){
        int[] A = {4, 3, 2, 6, 1};
        int B = 3;
        int C = 11;

        int result = solve(A, B, C);

        System.out.println(result); // Expected output: 1
    }

    private static int solve(int[] A, int B, int C){
        int N = A.length;
        if(B > N) return 0;

        int[] psum = new int[N];
        psum[0] = A[0];

        for(int i=1; i<N; i++){
            psum[i] = psum[i-1]+A[i];
        }

        for(int i=0; i+(B-1) < N; i++){
            int j = (i-1)+B;
            int sum = psum[j] - ((i>0) ? psum[i-1] : 0);
            if(sum == C){
                return 1;
            }
        }
        return 0;
    }
}