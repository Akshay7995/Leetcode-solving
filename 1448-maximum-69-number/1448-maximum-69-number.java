class Solution {
    public int maximum69Number (int num) {
        String str = String.valueOf(num);
        int max = num;
        for(int i=0;i<str.length();i++){
            char[] ch = str.toCharArray();
            if(ch[i]=='6'){
                ch[i]='9';
                int flipped = Integer.parseInt(new String(ch));
                max = Math.max(flipped,max);
            }
        }
        return max;
    }
}