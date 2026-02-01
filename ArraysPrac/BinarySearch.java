import java.util.Scanner;

public class BinarySearch {
    public static int binarysearch(int num[], int key) {
        int start = 0;
        int end = num.length - 1;
        while (start <= end) {
            for (int i = 0; i < num.length; i++) {
                int midInd = end + (start - end) / 2;
                if (key == num[midInd]) {
                    return midInd;
                } else if (key < num[midInd]) {
                    end = midInd - 1;
                } else if (key > num[midInd]) {
                    start = midInd + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int number[] = { 23, 24, 25, 26, 27, 28, 29, 30, 32, 33, 34 };
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the key you want to find : ");
        int key = sc.nextInt();
        int index = binarysearch(number, key);
        if (index == (-1)) {
            System.out.println("Sorry, the key is not found");
        } else {
            System.out.println("The index of the key is : " + index);
            System.out.println("& The number at the index is : "+number[index]);

        }

    }

}
