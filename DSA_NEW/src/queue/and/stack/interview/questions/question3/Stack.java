package queue.and.stack.interview.questions.question3;

import java.util.EmptyStackException;

/**
 * @author vivek
 *
 * Stack of Plates
 * Imagine a (literal) stack of plates. If the stack gets too high, it might topple. Therefore, in real life, we would likely start a
 * new stack when the previous stack exceeds some threshold. Implement a data structure SetOfStacks that mimics this.
 * SetOfStacks should be composed of several stacks and should create a new stack once the previous one exceeds capacity,
 * SetOfStacks.push0 and SetOfStacks.pop( should behave identically to a single stack (that is, pop() should return the same
 * values as it would if there were just a single stack).
 * Follow Up:
 * Implement a function popAt (int index) which performs a pop operation on a specific sub - stack.
 */

public class Stack {

    private int capacity;
    public StackNode top;
    public StackNode bottom;
    public int size = 0;

    public Stack(int capacity) {
        this.capacity = capacity;
    }

    public boolean isFull() {
        return capacity == size;
    }

    public void join(StackNode above, StackNode below) {
        if (below != null) below.above = above;
        if (above != null) above.below = below;
    }

    public boolean push(int value) {
        if (size >= capacity) return false;
        size++;
        StackNode node = new StackNode(value);
        if (size == 1) bottom = node;
        join(node, top);
        top = node;
        return true;
    }

    public int pop() {
        if (top == null) throw new EmptyStackException();
        int result = top.value;
        top = top.below;
        size--;
        return result;
    }

    public int removeBottom() {
        StackNode b = bottom;
        bottom = bottom.above;
        if(bottom != null) bottom.below = null;
        size--;
        return b.value;
    }
}
