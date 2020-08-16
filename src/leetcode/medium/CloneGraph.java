package leetcode.medium;

import java.util.*;

/**
 * 克隆图
 */
public class CloneGraph {
    Map<Node, Node> mapDepth = new HashMap<>();
    static class Node {
        public int val;
        public List<Node> neighbors;

        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }

    /**
     * 深度优先遍历
     * @param node
     * @return
     */
    public Node cloneGraph(Node node) {
        if(node == null) {
            return node;
        }
        if(mapDepth.containsKey(node)) {
            return mapDepth.get(node);
        }
        Node cloneNode = new Node(node.val);
        mapDepth.put(node, cloneNode);
        for (Node neighbor : node.neighbors) {
            cloneNode.neighbors.add(cloneGraph(neighbor));
        }
        return cloneNode;
    }

    /**
     * 广度优先遍历
     * @param node
     * @return
     */
    public Node cloneGraph1(Node node) {
        if(node == null) {
            return node;
        }
        HashMap<Node, Node> visited = new HashMap<>();
        Queue<Node> queue = new LinkedList<>();
        visited.put(node, new Node(node.val));
        queue.add(node);
        while (!queue.isEmpty()) {
            Node curNode = queue.poll();
            for (Node neighbor : curNode.neighbors) {
                if(!visited.containsKey(neighbor)) {
                    visited.put(neighbor, new Node(neighbor.val));
                    queue.add(neighbor);
                }
                visited.get(curNode).neighbors.add(visited.get(neighbor));
            }
        }
        return visited.get(node);
    }
}
