package example.designpattern.creational.singleton.destroysingleton;

/**
 * <b>Java code to demonstrate cloning destroys singleton</b> :
 *
 * @author Vinod Akkepalli
 */

class SuperClass implements Cloneable
{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("Inside clone()");
        return super.clone();
    }
}

class Singleton extends SuperClass
{
    public static Singleton instance = null;

    private Singleton() {
    }

    public static Singleton getInstance(){
        System.out.println("Inside getInstance()");
        if(instance == null){
            synchronized(Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

//    Override clone() as below to overcome singleton cloning issue
    /*@Override
    protected Object clone() throws CloneNotSupportedException {
        return instance;
//        throw new CloneNotSupportedException();
    }*/
}

public class CloningDestroysSingleton
{
    public static void main(String[] args) throws CloneNotSupportedException {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = (Singleton) instance1.clone();
        System.out.println("instance1 :- " + instance1);
        System.out.println("instance2 :- " + instance2);
    }
}