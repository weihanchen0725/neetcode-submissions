class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str: strs){
            sb.append(str.replace("#","##")).append(" # ");
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        String[] strArray = str.split(" # ", -1);
        for(int i = 0; i < strArray.length-1; i++){
            String newStr = strArray[i];
            result.add(newStr.replace("##","#"));
        }
        return result;
    }
}
