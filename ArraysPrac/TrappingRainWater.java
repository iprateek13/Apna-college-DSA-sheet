public class TrappingRainWater {
    public static int trappedRainWater(int height[]) {
        int n = height.length;
        // left max boundary
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }
        // right max boundary
        int rightmax[] = new int[n];
        rightmax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightmax[i] = Math.max(height[i], rightmax[i + 1]);
        }

        // loop
        // waterlevel=min(leftmax,rightmax)
        int trappedRainWater = 0;
        for (int i = 0; i < n; i++) {
            int waterlevel = Math.min(leftMax[i], rightmax[i]) - height[i];
            trappedRainWater += waterlevel;
        }
        // trappedwater=(waterlevel-height)*width
        return trappedRainWater;
    }

    public static void main(String[] args) {
        int heights[] = { 4, 2, 0, 6, 3, 2, 5 };
        int Totalwater = trappedRainWater(heights);
        System.out.println("The total Trappedwater is : " + Totalwater);
    }

}
