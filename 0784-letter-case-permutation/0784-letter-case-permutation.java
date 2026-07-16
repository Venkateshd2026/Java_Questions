class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String>ans=new ArrayList<>();
        char arr[]=s.toCharArray();
        permute(arr,0,ans);
        return ans;
    }
    public static void permute(char arr[],int index,List<String>ans){
        if(index==arr.length){
            ans.add(new String(arr));
            return ;
        }
        if(Character.isDigit(arr[index])){
            permute(arr,index+1,ans);
        }
        else
        {
            arr[index]=Character.toLowerCase(arr[index]);
            permute(arr,index+1,ans);
            arr[index]=Character.toUpperCase(arr[index]);
            permute(arr,index+1,ans);
        }
    }
}