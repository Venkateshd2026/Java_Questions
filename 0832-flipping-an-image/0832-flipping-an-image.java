class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n=image.length;
        int m=image[0].length;

        int res[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(image[i][j]==0){
                    res[i][m-1-j]=1;

                }else if(image[i][j]==1){
                    res[i][m-1-j]=0;

                }
            }
        }
        return res;
        
    }
}