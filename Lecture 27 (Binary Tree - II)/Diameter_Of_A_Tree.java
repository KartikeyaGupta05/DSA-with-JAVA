public class Diameter_Of_A_Tree {
    static class Node{
        int data;
        Node root;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.root = null;
            this.left = null;
            this.right = null;
        }
    }

    public static int height(Node root){
        if (root == null) {
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);

        return Math.max(lh, rh) + 1;
    }

    public static int Approach_1(Node root){  // Tc = O(n^2)
        if (root == null) {
            return 0;
        }
        int leftDiam = Approach_1(root.left);
        int leftHt = height(root.left);
        int rightDiam = Approach_1(root.right);
        int rightHt = height(root.right);

        int selfDiam = leftHt + rightHt + 1;

        return Math.max(selfDiam, Math.max(rightDiam, leftDiam));
    }

    // Approach 2

    static class Info{
        int diam;
        int ht;

        public Info(int diam, int ht){
            this.diam = diam;
            this.ht = ht;
        }
    }
        
        public static Info Approach_2(Node root){  // TC = O(n)
            // this method is time efficient because its do both work of diameter and height in same recursive call.
            if (root == null) {
                return new Info(0, 0);
            }
            
            Info leftInfo = Approach_2(root.left);
            Info righInfo = Approach_2(root.right);
            
            int diam = Math.max(Math.max(leftInfo.diam, righInfo.diam), leftInfo.ht + righInfo.ht + 1);
            int ht = Math.max(leftInfo.ht, righInfo.ht) + 1;
            
            return new Info(diam, ht);
    }

    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        System.out.println("Diameter of tree is = " + Approach_1(root));
        System.out.println("Diameter of tree is = " + Approach_2(root).diam);
        System.out.println("Height of tree is = " + Approach_2(root).ht);
    }
}