class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        // for clarity refer this - https://leetcode.com/problems/koko-eating-bananas/solutions/1703687/java-c-a-very-very-well-detailed-explanation
        int left = 1;
        int right = 1000000000;
        while(left<=right){
            int mid = right+(left-right)/2;
            if(helper(piles,mid,h)){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return left;
    }
    private boolean helper(int[] piles,int k,int h){
        int hours = 0;
        for(int pile : piles){
            int div = pile/k;
            hours +=div;
            if(pile%k != 0){
                hours++;
            }
        }
        return hours<=h;
    }
}