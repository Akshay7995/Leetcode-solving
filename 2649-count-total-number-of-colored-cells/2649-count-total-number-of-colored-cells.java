class Solution {
    public long coloredCells(int n) {
        /*int increment = 4;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=1;i<=n;i++){
            if(i==1){
                hm.put(i,1);
            }else{
                hm.put(i,hm.get(i-1)+increment);
                increment +=4;
            }
        }
        for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
            if(entry.getKey() == n){
                return entry.getValue();
            }
        }
        return -1;*/
        long increment = 4;
        long ans = 1;
        for(int i=2;i<=n;i++){
            ans += increment;
            increment+=4;
        }
        return ans;
    }
}