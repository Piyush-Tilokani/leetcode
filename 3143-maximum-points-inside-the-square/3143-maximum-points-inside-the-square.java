class Solution {
    private int dist(int [] pt){ //Custom distamce function(From Hint 1: dist = max(abs(x), abs(y)) )
        return Math.max(Math.abs(pt[0]), Math.abs(pt[1]));
    }
    public int maxPointsInsideSquare(int[][] points, String s) {
        Map<int[], Character> map= new HashMap<>(); //Mapping of cordinates to tags
        for(int i=0; i<points.length; i++){
            map.put(points[i], s.charAt(i));
        }
        PriorityQueue<int []> pq = new PriorityQueue<>((a, b) -> Integer.compare(dist(a), dist(b))); //PriorityQueue to store cordinates in increasing dist from origin using custom distance function
        pq.addAll(map.keySet()); //Populating th PQ
        Set<Character> set = new HashSet<>(); //Final answer set (contains the tags of all the points in the valid circle so far)
        while(!pq.isEmpty()){ //Iterating the PQ
            int curr = dist(pq.peek()); 
            Set<Character> currentSq = new HashSet<>(); //Storing the tags of all the points inside current square
            while(!pq.isEmpty() && curr == dist(pq.peek())){ //Getting all the points from PQ with dist == current distance
                if(!set.contains(map.get(pq.peek())) && !currentSq.contains(map.get(pq.peek()))) // If tag of point is not contained by previous square AND current square
                    currentSq.add(map.get(pq.poll()));                                           // Add it into the current square
                else                                                                             // Else    
                    return set.size();                                                           // Return the size set of tags in valid square so far               
            }
            set.addAll(currentSq);  //If all the points of current square have unique tag, add them to new valid square and increase the square area
        }
        return set.size(); 
    }
}