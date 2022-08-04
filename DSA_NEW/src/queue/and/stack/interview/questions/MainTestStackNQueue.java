package queue.and.stack.interview.questions;

import queue.and.stack.interview.questions.question5.AnimalQueue;
import queue.and.stack.interview.questions.question5.Cat;
import queue.and.stack.interview.questions.question5.Dog;

public class MainTestStackNQueue {

    public static void main(String[] args) {

        //question-1
        /*ThreeInOne newStacks = new ThreeInOne(3);
        newStacks.push(0, 1);
        newStacks.push(0, 2);
        newStacks.push(0, 3);
        newStacks.push(1, 4);
        newStacks.push(1, 5);
        newStacks.push(1, 6);
        newStacks.push(2, 7);
        newStacks.push(2, 8);
        newStacks.push(2, 9);
        System.out.println(newStacks.peek(0));*/

        //question-2
        /*StackMin newStack = new StackMin();
        newStack.push(3);
        newStack.push(5);
        newStack.push(1);
        System.out.println(newStack.min());*/

        //question-3
        /*Stack stack = new Stack(3);
        stack.push(1);
        stack.push(2);
        stack.push(5);
        System.out.println(stack.pop());*/

        /*SetOfStacks stacks = new SetOfStacks(3);
        stacks.push(1);
        stacks.push(2);
        stacks.push(3);
        stacks.push(4);
        stacks.push(10);
        System.out.println(stacks.popAt(1));*/

        //question-4
        /*QueueViaStack queueViaStack = new QueueViaStack();
        queueViaStack.enqueue(1);
        queueViaStack.enqueue(3);
        queueViaStack.enqueue(5);
        System.out.println(queueViaStack.dequeue());*/

        AnimalQueue animalQueue = new AnimalQueue();
        animalQueue.enqueue(new Dog("Bravo"));
        animalQueue.enqueue(new Dog("Charlie"));
        animalQueue.enqueue(new Cat("Martha"));
        animalQueue.enqueue(new Dog("John"));
        animalQueue.enqueue(new Cat("Julia"));
        animalQueue.enqueue(new Cat("Jessica"));

        System.out.println(animalQueue.dequeueCats().name());
    }
}
