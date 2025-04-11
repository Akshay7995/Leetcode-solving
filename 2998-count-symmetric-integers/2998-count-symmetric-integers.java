class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for(int i=low;i<=high;i++){
            int num = i;
            if(helper(num)){
                count++;
            }
        }
        return count;
    }
    private boolean helper(int num){
        int temp_num = num;
        int len = 0;
        while(temp_num>0){
            temp_num = temp_num / 10;
            len++;
        }
        if(len%2 != 0){
            return false;
        }
        String str = Integer.toString(num);
        int len_str = str.length();
        int frst = 0;
        int sec = 0;
        for(int i=0;i<len_str/2;i++){
            frst +=  str.charAt(i)-'0';
        }
        for(int j=len_str/2;j<len_str;j++){
            sec += str.charAt(j)-'0';
        }
        if(frst == sec){
            return true;
        }
        return false;
    }
}