class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int area = 0;
        while(left < right){
            int width = right - left;
            area = Math.max(width * Math.min(height[right], height[left]), area);
            if(height[right] > height[left]){
                left++;
            }else{
                right--;
            }
        }
        return area;
    }
}