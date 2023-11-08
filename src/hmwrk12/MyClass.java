package hmwrk12;

import hmwrk12.Interface1;
import hmwrk12.Interface2;

// Тепер створимо клас, який імплементує ці інтерфейси.
class MyClass implements Interface1, Interface2 {
    @Override
    public void abstractMethod1() {
        System.out.println("Реалізація абстрактного методу з hmwrk12.Interface1.");
    }

    @Override
    public void abstractMethod2() {
        System.out.println("Реалізація абстрактного методу з hmwrk12.Interface2.");
    }
}

