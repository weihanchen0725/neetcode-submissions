class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int maxFreq = 0;
        int maxLength = 0;

        int[] charList = new int[26];

        for(int right = 0; right < s.length(); right++){
            int currRightIndex = s.charAt(right) - 'A';
            charList[currRightIndex]++;
            maxFreq = Math.max(maxFreq, charList[currRightIndex]);

            if((right - left + 1) - maxFreq > k){
                int currLeftIndex = s.charAt(left) - 'A';
                charList[currLeftIndex]--;
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
