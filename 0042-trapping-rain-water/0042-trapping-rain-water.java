class Solution {
    public int trap(int[] height) {
        int lMax[] = new int[height.length];
        int rMax[] = new int[height.length];
        lMax[0]=height[0];
        rMax[height.length-1]=height[height.length-1];
        int ans=0;
        for(int i=1; i<height.length; i++){
            lMax[i] = Math.max(height[i], lMax[i-1]);
            rMax[height.length-1-i] = Math.max(height[height.length-1-i], rMax[height.length-i]);
        }
        for(int i=0; i<height.length; i++){
            if(Math.min(lMax[i], rMax[i]) - height[i]>0){
                ans+= Math.min(lMax[i], rMax[i]) - height[i];   
            }
        }
        // System.out.println(Arrays.toString(lMax));
        // System.out.println(Arrays.toString(rMax));

        return ans;
    }
}