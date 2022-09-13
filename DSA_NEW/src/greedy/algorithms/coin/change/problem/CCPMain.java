package greedy.algorithms.coin.change.problem;

import java.util.Arrays;

/**
 * @author vivek
 *
 * you are given coins of different denominations and total amount of money, find the minimum number of coins that you
 * need to make up the given amount.
 */
public class CCPMain {
    public static void main(String[] args) {
        int[] coins = {1, 2, 5, 10, 20, 50, 1000};
        int amount = 2035;
        System.out.println("coins available: " + Arrays.toString(coins));
        System.out.println("target amount: " + amount);
        CoinChangeProblem.coinChangeProblem(coins, amount);
    }
}
