class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int k=0;
        int[] arr = new int[nums1.length+nums2.length];
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                arr[k] = nums1[i];
                k++;
                i++;
            }else{
                arr[k] = nums2[j];
                j++;
                k++;
            }
        }
        while(i<nums1.length){
            arr[k] = nums1[i];
            i++;
            k++;
        }
        while(j<nums2.length){
            arr[k] = nums2[j];
            k++;
            j++;
        }
        int len = arr.length;
        if((len)%2 != 0){
            return arr[(len/2)];
        }else{
            return (arr[(len)/2]+arr[(len/2)-1])/2.0;
        }
    }
}