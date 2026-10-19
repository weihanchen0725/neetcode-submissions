class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int left = 0;
        int result = 0;
        int[] charList = new int[128];

        for(int right = 0; right < s.length(); right++){
            char currentChar = s.charAt(right);
            left = Math.max(left, charList[currentChar]);
            result = Math.max(result, right - left + 1);
            charList[currentChar] = right + 1;
        }
        return result;
    }
}
