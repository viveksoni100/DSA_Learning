package avl;

/**
 * @author vivek
 *
 * time and space complexity is O(logN)
 */
public class AVLMain {

    public static void main(String[] args) {
        AVL newAvl = new AVL();
        newAvl.insert(5);
        newAvl.insert(10);
        newAvl.insert(15);
        newAvl.insert(20);
        newAvl.levelOrder();
    }

}
