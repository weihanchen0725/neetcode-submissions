class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hmap = new HashMap<>();
        for(String str : strs){
            char[] cArray = str.toCharArray();
            Arrays.sort(cArray);
            String sortedStr = new String(cArray);
            if(!hmap.containsKey(sortedStr)){
                hmap.put(sortedStr, new ArrayList<String>());
            }
            hmap.get(sortedStr).add(str);
        }
        return new ArrayList(hmap.values());
    }
}
