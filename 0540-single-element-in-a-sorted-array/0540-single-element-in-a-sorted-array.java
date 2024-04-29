class Solution {
    public int singleNonDuplicate(int[] nums) {
        //Number of elements even means all elements occur twice
        if(nums.length==1)
            return nums[0];
        int ans=-1;
        int l=0;
        int r=nums.length-1;
        while(l<=r){
            int m=l+((r-l)/2);
            if((m==0 && (nums[m]!=nums[m+1])) || (m==nums.length-1 && (nums[m]!=nums[m-1])))
                return nums[m];
            else if( (nums[m]!= nums[m+1]) && (nums[m]!=nums[m-1]) )
                return nums[m];
            else{
                 int m2 = nums[m] == nums[m+1] ? m+1 : m-1;
                 if(m2 > m){
                    if((m-l)%2!=0)
                        r=m-1;
                    if((r-m2)%2!=0)
                        l=m2+1;
                 }  
                 else{
                    if((m2-l)%2!=0)
                        r=m2-1;
                    else if((r-m)%2!=0)
                        l=m+1;
                 }     
            }            
        }
        return -1;
    }
}