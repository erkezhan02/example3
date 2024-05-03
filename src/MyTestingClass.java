import java.util.Random;
class MyTestingClass {
    private final int data;
    public MyTestingClass(int data) {
        this.data = data;
    }
    // Переопределение метода hashCode() для создания пользовательской хэш-функции
    @Override
    public int hashCode() {
        // Пример простой пользовательской хэш-функции
        // Замените этот код на более сложную хэш-функцию, чтобы обеспечить равномерное распределение
        return data % 100; // Простая хэш-функция, распределяющая элементы по 100 бакетам
    }
}

