class Solution {
    public int[] avoidFlood(int[] rains) {
        int n = rains.length;
        int[] ans = new int[n];
        Arrays.fill(ans,-1);
        HashMap<Integer,Integer> lastrain = new HashMap<>(); // keep track of last rain over a lake
        TreeSet<Integer> sunnyday = new TreeSet<>(); // keep track of all sunny days

        for(int i=0;i<n;i++){
            int lake = rains[i];
            if(lake == 0){
                sunnyday.add(i);
            }
            else{
                if(lastrain.containsKey(lake)){
                    int prevrain = lastrain.get(lake);
                    Integer dryday = sunnyday.higher(prevrain);
                    if(dryday == null){
                        return new int[0];
                    }
                    ans[dryday] = lake;
                    sunnyday.remove(dryday);
                }
                lastrain.put(lake,i);
            }
        }
        for(int d : sunnyday){
            ans[d]=1; // for any unused sunny days assigning as 1(dummy)
        }
        return ans;
    }
}