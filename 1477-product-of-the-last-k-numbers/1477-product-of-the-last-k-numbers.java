class ProductOfNumbers {
    List<Integer> pre = new ArrayList<>();
    public ProductOfNumbers() {
        pre.add(1);
        // this.size=0;
    }
    
    public void add(int num) {
        if(num==0){
            pre = new ArrayList<>();
            pre.add(1);
            // this.size=0;
            return;
        }
        pre.add(pre.get(pre.size()-1) * num);
    }
    
    public int getProduct(int k) {
        if(pre.size()<=k){
            return 0;
        }
        return pre.get(pre.size()-1)/pre.get(pre.size()-k-1);
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */