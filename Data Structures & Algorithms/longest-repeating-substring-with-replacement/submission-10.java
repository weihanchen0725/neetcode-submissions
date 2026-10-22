class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0; 
        int maxFreq = 0;
        int maxLength = 0;
        int[] charList = new int[26];

        for(int right = 0; right < s.length(); right++){
            int rightPointerIndex = s.charAt(right) - 'A';
            charList[rightPointerIndex]++;
            maxFreq = Math.max(maxFreq, charList[rightPointerIndex]);
            
            if((right - left + 1) - maxFreq > k){
                int leftPointerIndex = s.charAt(left) - 'A';
                charList[leftPointerIndex]--;
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
