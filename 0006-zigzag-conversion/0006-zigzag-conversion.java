class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1||numRows>s.length()){
            return s;
        }
        ArrayList<StringBuilder>rows=new ArrayList<>();
        for(int i=0;i<numRows;i++){
          rows.add(new StringBuilder());
        }
        int cr=0;
        boolean gd=false;
        for(int i=0;i<s.length();i++){
            rows.get(cr).append(s.charAt(i));
            if(cr==0||cr==numRows-1){
                gd=!gd;

            }
            if(gd){
                cr++;
            }
            else
            {
                cr--;
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<rows.size();i++){
            sb.append(rows.get(i));
        }
        return sb.toString();
        
    }
}