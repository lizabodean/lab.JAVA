public class Main {
    public static void main(String[] args) {
        // Создание нескольких объектов класса Person
        Person person1 = new Person("John", 30);
        Person person2 = new Person("Alice", 25);
        Person person3 = new Person("Bob", 40);

        // Вывод информации о каждом человеке
        person1.displayInfo();
        person2.displayInfo();
        person3.displayInfo();
    }
}
