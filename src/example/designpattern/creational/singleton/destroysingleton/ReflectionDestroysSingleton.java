package example.designpattern.creational.singleton.destroysingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * <b>Java code to demonstrate Reflection destroying singleton</b> :
 *
 * @author Vinod Akkepalli
 */

class Singleton1 {
    public static Singleton1 instance = new Singleton1();

    private Singleton1() {
    }
}

//    Define singleton as an enum to overcome reflection destroy singleton
/*enum Singleton1
{
    instance;
}*/

public class ReflectionDestroysSingleton {

    public static void main(String[] args) {
        Singleton1 instance1 = Singleton1.instance;
        Singleton1 instance2 = null;
        Constructor[] constructors = Singleton1.class.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName());
            // Below code will destroy the singleton pattern
            constructor.setAccessible(true);
            try {
                instance2 = (Singleton1) constructor.newInstance();
            } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }
            break;
        }

        System.out.println("instance1:- " + instance1);
        System.out.println("instance2:- " + instance2);
    }
}
