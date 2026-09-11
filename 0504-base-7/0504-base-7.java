class Solution {
    public String convertToBase7(int num) {
        if(num==0){
            return "0";
        }
        boolean negative=num<0;
        if(negative){
            num=-num;
        }
        StringBuilder res=new StringBuilder();
        while(num>0){
            int r=num%7;
            res.append(r);
            num=num/7;
        }
        if(negative){
            res.append("-");
        }
        return res.reverse().toString();
        
    }
}