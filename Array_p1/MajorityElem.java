public class MajorityElem {

    public static int majorityElem(int arr[]) {
        int n = arr.length;
        int majority = -1;

        for (int i = 0; i < n; i++) {
            int count = 1;

            // count occurrences
            for (int j = i + 1; j < n; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }

            // check majority
            if (count > n / 2) {
                majority = arr[i];
                return majority; // stop early
            }
        }
        return majority;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
        int MajorElem = majorityElem(nums);
        System.out.println("Majority Element: " + MajorElem);
    }
}