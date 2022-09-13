package greedy.algorithms.fractional.knapsack.problem;

import java.util.ArrayList;

/**
 * @author vivek
 */

public class FKPMain {
    public static void main(String[] args) {
        ArrayList<KnapsackItem> items = new ArrayList<>();
        int[] value = {100,120,60};
        int[] weight = {20,30,10};
        int capacity = 50;
        for (int i=0; i<value.length-1; i++) {
            items.add(new KnapsackItem(i, value[i], weight[i]));
        }
        FractionalKnapsack.knapSack(items, capacity);
    }
}
