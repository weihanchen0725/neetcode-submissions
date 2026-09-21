class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> results = new ArrayList<>();
        dfs("", results, n);
        return results;
    }

    private boolean valid(String str){
        int open = 0;
        for(char c : str.toCharArray()){
            open += c == '(' ? 1 : -1;
            if(open < 0) return false;
        }
        return open == 0;
    }

    private void dfs(String str, List<String> results, int n){
        if(n * 2 == str.length()){
            if(valid(str)) results.add(str);
            return;
        }
        dfs(str + '(', results, n);
        dfs(str + ')', results, n);
    }
}
