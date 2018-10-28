import java.util.Scanner;

public class LCA{

  static int [][] matrix;

	static int n = 0;

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

    public static boolean find(Node root, int data){
	    if(root == null) return false;
	    if(root.data == data) return true;
	    else if(find(root.left, data)) return true;
	    else if (find(root.right, data)) return true;
	    return false;
    }

    public static Node lca(Node root, int v, int w){
        if((root.data < v) && (root.data < w))
            return lca(root.right, v, w);
        if((root.data > v) && (root.data > w))
            return lca(root.left, v, w);
      return root;

    }

  public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter the number of data that you want to find the lowest common ancestor to: ");
      int n = scanner.nextInt();
      Node root = null;
      int count=1;
      while(n-- > 0) {
          System.out.print("Enter node "+ count + ": ");
          count++;
          int data = scanner.nextInt();
          root = insert(root,data);
      }

      System.out.print("\nEnter the first node of the 2 nodes that you want to find the lowest common ancestor to: ");
      int v = scanner.nextInt();
      System.out.print("Enter the second node of the 2 nodes that you want to find the lowest common ancestor to: ");
      int w = scanner.nextInt();

      System.out.print("\nThe lowest common ancestor of the 2 nodes is: ");
      Node result = lca(root, v, w);
      System.out.println(result.data);


      scanner.close();;

  }
}
