class Solution {
    public int[] arrayRankTransform(int[] arr) {
        TreeSet<Integer> ts = new TreeSet<>();
        for(int num:arr){
            ts.add(num);
        }
        HashMap<Integer,Integer> hm = new HashMap<>();
        int rank=1;
        for(int num:ts){
            hm.put(num,rank++);
        }
        for(int i=0;i<arr.length;i++){
            arr[i] = hm.get(arr[i]);
        }
        return arr;
    }
}