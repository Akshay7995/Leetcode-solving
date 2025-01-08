class Solution {
    public boolean checkPalindromeFormation(String a, String b) {
        return helper1(a,b) || helper1(b,a);
    }
    private boolean helper1(String a,String b){
        int l=0;
        int r = a.length()-1;
        while(l<r){
            if(a.charAt(l) != b.charAt(r)){
                break;
            }
            l++;
            r--;
        }
        return helper2(a,l,r) ||helper2(b,l,r);
    }
    private boolean helper2(String a,int l,int r){
        while(l<r){
            if(a.charAt(l)!=a.charAt(r)){
                break;
            }
            l++;
            r--;
        }
        return l>=r;
    }
}