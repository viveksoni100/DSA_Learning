package queue.and.stack.interview.questions.question5;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public String name() {
        return "Cat: " + name;
    }
}
