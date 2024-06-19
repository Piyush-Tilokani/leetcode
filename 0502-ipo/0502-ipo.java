class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int capProf[][] = new int[capital.length][2]; //Array to store projects as [ capital[i], profits[i] ]
        for(int i=0; i<capital.length; i++){          //Basically, to pair capital and profit togeter and to bind them to a sinlge index i
            capProf[i][0] = capital[i];
            capProf[i][1] = profits[i];
        }
        Arrays.sort(capProf, (a, b) -> Integer.compare(a[0], b[0]));  //Sorting the arrbound pair on the basis of increasing require capital
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> Integer.compare(capProf[b][1], capProf[a][1]));  //Max heap to get max profit job available
        int i=0; //To iterate the paired array
        while(k-->0){ //While we have k jobs remaining, 
            while(i<capital.length && capProf[i][0] <= w){ //Take all the jobs that are in our budget 
                pq.offer(i++);                             //and add them to max heap
            }
            if(!pq.isEmpty()) //Max heaps gurantees that max profit job is selected and k is decrement ed after one iteration of outer loop
                w+=capProf[pq.poll()][1]; //Adding up wealth to original wealth variable
            else //If max heap is empty, that means there are no jobs in our budget so we can exit 
                break;
        }
        return w;
    }
}