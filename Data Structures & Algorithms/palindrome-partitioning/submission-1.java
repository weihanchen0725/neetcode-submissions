class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        List<String> temp = new ArrayList<>();
        dfs(0, s, temp, result);
        return result;
    }
    private void dfs(int i, String s, List<String> temp, List<List<String>> result){
        if(i >= s.length()){
            result.add(new ArrayList<>(temp));
            return;
        }
        for(int j = i; j < s.length(); j++){
            if(isPali(s, i, j)){
                temp.add(s.substring(i, j+1));
                dfs(j + 1, s, temp, result);
                temp.remove(temp.size()-1);
            }
        }
    }

    private boolean isPali(String s, int l, int r){
        while(l < r){
            if(s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}
