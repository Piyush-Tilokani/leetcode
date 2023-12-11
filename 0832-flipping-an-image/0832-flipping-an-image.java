class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i = 0; i<image.length; i++){
            int l = 0;
            int h = image[i].length-1;
            if (image[i].length %2 != 0){
                if(image[i][image[i].length/2] == 0)
                    image[i][image[i].length/2] = 1;
                else
                    image[i][image[i].length/2] = 0;
            }
            while (h>l){
                if(image[i][l] == image[i][h]){
                    if(image[i][l]==0){
                        image[i][l] = 1;
                        image[i][h] = 1;
                    }
                    else{
                        image[i][l] = 0;
                        image[i][h] = 0;
                    }
                }
                l++;
                h--;
            }
        }
        return image;
    }
}