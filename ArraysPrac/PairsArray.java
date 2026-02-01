public class PairsArray {
    public static void pairsofArray(int arr[]) {
        int n = arr.length;
        System.out.println("The Lenght of the array is : " + n);
        int totpairs = 0;
        for (int i = 0; i <n; i++) {
            for (int j = i + 1; j < n; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ") ");
                totpairs++;
            }
            System.out.println();
        }
        System.out.println("The total pairs is : " + totpairs);
        int totpairsbyFormula = (n*(n - 1)) / 2;
        System.out.println("Total pairs by formula : "+totpairsbyFormula);
    }

    public static void main(String[] args) {
        int num[] = { 2, 3, 4, 5, 6, 7 };
        pairsofArray(num);
    }
}
