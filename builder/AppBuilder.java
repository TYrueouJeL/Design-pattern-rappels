package builder;

public class AppBuilder {
    public static void main(String[] args) {
        DbConfig dbConfig = new DbConfig.Builder()
                                        .withHost("localhost")
                                        .withPort(3306)
                                        .withUsername("root")
                                        .withPassword("password")
                                        .build();

        System.out.println(dbConfig.getHost());
    }
}
