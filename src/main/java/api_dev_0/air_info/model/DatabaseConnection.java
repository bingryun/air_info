package api_dev_0.air_info.model;

import com.zaxxer.hikari.HikariDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final Logger logger = LoggerFactory.getLogger(DatabaseConnection.class);
    private static final HikariDataSource dataSource = SingletonHikariCP.getInstance();

    private Connection connection;

    public DatabaseConnection() {}

    public Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }

    public void executeInsertQuery(String sqlInsertQuery) {
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sqlInsertQuery)) {

            logger.info("Executing SQL insert query: {}", sqlInsertQuery);
            pstmt.executeUpdate();
        } catch (SQLException e) {
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
