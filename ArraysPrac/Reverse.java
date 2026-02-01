import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Reverse {
    // brute force approach -time complexity - O(n) and space complexity - O(n)
    public static void bruteReverse(int num[]) {
        int n = num.length;
        int tempArr[] = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            tempArr[n - i - 1] = num[i];
        }
        for (int i = 0; i < tempArr.length; i++) {
            System.out.print(tempArr[i] + " ");
        }
        System.out.println();
        // for each method
        System.out.print("Reverse no. is printed by For-each loop : ");
        for (int revNums : tempArr) {
            System.out.print(revNums + " ");
        }

    }

    // Btter approach - time complexity - O(n) and space complexity - O(1)
    public static void reverse(int num[]) {
        int stIndex = 0;
        int lsIndex = num.length - 1;
        while (stIndex < lsIndex) {
            int tempVar = num[stIndex];
            num[stIndex] = num[lsIndex];
            num[lsIndex] = tempVar;

            stIndex++;
            lsIndex--;
        }
    }

    // optimal approch by built-in function
    // In Java, the Collections.reverse() method can be used to reverse a list
    // in-place.
    // Arrays need to be converted to a list first, as the Collections utility works
    // with List types, not primitive arrays.
    public static void reverseArray(List<Integer> arr) {
        // Call Collections.reverse to reverse list in-place
        Collections.reverse(arr);
    }

    public static void main(String[] args) {
        // int numbers[] = { 34, 23, 43, 56, 46 };
        // reverse(numbers);
        // bruteReverse(numbers);
        // for (int i = 0; i < numbers.length; i++) {
        // System.out.print(numbers[i] + " ");
        // }
        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        reverseArray(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
