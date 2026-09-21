class Solution {
    public boolean isAnagram(String s, String t) {
        int[] charArray = new int[26];
        for(char c : s.toCharArray()) charArray[c-'a']++;
        for(char c : t.toCharArray()) charArray[c-'a']--;
        for(int value : charArray) if(value != 0) return false;
        return true;
    }
}
