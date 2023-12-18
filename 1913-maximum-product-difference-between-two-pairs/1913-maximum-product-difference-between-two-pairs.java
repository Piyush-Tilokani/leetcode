class Solution {
    public int maxProductDifference(int[] nums) {
        int w = 0, x = 0, y = 10001, z = 10001;
        for(int num: nums){
            if(num>w){
                x=w;
                w=num;
            }else if(num>x){
                x=num;
            }
            if(num<z){
                y=z;
                z=num;
            }else if(num<y){
                y=num;
            }
        }
        // System.gc();
        return (w*x) - (y*z);
    }
}