class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        int[] resultMap = new int['z'-'a'+1];
        for(int index = 0; index < s1.length(); index++){
            char c1 = s1.charAt(index);
            char c2 = s2.charAt(index);
            resultMap[c1-'a']++;
            resultMap[c2-'a']--;
        }
        if(checkAllZeros(resultMap)) return true;
        for(int index = s1.length(); index < s2.length(); index++){
            char cRight = s2.charAt(index);
            char cLeft = s2.charAt(index-s1.length());
            resultMap[cLeft-'a']++;
            resultMap[cRight-'a']--;
            if(checkAllZeros(resultMap)) return true;
        }
        return false;
        
        
    }
    private boolean checkAllZeros(int[] array){
        for(int num : array){
            if(num != 0) return false;
        }
        return true;
    }
}
