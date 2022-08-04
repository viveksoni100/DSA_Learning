package queue.and.stack.interview.questions.question4;

import java.util.Stack;

/**
 * @author vivek
 *
 * implement queue using two stacks
 */

public class QueueViaStack {

    Stack<Integer> stackNewest;
    Stack<Integer> stackOldest;

    public QueueViaStack() {
        stackNewest = new Stack<>();
        stackOldest = new Stack<>();
    }

    public int size() {
        return stackNewest.size() + stackOldest.size();
    }

    public void enqueue(int value) {
        stackNewest.push(value);
    }

    private void shiftStacks() {
        if (stackOldest.isEmpty()) {
            while (!stackNewest.isEmpty()) {
                int poppedOut = stackNewest.pop();
                stackOldest.push(poppedOut);
            }
        }
    }

    public int dequeue() {
        shiftStacks();
        return stackOldest.pop();
    }

    public int peek() {
        shiftStacks();
        return stackOldest.peek();
    }
}
