public class Main {
    public static void main(String[] args) {
        // Створимо об'єкт класу MyClass.
        MyClass myObject = new MyClass();

        // Викликаємо усі методи інтерфейсів через об'єкт класу.
        myObject.abstractMethod1();
        myObject.abstractMethod2();
        myObject.defaultMethod();
        Interface2.staticMethod();
    }
}