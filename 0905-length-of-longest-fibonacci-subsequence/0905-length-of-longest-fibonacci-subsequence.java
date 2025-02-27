class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        int n = arr.length;
        HashSet<Integer> hs = new HashSet<>();
        for(int num : arr){
            hs.add(num);
        }
        int max_len = 0;
        for(int i=0;i<n;i++){
            for(int j = i+1;j<n;j++){
                int prev = arr[i];
                int curr = arr[j];
                int len = 2;

                while(hs.contains(prev+curr)){
                    int temp = prev+curr;
                    prev = curr;
                    curr = temp;
                    len++;
                }
                max_len = Math.max(max_len,len);
            }
        }
        return max_len >= 3 ? max_len : 0;
    }
}