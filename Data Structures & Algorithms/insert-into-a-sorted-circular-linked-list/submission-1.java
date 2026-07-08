/*
// Definition for a Node.
class Node {
    public int val;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _next) {
        val = _val;
        next = _next;
    }
};
*/

class Solution {
    /*
        curr.val <= insertVal <= curr.next.val

        // Special cases 
            - Larger than the greatest num
                - curr.val < curr.next.val
                - insert if insertVal > curr.val
            - Smaller than the smallest
                - curr.val < curr.next.val
                - insert if insertVal < curr.next.val
        
        // edge case
        only one node


        What does it take to insert after head?
        
        insertNode = new Node(insertVal)
        insertNode.next = head.next;
        head.next = insertNode;



    */
    public Node insert(Node curr, int insertVal) {
        if(curr == null) {
            Node insertNode = new Node(insertVal);
            insertNode.next = insertNode; // probably should clarify
            return insertNode;
        }

        boolean isValidPositionForInsert = isSameNumberList(curr) || (curr.val > curr.next.val 
            && (insertVal > curr.val || insertVal < curr.next.val)) 
            || (curr.val <= insertVal &&  insertVal <= curr.next.val);

        if (isValidPositionForInsert) {
            Node insertNode = new Node(insertVal);
            insertNode.next = curr.next;
            curr.next = insertNode;
            return insertNode;
        } else {
            return insert(curr.next,insertVal);
        }

    }

    private boolean isSameNumberList(Node curr) {
        Node ptr = curr.next;
        while(ptr.val == ptr.next.val && ptr != curr) {
            ptr = ptr.next;
        }
        return ptr == curr;
    }
}
