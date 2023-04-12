package api_dev_0.air_info.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;


public class DatabaseConnection {
    private static final Logger logger = LoggerFactory.getLogger(DatabaseConnection.class);
    private static HikariDataSource dataSource;
    private static final String DRIVER = "org.mariadb.jdbc.Driver";
    private static final String DB_IP = "183.111.253.184";
    private static final String DB_PORT = "3306";
    private static final String DB_NAME = "test";
    private static final String DB_URL = "jdbc:mariadb://" + DB_IP + ":" + DB_PORT + "/" + DB_NAME;
    private static final String USER = "hbnf";
    private static final String PASSWORD = "hbnf";

    private Connection connection;

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

    public DatabaseConnection() {
        // Utility 클래스이므로 인스턴스 생성 방지
    }

    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }

    //    try-with-resources 사용하여 db pool 할당 및 해제 - try 안에 객체를 선언하여 끝나면 자동으로 해제
    public void executeInsertQuery(String sqlInsertQuery) {
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sqlInsertQuery)) {

            logger.info("Executing SQL insert query: {}", sqlInsertQuery);
            pstmt.executeUpdate();
        } catch (SQLException e) {

            System.out.println("ERR");
            if (e.getErrorCode() == 1062) {
                logger.warn("Duplicate entry detected. Skipping insert.");
            } else {
                logger.error("Error executing SQL insert query", e);
            }
        }
    }


    public void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("DB 접속 종료");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
