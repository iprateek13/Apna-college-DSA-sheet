public class largerNdsmall {
    public static int largest(int num[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }
        return max;
    }
    public static int smallest(int num[]){
        int small=Integer.MAX_VALUE;
         for (int i = 0; i < num.length; i++) {
            if (num[i] < small) {
                small = num[i];
            }
        }
        return small;
    }

    public static void main(String args[]) {
        int numbers[] = { 2, 5, 0, -1, 5, 3, 7, -9, 17, 34 };
        System.out.println("largest value is : "+ largest(numbers));
        System.out.println("smallest value is : "+ smallest(numbers));

    }
}
