import java.util.*;

class CarryForward{
    public static void main(String[] args){
        System.out.println("Carry forward technique");
    }

//Count "AG" pairs in given string
    private int countAGPairs(String A){
        int N = A.length();
        int pairs = 0;
        int count = 0;
        for(int i=0; i<N; i++){
            if(A.charAt(i) == 'a'){
                count++;
            }
            if(A.charAt(i) == 'g'){
                pairs += count;
            }
        }
        return pairs;
    }
}

//---------------- count of even numbers in given range -----------

private int[] countEvenNumber(int[] A, int[][] B){
    int N = A.length;
    int M = B.length;

    int[] pcount = new int[N];

    if(A[0] % 2 == 0){
        pcount[0] = 1;
    }else{
        pcount[0] = 0;
    }

    for(int i=1; i<N; i++){
        if(A[i] % 2 == 0){
            pcount[i] = pcount[i-1] + 1;
        }else{
            pcount[i] = pcount[i-1];
        }
    }

    int[] ans = new int[M];

    for(int i=0; i<m; i++){
        int l = B[i][0];
        int r = B[i][1];

        int count = 0;

        if(l == 0){
            count = pcount[r];
        }else{
            count = pcount[r] - pcount[l-1];
        }
        ans[i] = count;
    }
    return ans;
}



