class Solution {
    public int[] closestPrimes(int left, int right) {
        ArrayList<Integer> l = new ArrayList<>();
        int ans[] = new int[2];
        for(int i=left;i<=right;i++){
            if(isPrime(i)){
                l.add(i);
            }
        }
        if(l.size()<=1){
            return new int[]{-1,-1};
        }
        System.out.println(l);
        int min_diff = Integer.MAX_VALUE;
        for(int i=0;i<l.size()-1;i++){
            int diff = l.get(i+1)-l.get(i);
            if(diff<min_diff){
                min_diff = diff;
                ans[0] = l.get(i);
                ans[1] = l.get(i+1);
            }
        }
        return ans;
    }
    private boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}