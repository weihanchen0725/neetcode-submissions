class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hmap = new HashMap<>();
        int strsLength = strs.length;
        for(int index = 0; index < strsLength; index++){
            String currentStr = strs[index];
            char[] currentStrCharArray = currentStr.toCharArray();
            Arrays.sort(currentStrCharArray);
            currentStr = new String(currentStrCharArray);
            if(!hmap.containsKey(currentStr)){
                hmap.put(currentStr, new ArrayList<String>());
            } 
            hmap.get(currentStr).add(strs[index]);
        }
        return new ArrayList(hmap.values());
    }
}
