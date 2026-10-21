class Solution {
    public int characterReplacement(String s, int k) {
        int[] charCountList = new int[26];
        int left = 0;
        int maxFreq = 0;
        int maxLength = 0;

        for(int right = 0; right < s.length(); right++){
            int rightCharIndex = s.charAt(right)-'A';
            charCountList[rightCharIndex]++;
            
            maxFreq = Math.max(maxFreq, charCountList[rightCharIndex]);
            
            while((right - left + 1) - maxFreq > k){
                int leftCharIndex = s.charAt(left)-'A';
                charCountList[leftCharIndex]--;
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
