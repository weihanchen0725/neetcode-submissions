class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str : strs){
            sb.append(str.replace("#","##")).append(" # ");
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        String[] strArray = str.split(" # ", -1);
        List<String> result = new ArrayList<>();
        for(int index = 0; index < strArray.length-1; index++){
            result.add(strArray[index].replace("##","#"));
        }
        return result;
    }
}
