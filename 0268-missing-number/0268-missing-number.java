class Solution {
    public int missingNumber(int[] arr) {
        int index = 0;
        while(index < arr.length){
            int corrindex = arr[index];
            if(arr[index]<arr.length && arr[index]!=arr[corrindex]){
                int temp = arr[index];
                arr[index] = arr[corrindex];
                arr[corrindex] = temp;
            }
            else{
                index+=1;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i){
                return i;
            }
        }
        return arr.length;
    }
}