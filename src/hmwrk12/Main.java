package hmwrk12;

import hmwrk12.Interface2;
import hmwrk12.MyClass;

public class Main {
    public static void main(String[] args) {
        // Створимо об'єкт класу hmwrk12.MyClass.
        MyClass myObject = new MyClass();

        // Викликаємо усі методи інтерфейсів через об'єкт класу.
        myObject.abstractMethod1();
        myObject.abstractMethod2();
        myObject.defaultMethod();
        Interface2.staticMethod();
    }
}