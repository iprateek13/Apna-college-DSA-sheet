public class PrefixSubarrSum {

    public static void PrefixSubarrSum(int arr[]) {
        int SubArraySum = 0;
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;
        int prefixArr[] = new int[n];
        prefixArr[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixArr[i] = prefixArr[i - 1] + arr[i];
        }
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (i == 0) {
                    SubArraySum = prefixArr[j];
                } else {
                    SubArraySum = prefixArr[j] - prefixArr[i - 1];
                }
                System.out.println(" -> SubArraySum is : " + SubArraySum);
                if (SubArraySum > maxSum) {
                    maxSum = SubArraySum;
                }
                if (SubArraySum < minValue) {
                    minValue = SubArraySum;
                }
            }
        }

        System.out.println("Maximum Subarray Sum (Prefix Method): " + maxSum);
        System.out.println("Maximum Subarray Sum (Prefix Method): " + minValue);
    }

    public static void main(String[] args) {
        int num[] = { 1, -2, 6, -1, 3 };
        PrefixSubarrSum(num);
    }
}
