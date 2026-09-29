class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hmap = new HashMap<>();
        for(String str : strs){
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);
            if(!hmap.containsKey(sortedStr)){
                hmap.put(sortedStr, new ArrayList<>());
            }
            hmap.get(sortedStr).add(str);
        }
        return new ArrayList(hmap.values());
    }
}
