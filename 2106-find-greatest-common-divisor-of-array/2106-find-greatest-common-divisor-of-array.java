class Solution {
    public int findGCD(int[] nums) {
        int small = 1001;
        int large = 0;
        for(int num : nums){
            if(num > large){
                large = num;
            }
            if(num < small){
                small = num;
            }
        }
        /*for(int i=2;i<=small;i++){
            if(small%i==0 && large%i==0){
                return i;
            }
        }

        return 1;*/
        while(large!=0){
            int temp = large;
            large = small%large;
            small = temp;
        }
        return small;
    }
}