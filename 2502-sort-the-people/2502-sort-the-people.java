class People implements Comparable<People>{
    int height;
    String name;
    public People(int height, String name){
        this.height = height;
        this.name = name;
    }
    @Override
    public String toString(){
        return "height: "+this.height+", name: "+this.name+" ";
    }
    @Override
    public int compareTo(People o){
        if(this.height < o.height) //Reversing the compareTo for decreaasing order
            return 1;
        else if(this.height > o.height)
            return -1;
        else
            return 0;   
    }
}
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        People []p = new People[heights.length];
        for(int i=0; i<heights.length; i++){
            People temp = new People(heights[i], names[i]);
            p[i] = temp;
        }
        Arrays.sort(p);
        for(int i=0; i<heights.length; i++){
            names[i] = p[i].name;
        }
        // System.out.println(Arrays.toString(p));
        return names;
    }
}