class Solution {
    public int maxArea(int[] height) {
        int largest = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            int width = right - left;
            int area = (height[right] < height[left] ? height[right] : height[left]) * width;
            largest = Math.max(area, largest);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return largest;
    }
}