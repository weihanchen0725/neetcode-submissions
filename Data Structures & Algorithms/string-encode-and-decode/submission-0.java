class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str : strs){
            sb.append(str.replace("#","##")).append(" # ");
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> results = new ArrayList<>();
        String[] strArray = str.split(" # ",-1);
        for(int index = 0; index < strArray.length - 1; index++){
            String newStr = strArray[index];
            results.add(newStr.replace("##","#"));
        }
        return results;
    }
}
