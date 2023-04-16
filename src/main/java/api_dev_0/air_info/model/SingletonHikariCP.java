package api_dev_0.air_info.model;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class SingletonHikariCP {
    private static final String DRIVER = "org.mariadb.jdbc.Driver";
    private static final String DB_IP = "183.111.253.184";
    private static final String DB_PORT = "3306";
    private static final String DB_NAME = "test";
    private static final String DB_URL = "jdbc:mariadb://" + DB_IP + ":" + DB_PORT + "/" + DB_NAME;
    private static final String USER = "hbnf";
    private static final String PASSWORD = "hbnf";

    private static HikariDataSource dataSource;

    static {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl(DB_URL);
        config.setUsername(USER);
        config.setPassword(PASSWORD);

        // HikariCP 설정
        config.setMaximumPoolSize(10);
        config.setMinimumIdle(2);
        config.setIdleTimeout(30000);
        config.setConnectionTimeout(2000);
        config.setMaxLifetime(60000);

        dataSource = new HikariDataSource(config);
    }

    private SingletonHikariCP() {}

    public static HikariDataSource getInstance() {
        return dataSource;
    }
}
