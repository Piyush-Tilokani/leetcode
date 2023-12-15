// class Solution {
//     public String destCity(List<List<String>> paths) {
//         List<String> srcs = new ArrayList<>();
//         for (List<String> path: paths ){
//             srcs.add(path.get(0));
//         }
//         for (List<String> path: paths ){
//             if(!srcs.contains(path.get(1))){
//                 return path.get(1);
//             }
//         }
//         System.gc();
//         return "";
//     }
// }

//More optimised approach (Using sets)

class Solution{
     public String destCity(List<List<String>> paths) {
         HashSet<String> srcs = new HashSet<String>();
         for(List<String> path: paths){
             srcs.add(path.get(0));
         }
         for (List<String> path: paths ){
            if(!srcs.contains(path.get(1))){
                return path.get(1);
            }
        }
        System.gc();
        return "";
     }
}