/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    HashMap<Node, Node> hmap = new HashMap<>();

    public Node copyRandomList(Node head) {
        if(head == null) return null;
        
        if(hmap.containsKey(head)) return hmap.get(head);

        Node copiedHead = new Node(head.val);
        hmap.put(head, copiedHead);
        copiedHead.next = copyRandomList(head.next);
        copiedHead.random = hmap.get(head.random);
        return copiedHead;
        
    }
}
