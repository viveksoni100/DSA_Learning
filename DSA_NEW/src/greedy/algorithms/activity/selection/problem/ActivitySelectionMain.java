package greedy.algorithms.activity.selection.problem;

import java.util.ArrayList;

/**
 * @author vivek
 *
 * Given N number of activities with their start and end times. We need to select the maximum number of activities that
 * can be performed by a single person, assuming that a person can only work on a single activity at a time.
 */

public class ActivitySelectionMain {
    public static void main(String[] args) {
        ArrayList<Activity> activityList = new ArrayList<>();
        activityList.add(new Activity("A1", 0, 6));
        activityList.add(new Activity("A2", 3, 4));
        activityList.add(new Activity("A3", 1, 2));
        activityList.add(new Activity("A4", 5, 8));
        activityList.add(new Activity("A5", 5, 7));
        activityList.add(new Activity("A6", 8, 9));
        ActivitySelection.activitySelection(activityList);
    }
}
