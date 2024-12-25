import java.util.Stack;

public class Max_Area_in_Histogram {  // Hard level question
    public static int maxArea(int[] height){
        
        // for next smaller element on left side
        Stack<Integer> s = new Stack<>();
        int[] leftSE = new int[height.length];
        for (int i = 0; i < height.length; i++) {
            while (!s.isEmpty() && height[s.peek()] >= height[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                leftSE[i] = -1;
            } else{
                leftSE[i] = s.peek();
            }
            s.push(i);
        }

        // for next smaller element on right side
        s = new Stack<>();
        int[] rightSE = new int[height.length];
        for (int i = height.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && height[s.peek()] >= height[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                rightSE[i] = height.length;
            } else{
                rightSE[i] = s.peek();
            }
            s.push(i);
        }


        // current area = height * width
        // width = j - i - 1 or rightSE[i] - leftSE[i] - 1
        int MaxArea = 0;
        for (int i = 0; i < height.length; i++) {
            int h = height[i];
            int width = rightSE[i] - leftSE[i] - 1;
            int currArea = h * width;

            MaxArea = Math.max(MaxArea, currArea);
        }
        return MaxArea;
    }
    public static void main(String[] args) {
        int[] height = {2, 1, 5, 6, 3, 3};
        System.out.println("Maximum area in Histogram is = " + maxArea(height));
        
    }
}
