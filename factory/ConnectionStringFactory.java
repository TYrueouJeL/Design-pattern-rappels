package factory;

public class ConnectionStringFactory {
    public String CreateCS(String host, int port, String sgbd) {
        return "jdbc: " + sgbd + "://" + host + ":" + port;
    }
}
