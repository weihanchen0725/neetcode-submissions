public class TriNode{
    HashMap<Character, TriNode> children = new HashMap<>();
    boolean endOfWord = false;
}

class PrefixTree {
    private TriNode root;

    public PrefixTree() {
         root = new TriNode();
    }

    public void insert(String word) {
        TriNode current = root;
        for(char c : word.toCharArray()){
            current.children.putIfAbsent(c, new TriNode());
            current = current.children.get(c);
        }
        current.endOfWord = true;
    }

    public boolean search(String word) {
        TriNode current = root;
        for(char c : word.toCharArray()){
            if(!current.children.containsKey(c)){
                return false;
            }
            current = current.children.get(c);
        }
        return current.endOfWord;
    }

    public boolean startsWith(String prefix) {
        TriNode current = root;
        for(char c : prefix.toCharArray()){
            if(!current.children.containsKey(c)){
                return false;
            }
            current = current.children.get(c);
        }
        return true;
    }
}
