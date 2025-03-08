class Solution {
    public int minimumRecolors(String blocks, int k) {
        int count = 0;
        for(int i=0;i<k;i++){
            if(blocks.charAt(i)=='W'){
                count+=1;
            }
        }
        int index = 0;
        int temp = count;
        for(int i=k;i<blocks.length();i++){
            if(blocks.charAt(index)=='W'){
                temp--;
            }
            if(blocks.charAt(i)=='W'){
                temp++;
            }
            index+=1;
            count = Math.min(count,temp);
        }
        return count;
    }
}