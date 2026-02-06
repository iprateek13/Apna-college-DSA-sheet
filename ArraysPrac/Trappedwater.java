public class Trappedwater {
    public static int trappedwater(int height[]) {
        int n = height.length;
        // LeftMAx Boundary
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }
        // RightMax Boundary
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }
        // waterlevel
        int trappedwater = 0;
        for (int i = 0; i < n; i++) {
            int waterlevel = Math.min(leftMax[i], rightMax[i]) - height[i];
            trappedwater += waterlevel;

        }
        return trappedwater;
    }

    public static void main(String[] args) {
        // int heightOfTowers[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        int heightOfTowers[] = { 4, 2, 0, 3, 2, 5 };
        int trappedwater = trappedwater(heightOfTowers);
        System.out.println("the totaltrappedWater is : " + trappedwater);
    }

}
