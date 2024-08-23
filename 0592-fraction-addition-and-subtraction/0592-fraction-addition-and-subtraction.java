class Solution {
    private int gcd(int a, int b){
        int ans = Math.max(a, b);
        while(ans>1){
            if(a%ans==0 && b%ans==0)
                return ans;
            ans--;
        }
        return ans;
    }
    public String fractionAddition(String expression) {
        int size = 0;
        for(int i=0; i<expression.length(); i++)
            if(expression.charAt(i)=='/')
                size++;
        int nums[] = new int[2*size];
        int idx=0;
        for(int i=0; i<expression.length(); i++){
            StringBuilder temp = new StringBuilder();
            int j=i;
            while(j<expression.length() && expression.charAt(j)!='/')
                temp.append(expression.charAt(j++));
            nums[idx++] = Integer.parseInt(temp.toString());
            j++;
            temp=new StringBuilder();
            while(j<expression.length() && expression.charAt(j)!='+' && expression.charAt(j)!='-')
                temp.append(expression.charAt(j++));
            nums[idx++] = Integer.parseInt(temp.toString());
            i=j-1;
        }
        int num=0;
        int den=1;
        for(int i=0; i<nums.length-1; i+=2){
            num = (num*nums[i+1])+(den*nums[i]);
            den *= nums[i+1];
        }
        // System.out.println(Arrays.toString(nums));
        // System.out.println(num +"/" +den);
        if(num==0)
            return "0/1";
        int gcd = gcd(Math.abs(num), den);
        num/=gcd;
        den/=gcd;
        // System.out.println("gcd: "+gcd);
        return num+"/"+den;
    }
}