import java.util.Arrays;
import java.util.HashSet;

public class DuplicateNo {
    public static boolean duplicateno(int arr[]) {
        int n = arr.length;
        boolean ispresent = false;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    ispresent = true;
                }
            }
        }
        return ispresent;
    }

    public static boolean betterDuplicateno(int arr[]) {
        int n = arr.length;
        boolean ispresent = false;
        Arrays.sort(arr);
        for (int i = 0; i <= n - 2; i++) {
            if (arr[i] == arr[i + 1]) {
                return true;
            }
        }
        return ispresent;
    }

    public static boolean OptimalDuplicateno(int arr[]) {
        HashSet<Integer> set = new HashSet<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (set.contains(arr[i])) {
                return true;
            }
            {
                set.add(arr[i]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 1 };
        // boolean ispresent = duplicateno(arr);
        // boolean ispresent = betterDuplicateno(arr);
        boolean ispresent = OptimalDuplicateno(arr);
        System.out.println(ispresent);
    }

}

// Brute Force - O(n^2)