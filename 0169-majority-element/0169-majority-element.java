class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int num : nums){
            if(hm.containsKey(num)){
                hm.put(num,hm.getOrDefault(num,0)+1);
            }
            else{
                hm.put(num,1);
            }
        }

        int temp = nums.length/2;
        /*for(int key: hm.keySet()){
            if(hm.get(key) > temp){
                return key;
            }
        }*/
        for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
            if(entry.getValue()>temp){
                return entry.getKey();
            }
        }
        return -1;
    }
}