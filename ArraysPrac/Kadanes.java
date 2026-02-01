public class Kadanes {

    public static void Kadanes(int num[]) {
        int cs = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            cs = cs + num[i];
            if (cs < 0) {
                cs = 0;
            }
            if (cs > maxSum) {
                maxSum = cs;
            }
        }
        System.out.println("The maxSubArr Sum is : " + maxSum);
    }

    public static void edgeCase(int arr[]) {
        int currSum = arr[0];
        int maxSum = arr[0];

        for (int i = 1; i < arr.length; i++) {

            currSum = Math.max(arr[i], currSum + arr[i]);
            maxSum = Math.max(maxSum, currSum);
        }
        System.out.println("The maxSubArr Sum is : " + maxSum);

    }

    public static void main(String[] args) {
        int num[] = { 2, 3, 4, 5, 6, 7, -2, -2, };
        int CruxNum[] = { -2, -3, -1, -4 };
        Kadanes(num);
        edgeCase(num);
    }
}
