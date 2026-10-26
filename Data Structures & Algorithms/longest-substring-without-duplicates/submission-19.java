class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] charList = new int[128];
        int left = 0, result = 0;

        for(int right = 0; right < s.length(); right++){
            char currChar = s.charAt(right);
            left = Math.max(left, charList[currChar]);
            result = Math.max(result, right - left + 1);
            charList[currChar] = right + 1;
        }
        return result;
    }
}
