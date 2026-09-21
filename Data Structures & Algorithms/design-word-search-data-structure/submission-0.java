class WordDictionary {

    private List<String> store;

    public WordDictionary() {
        store = new ArrayList<>();
    }

    public void addWord(String word) {
        store.add(word);
    }

    public boolean search(String word) {
        for(String w : store){
            if(w.length() != word.length()) continue;
            int index = 0;
            while(index < w.length()){
                if(w.charAt(index) == word.charAt(index) || word.charAt(index) == '.'){
                    
                    index++;
                }else{
                    break;
                }
            }
            if(index == w.length()) return true;
        }
        return false;
    }
}
