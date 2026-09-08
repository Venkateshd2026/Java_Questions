class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n=intervals.length;
        int res[][]=new int[n+1][2];
        int index=0;
        int i=0;
        while(i<n&&intervals[i][1]<newInterval[0]){
            res[index][0]=intervals[i][0];
            res[index][1]=intervals[i][1];
            index++;
            i++;
        }
        while(i<n&&intervals[i][0]<=newInterval[1]){
            newInterval[0]=Math.min(newInterval[0],intervals[i][0]);
            newInterval[1]=Math.max(newInterval[1],intervals[i][1]);
            i++;
        }
        res[index][0]=newInterval[0];
        res[index][1]=newInterval[1];
        index++;
        while(i<n){
            res[index][0]=intervals[i][0];
            res[index][1]=intervals[i][1];
            index++;
            i++;
        }
        int ans[][]=new int[index][2];
        for( int j=0;j<index;j++){
            ans[j][0]=res[j][0];
            ans[j][1]=res[j][1];
        }
        return ans;
    }
}