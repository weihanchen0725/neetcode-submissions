class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int[] charList = new int[128];
        int maxLength = 0;
        
        for(int right = 0; right < s.length(); right++){
            char currChar = s.charAt(right);
            left = Math.max(left, charList[currChar]);
            maxLength = Math.max(maxLength, right - left + 1);
            charList[currChar] = right + 1;
        }

        return maxLength;
    }
}
