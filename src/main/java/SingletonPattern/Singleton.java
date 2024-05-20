package SingletonPattern;

import java.util.HashMap;

public class Singleton {

    private final HashMap<Integer, String> employees;
    private static Singleton INSTANCE = null;

    private Singleton() {
        employees = new HashMap<>();
        employees.put(1, "Shivam");
        employees.put(2, "Akshay");
        employees.put(3, "Tarun");
        employees.put(4, "Rigal");
        employees.put(5, "Arpit");
    }

    public static Singleton getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton.class) {
                if (INSTANCE == null) {                 // double-checked locking pattern
                    INSTANCE = new Singleton();
                }
            }
        }
        return INSTANCE;
    }

    public HashMap<Integer, String> getEmployees() {
        return employees;
    }

}


/*

public synchronized static Singleton getInstance() {
    if (INSTANCE == null) {
        INSTANCE = new Singleton();
    }
    return INSTANCE;
}

We can not do something like this Because
Thread Safety: getInstance method is synchronized, this approach can cause a performance bottleneck.
Every time getInstance is called, it will be synchronized even after the INSTANCE has been initialized.

**************************************************************************************

Optimization 2 :

    public static Singleton getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton.class) {
                INSTANCE = new Singleton();
            }
        }
        return INSTANCE;
    }

We can not do something like this Because
What if two threads entered inside the INSTANCE==NULL block and one initialize instance
in that way we need to use double check So that second thread will not initialize it again

*/