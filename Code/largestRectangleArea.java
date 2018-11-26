//Brute force
class Solution {
    public int largestRectangleArea(int[] heights) {
        int len = heights.length;
        int maxArea = 0;
        for (int i = 0; i < len; i++) {
            int height = heights[i];
            if (height != 0) {
                int right = i + 1;
                int left = i - 1;

                int width = 1;
                while (left >= 0) {
                    if (heights[left] >= height) {
                        width++;
                        left--;
                    } else {
                        break;
                    }
                }

                while (right < len) {
                if (heights[right] >= height) {
                        width++;
                        right++;
                    } else {
                        break;
                    }
                }

                int area = width*height;
                maxArea = Math.max(area, maxArea);
            }
            
        }
        return maxArea;
    }
}

//To do: Stack
