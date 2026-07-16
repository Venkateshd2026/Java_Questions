class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>res=new ArrayList<>();
        permute(n,0,0,"",res);
        return res;
        
    }
    public static void permute(int n, int open, int close, String path,List<String>res){
        if(path.length()==2*n){
            res.add(path);
            return;
        }

        if(open<n){
            permute(n,open+1,close,path+"(",res);
        }
        if(close<open){
            permute(n,open,close+1,path+")",res);
        }
    }
}