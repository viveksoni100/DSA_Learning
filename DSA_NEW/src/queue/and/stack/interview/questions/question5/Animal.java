package queue.and.stack.interview.questions.question5;

public abstract class Animal {

    private int order;
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract String name();

    public void setOrder(int ord) {
        order = ord;
    }

    public int getOrder() {
        return order;
    }

    public boolean isOlderThan(Animal a) {
        return this.order < a.getOrder();
    }
}
