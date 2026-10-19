class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] charMapList = new int[128];
        int left = 0, result = 0;

        for(int right = 0; right < s.length(); right++){
            char currChar = s.charAt(right);
            left = Math.max(left, charMapList[currChar]);
            result = Math.max(result, right - left + 1);
            charMapList[currChar] = right+1;
        }

        return result;
    }
}
