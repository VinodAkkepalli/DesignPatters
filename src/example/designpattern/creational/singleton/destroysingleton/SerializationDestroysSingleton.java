package example.designpattern.creational.singleton.destroysingleton;
import java.io.*;

/**
 * <b>Description</b> : Java code to demonstrate serialization destroys singleton class
 *
 * @author Vinod Akkepalli
 */


class Singleton2 implements Serializable
{
    public static Singleton2 instance = new Singleton2();

    private Singleton2() { }

//    implement readResolve() as below to serialization destroy singleton
    /*@Serial
    protected Object readResolve()
    {
        return instance;
    }*/
}


public class SerializationDestroysSingleton
{

    public static void main(String[] args)
    {
        try {
            Singleton2 instance1 = Singleton2.instance;
            ObjectOutput out = new ObjectOutputStream(new FileOutputStream("file.text"));
            out.writeObject(instance1);
            out.close();

            ObjectInput in = new ObjectInputStream(new FileInputStream("file.text"));

            Singleton2 instance2 = (Singleton2) in.readObject();
            in.close();

            System.out.println("instance1 :- " + instance1);
            System.out.println("instance2 :- " + instance2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
