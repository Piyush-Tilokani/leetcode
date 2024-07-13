class Solution {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        List<Integer> ans = new ArrayList<>();
        int n=positions.length;
        Integer mapping[] = new Integer[n]; //For mapping original positions to sorted, Integer type is necessary for custom comparators 
        for(int i=0; i<n; i++){
            mapping[i] = i;
        }
        Arrays.sort(mapping, (a, b) -> Integer.compare(positions[a], positions[b]));
        Stack<Integer> st = new Stack<>();
        for(int i: mapping){
            if(directions.charAt(i) == 'R') //If starting from left most point, robots go to left, they will never collide
                st.push(i);
            else{ //When we face a robot coming from right side towards the left
                while(!st.isEmpty() && healths[i]>0){  //And until we have robots from left going to the right
                    if(healths[i]==healths[st.peek()]){ //If both robots have same health, remove both
                        healths[i] = 0; //Set health of eliminated robot to 0
                        healths[st.pop()] = 0; //Removed from the stack
                    }
                    else if(healths[i]>healths[st.peek()]){ //If previous robot has more health, reduce its health by 1 and do not add the current robot
                        healths[i]--;
                        healths[st.pop()] = 0;//Set health of eliminated robot to 0
                    }
                    else{ //If health of previous robot is more than current robot
                        healths[st.peek()]--; //, reduce current robot health by 1
                        healths[i] = 0; //Set health of eliminated robot to 0
                    }
                }
            }
        }
        // System.out.println(Arrays.toString(positions));
        for(int i: healths) //Original healths array is modified so we can directly add the modified healths
            if(i>0)
                ans.add(i);
        return ans;
    }
}