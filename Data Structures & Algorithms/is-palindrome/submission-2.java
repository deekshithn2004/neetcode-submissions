class Solution {
    public boolean isPalindrome(String s) {
        s.replaceAll("\\s+","");
        char [] arr=s.toCharArray();
        int i=0;
        int j=s.length()-1;
        while(i<j){
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }

            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }
            if(Character.toLowerCase(arr[i])!=Character.toLowerCase(arr[j])){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
