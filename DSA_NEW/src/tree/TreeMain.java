package tree;

public class TreeMain {

    public static void main(String[] args) {

        /*TreeNode drinks = new TreeNode("Drinks");
        TreeNode hotDrinks = new TreeNode("Hot");
        TreeNode coldDrinks = new TreeNode("Cold");
        TreeNode tea = new TreeNode("Tea");
        TreeNode coffee = new TreeNode("Coffee");
        TreeNode wine = new TreeNode("Wine");
        TreeNode beer = new TreeNode("Beer");
        drinks.addChild(hotDrinks);
        drinks.addChild(coldDrinks);
        hotDrinks.addChild(tea);
        hotDrinks.addChild(coffee);
        coldDrinks.addChild(wine);
        coldDrinks.addChild(beer);
        System.out.println(drinks.print(0));*/

        // here time complexity of insertion is O(n)
        /*BinaryTreeLL binaryTree = new BinaryTreeLL();
        binaryTree.insert("N1");
        binaryTree.insert("N2");
        binaryTree.insert("N3");
        binaryTree.insert("N4");
        binaryTree.insert("N5");
        binaryTree.insert("N6");
        binaryTree.levelOrder();*/

        // here time complexity of insertion is O(1)
        BinaryTree binaryTree = new BinaryTree(5);
        binaryTree.insert("N1");
        binaryTree.insert("N2");
        binaryTree.insert("N3");
        binaryTree.insert("N4");
        binaryTree.insert("N5");
        binaryTree.preOrder(1);
    }
}
