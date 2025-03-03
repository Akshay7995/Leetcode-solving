class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        Queue<Integer> p = new LinkedList<>();
        Queue<Integer> n = new LinkedList<>();
        int[] ans = new int[nums.length];
        for(int num:nums){
            if(num%2 == 0){
                p.offer(num);
            }else{
                n.offer(num);
            }
        }
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                ans[i] = p.poll();
            }else{
                ans[i] = n.poll();
            }
        }
        return ans;
    }
}