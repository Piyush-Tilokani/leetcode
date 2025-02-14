class ProductOfNumbers {
    List<Integer> l;
    public ProductOfNumbers() {
        l = new ArrayList<>();
    }
    
    public void add(int num) {
        l.add(num);
    }
    
    public int getProduct(int k) {
        int prod=1;
        if(l.size()>=k){
            for(int i=l.size()-1; k>0; i--, k--){
                prod*=l.get(i);
            }
        }
        return prod;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */