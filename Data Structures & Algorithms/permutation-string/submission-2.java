class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int checkLength = s1.length(), totalLength = s2.length();
        int left = 0, right = left + checkLength;
        while(right <= totalLength){
            if(isPerm(left, right, s2, s1)){
                return true;
            }
            left++;
            right++;
        }
        return false;
    }
    private boolean isPerm(int left, int right, String s2, String s1){
        int[] charMap = new int[26];
        for(char c1 : s1.toCharArray()){
            charMap[c1-'a']++;
        }
        for(int i=left; i<right; i++){
            char currentChar = s2.charAt(i);
            charMap[currentChar-'a']--;
        }
        for(int isZero : charMap){
            if(isZero != 0) return false;
        }
        return true;
    }
}
