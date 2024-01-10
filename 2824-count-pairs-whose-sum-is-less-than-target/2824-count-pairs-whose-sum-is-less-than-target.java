// class Solution {
//     public int countPairs(List<Integer> nums, int target) {
//         int count = 0;
//         for(int i = 0; i<nums.size(); i++){
//             for(int j = i+1; j<nums.size(); j++){
//                 if(nums.get(i)+nums.get(j)<target)
//                     count++;    
//             }
//         }
//         return count;
//     }
// }
//Optimised solution O(n logn), using Collections.sort and 2 pointers
class Solution {
    public int countPairs(List<Integer> nums, int target) {
       Collections.sort(nums);
       int l = 0;
       int r = nums.size() - 1;
       int count = 0;
       while(l<r){
           if(nums.get(l)+nums.get(r) < target){
               count += r-l;
               l++;
           }
           else{
               r--;
           }
       }
       return count;       
    }
}