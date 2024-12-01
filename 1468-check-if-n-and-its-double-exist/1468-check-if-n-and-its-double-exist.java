class Solution {
    public boolean checkIfExist(int[] arr) {
        if (arr.length == 0) {
            return false;
        }
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (hs.contains(arr[i] * 2) || (arr[i] % 2 == 0 && hs.contains(arr[i] / 2))) {
                return true;
            }
            hs.add(arr[i]);
        }
        return false;
    }
}
