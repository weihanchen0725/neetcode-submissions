class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        int[] resultMap = new int['z'-'a'+1];
        for(int i=0; i<s1.length(); i++){
            resultMap[s1.charAt(i)-'a']++;
            resultMap[s2.charAt(i)-'a']--;
        }
        if(checkAllZeros(resultMap)) return true;
        for(int i=s1.length(); i<s2.length(); i++){
            resultMap[s2.charAt(i)-'a']--;
            resultMap[s2.charAt(i-s1.length())-'a']++;
            if(checkAllZeros(resultMap)) return true;
        }
        return false;
    }
    private boolean checkAllZeros(int[] resultMap){
        for(int result : resultMap){
            if(result != 0) return false;
        }
        return true;
    }
}
