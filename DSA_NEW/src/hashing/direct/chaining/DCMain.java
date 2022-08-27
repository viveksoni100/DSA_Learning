package hashing.direct.chaining;

public class DCMain {

    public static void main(String[] args) {

        DirectChaining directChaining = new DirectChaining(10);
        directChaining.insertHashTable("Apple");
        directChaining.insertHashTable("Banana");
        directChaining.insertHashTable("Cake");
        directChaining.displayHashTable();
    }
}
