package assignment1.db;

import java.sql.Connection;
import java.sql.SQLException;

interface DBConnection {
    Connection getConnection() throws SQLException;
}
