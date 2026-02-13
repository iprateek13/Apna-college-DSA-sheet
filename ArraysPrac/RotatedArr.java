public class RotatedArr {
    public static int SearchInRotatedArr(int arr[], int target) {
        int n = arr.length;
        int start = 0, end = n - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target)
                return mid;
            // left half sorted
            if (arr[start] <= arr[mid]) {
                if (target >= arr[start] && target <= arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
                // RIGHT HALF SORTED
            } else {
                if (target >= arr[mid] && target <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }

            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int num[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        int index = SearchInRotatedArr(num, target);
        if (index == -1) {
            System.out.println("The target is not present");
        } else {
            System.out.println("the target is present at : " + index);
        }
    }
}
