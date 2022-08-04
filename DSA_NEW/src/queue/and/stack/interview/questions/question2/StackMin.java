package queue.and.stack.interview.questions.question2;

/**
 * @author vivek
 *
 * design a stack which, in addition to push and pop, has a function min which returns the minimum element, push,
 * pop and min should all operate in O(1).
 */
public class StackMin {
  Node top;
  Node min;

  public StackMin() {
    top = null;
    min = null;
  }

  public int min() {
    return min.value;
  }

  public void push(int value) {
    if (min == null) {
      min = new Node(value, min);
    } else if (min.value < value) {
      min = new Node(min.value, min);
    } else {
      min = new Node(value, min);
    }
    top = new Node(value, top);
  }

  public int pop() {
    min = min.next;
    int result = top.value;
    top = top.next;
    return result;
  }
}
