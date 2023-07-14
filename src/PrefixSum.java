import java.util.Scanner;
public class PrefixSum {
    static int[] prefixSumOfArray(int[] A){
        int [] p = new int[A.length];
        p[0] = A[0];
        for(int i = 1; i < A.length; i++){
            p[i] = p[i-1]+A[i];
        }
        return p;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Array size: ");
        int N = scanner.nextInt();
        int array[] = new int[N];
        System.out.print("Array Elements: ");
        for(int i = 0; i < N; i++){
            array[i] = scanner.nextInt();
        }
        int[] prefixSum = prefixSumOfArray(array);
        for(int i = 0; i < prefixSum.length; i++){
            System.out.print(prefixSum[i]+" ");
        }
    }
}
