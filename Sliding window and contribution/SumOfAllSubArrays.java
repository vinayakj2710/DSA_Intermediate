import java.util.ArrayList;

public class SumOfAllSubArrays {

    // Function to calculate sum of all subarrays
    public static long subarraySum(ArrayList<Integer> A) {
        long totalSum = 0;
        long n = A.size();

        for (int i = 0; i < A.size(); i++) {
            long count = (long)(i + 1) * (n - i);
            totalSum += (long) A.get(i) * count;
        }

        return totalSum;
    }

    public static void main(String[] args) {
        
        ArrayList<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(2);
        A.add(3);

        long result = subarraySum(A);
        System.out.println("Sum of all subarrays: " + result);
    }
}