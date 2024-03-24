package org.LLManagement.Models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseSetting {
    public static final String SQL_DRIVER = "org.mariadb.jdbc.Driver";
    public static final String SQL_URL = "jdbc:mariadb://localhost:3306/llmanagement";
    public static final String SQL_USER = "root";
    public static final String SQL_PW = "";

    public void close(ResultSet rs, Statement st, Connection con) {
        try {
            rs.close();
        } catch (Exception e) {
        }

        try {
            st.close();
        } catch (Exception e) {
        }

        try {
            con.close();
        } catch (Exception e) {
        }
    }
}
