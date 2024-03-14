public class Person {
    private String name;
    private int age;

    // Конструктор класса Person
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Метод для получения имени
    public String getName() {
        return name;
    }

    // Метод для установки имени
    public void setName(String name) {
        this.name = name;
    }

    // Метод для получения возраста
    public int getAge() {
        return age;
    }

    // Метод для установки возраста
    public void setAge(int age) {
        this.age = age;
    }

    // Метод для вывода информации о человеке
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

