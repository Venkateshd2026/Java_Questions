class Solution {
    public int[] beautifulArray(int n) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        while(list.size()<n){
            ArrayList<Integer>temp=new ArrayList<>();
            for(int i=0;i<list.size();i++){
                int x=2*list.get(i)-1;
                if(x<=n){
                    temp.add(x);
                }
            }
            for(int i=0;i<list.size();i++){
                int x=2*list.get(i);
                if(x<=n){
                    temp.add(x);
                }
            }
            list=temp;
        }
        int ans[]=new int[n];
        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}