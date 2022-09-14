package divide.n.conquer.algorithms.house.robber.problem;

public class HouseRobber {

  private int maxMoneyRecursive(int[] HouseNetWorth, int currentIndex) {
    if (currentIndex >= HouseNetWorth.length) { //base condition
      return 0;
    }

    int stealCurrentHouse = HouseNetWorth[currentIndex] + maxMoneyRecursive(HouseNetWorth, currentIndex+2);
    int skipCurrentHouse = maxMoneyRecursive(HouseNetWorth, currentIndex+1);

    return Math.max(stealCurrentHouse,skipCurrentHouse );
  }

  public int maxMoney(int[] HouseNetWorth) {
    return maxMoneyRecursive(HouseNetWorth, 0);
  }
}
