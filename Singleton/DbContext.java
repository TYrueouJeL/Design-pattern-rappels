package Singleton;
public class DbContext {
    private static DbContext instance;

    private DbContext() { }

    public static DbContext getInstance() {
        if (instance == null) {
            instance = new DbContext();
        }

        return instance;
    }

    public void connect() {
        System.out.println("Connection ... OK !");
    }
}
