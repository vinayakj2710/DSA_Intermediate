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



