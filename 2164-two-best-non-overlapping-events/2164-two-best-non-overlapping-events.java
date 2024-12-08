class Solution {
    public int maxTwoEvents(int[][] events) {
        int n = events.length;
        Arrays.sort(events,(a,b)->a[0]-b[0]);
        int[] suffix = new int[n];
        suffix[n-1] = events[n-1][2];
        for(int i=n-2;i>=0;--i){
            suffix[i] = Math.max(events[i][2],suffix[i+1]);
        }
        int maxSum = 0;
        for(int i=0;i<n;i++){
            int left = i+1;
            int right = n-1;
            int nextEventIndex = -1;
            while(left<=right){
                int mid = ((right-left)/2)+left;
                if(events[mid][0] > events[i][1]){
                    nextEventIndex = mid;
                    right = mid-1;
                }else{
                    left = mid+1;
                }
            }
            if(nextEventIndex != -1){
                maxSum = Math.max(maxSum,events[i][2]+suffix[nextEventIndex]);
            }
            maxSum = Math.max(maxSum,events[i][2]);
        }
        return maxSum;
    }
}