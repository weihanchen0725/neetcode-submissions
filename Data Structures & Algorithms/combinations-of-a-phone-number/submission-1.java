class Solution {
    private List<String> results = new ArrayList<>();
    private String[] digitToChar = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()) return new ArrayList<>();
        backtrack(0, "", digits);
        return results;
    }

    private void backtrack(int index, String currentStr, String digits){
        if(currentStr.length() == digits.length()) {
            results.add(currentStr);
            return;
        }
        String chars = digitToChar[digits.charAt(index) - '0'];
        for(char c : chars.toCharArray()){
            backtrack(index+1, currentStr+c, digits);
        }
    }
}
