package queue.and.stack.interview.questions.question5;

import java.util.LinkedList;

/**
 * @author vivek
 *
 * An animal shelter, which holds only dogs and cats, operates on a strictly "first in, first out" basis. People must adopt either
 * the "oldest" (based on arrival time) of all animals at the shelter, or they can select whether they would prefer a dog or a cat
 * (and will receive the oldest animal of that type). They cannot select which specific animal they would like. Create the data
 * structures to maintain this system and implement operations such as enqueue, dequeueAny, dequeueDog, and dequeueCat.
 */
public class AnimalQueue {

    LinkedList<Dog> dogs = new LinkedList<>();
    LinkedList<Cat> cats = new LinkedList<>();

    private int order = 0;

    public void enqueue(Animal a) {
        a.setOrder(order);
        order++;
        if (a instanceof Dog) {
            dogs.addLast((Dog) a);
        } else if (a instanceof Cat) {
            cats.addLast((Cat) a);
        }
    }

    public int size() {
        return dogs.size() + cats.size();
    }

    public Dog dequeueDogs() {
        return dogs.poll();
    }

    public Dog peekDogs() {
        return dogs.peek();
    }

    public Cat dequeueCats() {
        return cats.poll();
    }

    public Cat peekCats() {
        return cats.peek();
    }

    public Animal dequeueAny() {
        if (!dogs.isEmpty() && !cats.isEmpty()) {
            if (peekDogs().isOlderThan(peekCats())) return dequeueDogs();
            else return dequeueCats();
        }
        if (dogs.isEmpty() && !cats.isEmpty()) {
            return dequeueCats();
        } else if (!dogs.isEmpty() && cats.isEmpty()) {
            return dequeueDogs();
        }
        return null;
    }

    public Animal peek() {
        if (dogs.isEmpty()) {
            return cats.peek();
        } else if (cats.isEmpty()) {
            return dogs.peek();
        }
        if (!dogs.isEmpty() && !cats.isEmpty()) {
            if (peekDogs().isOlderThan(peekCats())) return peekDogs();
            else return peekCats();
        }
        return null;
    }

}
