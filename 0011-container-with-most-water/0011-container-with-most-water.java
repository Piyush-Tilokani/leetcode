class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int ans=0;
        while(l<r){
            int h=Math.min(height[l], height[r]);
            ans=Math.max(ans, (r-l)*h);
            while(l<r && height[l]<=h) //Shift the pointers untill you don't find a greater height
                l++;
            while(l<r && height[r]<=h) //Shift the pointers untill you don't find a greater height
                r--;
        }
        return ans;
    }
}