import java.util.Random;

public class TestHashTable {
    public static void main(String[] args) {
        MyHashTable<MyTestingClass, String> table = new MyHashTable<>();

        // Добавление случайных 10 000 элементов в таблицу
        Random random = new Random();
        for (int i = 0; i < 10000; i++) {
            int randomNumber = random.nextInt(1000); // Случайное число от 0 до 999
            MyTestingClass key = new MyTestingClass(randomNumber);
            table.put(key, "Value" + i);
        }

        // Вывод количества элементов в каждом бакете (chain или linkedlist)
        for (int i = 0; i < table.size(); i++) {
            int bucketSize = table.getBucketSize(i);
            System.out.println("Bucket " + i + ": " + bucketSize + " elements");
        }
    }
}
