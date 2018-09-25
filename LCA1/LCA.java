class Node {
    Node left;
    Node right;
    int data;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class LCA{

  public static Node insert(Node root, int data) {
        if(root == null)
            return new Node(data);
         else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static Node lca(Node root, int v, int w){
        if((root.data < v) && (root.data < w))
            return lca(root.right, v, w);
        if((root.data > v) && (root.data > w))
            return lca(root.left, v, w);
      return root;

    }

  public static void main(String[] args){

  }
}
