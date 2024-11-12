package Singleton;

public class AppSingleton {
    public static void main(String[] args) {
        DbContext db1 = DbContext.getInstance();
        DbContext db2 = DbContext.getInstance();

        if (db1 == db2) {
            System.out.println("C PAREIL !!");
        }

        db1.connect();
    }
}