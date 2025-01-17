class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int n = derived.length;
        int[] original = new int[n];
        for(int i=1;i<n;i++){
            original[i] = derived[i-1]^original[i-1];
        }

        for(int i=0;i<n;i++){
            int index = (i+1)%n;
            if(derived[i] != (original[i]^original[index])){
                return false;
            }
        }
        return true;
    }
}