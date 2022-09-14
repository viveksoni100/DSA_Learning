package divide.n.conquer.algorithms.zero.knapsack.problem;

public class ZOKPMain {
    public static void main(String[] args) {
        ZeroOneKnapsack knapsack = new ZeroOneKnapsack();
        int[] profits = {31, 26, 17, 72};
        int[] weights = {3, 1, 2, 5};
        int maxProfit = knapsack.knapSack(profits, weights, 7);
        System.out.println(maxProfit);
    }
}
