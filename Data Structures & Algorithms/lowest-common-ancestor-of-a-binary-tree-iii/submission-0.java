/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node parent;
};
*/

class Solution {
    public Node lowestCommonAncestor(Node p, Node q) {
        Node itr = p;
        Set<Node> nodeSet = new HashSet<>();
        
        while(itr != null) {
            nodeSet.add(itr);
            itr = itr.parent;
        }
        
        itr = q;
        while(itr != null) {
            if (nodeSet.contains(itr)) {
                return itr;
            }
            itr = itr.parent;
        }

        return null;
    }
}