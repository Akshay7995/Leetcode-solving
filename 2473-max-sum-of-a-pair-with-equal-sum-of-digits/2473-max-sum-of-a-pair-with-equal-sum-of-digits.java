class Solution {
    public int maximumSum(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int maxsum = -1;
        for(int i=0;i<nums.length;i++){
            int temp1 = 0;
            int num = nums[i];
            while(num > 0){
                int temp = num%10;
                num = num/10;
                temp1 = temp1+temp;
            }
            if(hm.containsKey(temp1)){
                int sum = hm.get(temp1)+nums[i];
                
                maxsum = Math.max(sum,maxsum);
                hm.put(temp1,Math.max(hm.get(temp1),nums[i]));
            }else{
                hm.put(temp1,nums[i]);
            }
        } 
        return maxsum;
    }
}