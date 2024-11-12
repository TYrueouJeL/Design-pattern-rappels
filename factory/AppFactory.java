package factory;

public class AppFactory {
    public static void main(String[] args) {
        ConnectionStringFactory csf = new ConnectionStringFactory();
        DbContext db = new DbContext();
        
        db.setHost("localhost");
        db.setPort(3306);
        
        String cs = csf.CreateCS(db.getHost(), db.getPort(), "mysql");
        
        System.out.println(cs);
    }
}
