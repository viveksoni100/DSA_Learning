package queue.and.stack.interview.questions.question5;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public String name() {
        return "Dog: " + name;
    }
}
