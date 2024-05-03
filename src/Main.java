public class Main {
    public static void main(String[] args) {
        MyHashTable<Integer, String> table = new MyHashTable<>();
        table.put(1, "One");
        table.put(2, "Two");
        table.put(3, "Three");

        System.out.println("Value for key 2: " + table.get(2));

        table.remove(3);

        System.out.println("Contains 'One': " + table.contains("One"));
        System.out.println("Key for value 'Two': " + table.getKey("Two"));
    }
}
