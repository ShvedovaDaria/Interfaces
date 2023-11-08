package hmwrk12;

// Другий інтерфейс з абстрактним, статичним та по-замовчуванню методами.
interface Interface2 {
    void abstractMethod2();

    default void defaultMethod() {
        System.out.println("Це абстрактний метод із застосуванням ключового слова 'default'.");
    }

    static void staticMethod() {
        System.out.println("Це статичний метод інтерфейсу.");
    }
}
