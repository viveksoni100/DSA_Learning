package divide.n.conquer.algorithms.house.robber.problem;

public class HRMain {
    public static void main(String[] args) {
        HouseRobber hr = new HouseRobber();
        int[] houseNetWorth = {6,7,1,30,8,2,4};
        System.out.println(hr.maxMoney(houseNetWorth));
    }
}
