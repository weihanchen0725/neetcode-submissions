class Solution {
    public boolean isPalindrome(String s) {
        if(s.trim().length() == 0) return true;
        int left = 0, right = s.length() - 1;
        while(left < right){
            char cLeft = s.charAt(left);
            char cRight = s.charAt(right);
            if(!isLetter(cLeft)){
                left++;
                continue;
            }
            if(!isLetter(cRight)){
                right--;
                continue;
            }
            if(cLeft != cRight && !isSameUpper(cLeft, cRight) && !isSameLower(cLeft, cRight)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    private boolean isLetter(char c){
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9');
    }
    private boolean isSameUpper(char cLeft, char cRight){
        if(cLeft >= 'a' && cLeft <= 'z'){
            char newCLeft = (char)(cLeft-'a'+'A');
            return newCLeft == cRight;
        }
        return cLeft == cRight;
    }
    private boolean isSameLower(char cLeft, char cRight){
        if(cLeft >= 'A' && cLeft <= 'Z'){
            char newCLeft = (char)(cLeft-'A'+'a');
            return newCLeft == cRight;
        }
        return cLeft == cRight;
    }
}
