class Solution {
    public int maximumSwap(int num) {
        //Approach: Visualising num as array of digits and simulating
        int ans=0;
        int n=(int)Math.log10(num) + 1;
        int arr[] = new int[n];
        int numCopy = num;
        for(int i=n-1; i>=0; i--){
            arr[i] = numCopy%10;
            numCopy/=10;
        }
        boolean swap = false;
        for(int i=0; i<n-1; i++){
            if(arr[i+1]>arr[i]){
                int max = arr[i+1];
                int maxInd = i+1;
                for(int j=i+1; j<n; j++){
                    if(arr[j]>=max){
                        max=arr[j];
                        maxInd=j;
                    }
                }
                for(int k=0; k<n; k++){
                    if(arr[k]<max){
                        int temp = arr[k];
                        arr[k] = max;
                        arr[maxInd] = temp;
                        break;
                    }
                }                
                swap=true;
                break;
            }
        }
        if(!swap)
            return num;
        for(int i=0; i<n; i++){
            ans+=arr[i];
            ans*=10;
        }
        return ans/10;
    }
}