public class Subarray {
    public static void Subarray(int arr[]) {
        int n = arr.length;
        int tp = 0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int SubArraysum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                    SubArraysum += arr[k];
                }
                System.out.print(" & -> SubArraySum is : " + SubArraysum);
                tp++;
                System.out.println();
                if (SubArraysum > maxSum) {
                    maxSum = SubArraysum;
                }
                if (SubArraysum < minSum) {
                    minSum = SubArraysum;
                }
            }
            System.out.println();
        }
        System.out.println("MaxSum is : " + maxSum);
        System.out.println("MinSum is : " + minSum);
        System.out.println("Total subarrays (by loops) : " + tp);
        int totalSubArray = n * (n + 1) / 2;
        System.out.println("Total subarrays (by formula)  : " + totalSubArray);

    }

    public static void main(String[] args) {
        int num[] = { 1, -2, 6, -1, 3 };
        Subarray(num);
    }
}
