class Solution {
    public int largestInteger(int num) {
        char[] a = String.valueOf(num).toCharArray();
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[j]>a[i] && (a[j]-a[i])%2 == 0){
                    char t = a[j];
                    a[j] = a[i];
                    a[i] = t;
                }
            }
        }
        return Integer.parseInt(new String(a));
    }
}