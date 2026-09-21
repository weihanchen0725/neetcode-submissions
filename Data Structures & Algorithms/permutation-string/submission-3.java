class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length(), len2 = s2.length();
        if(len1 > len2) return false;
        int[] resultMaps = new int['z'-'a'+1];
        for(int index = 0; index < len1; index++){
            resultMaps[s1.charAt(index)-'a']++;
            resultMaps[s2.charAt(index)-'a']--;
        }
        if(checkAllZeroes(resultMaps)) return true;
        for(int index = len1; index < len2; index++){
            resultMaps[s2.charAt(index)-'a']--;
            resultMaps[s2.charAt(index-len1)-'a']++;
            if(checkAllZeroes(resultMaps)) return true;
        }
        return false;
    }
    private boolean checkAllZeroes(int[] maps){
        for(int num : maps){
            if(num != 0) return false;
        }
        return true;
    }
}