package org.LLManagement.Models;

import java.sql.*;

public class LLLogin extends DatabaseSetting {
    public boolean login(int user_id, int user_pw) {
        Connection con = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        int result = -1;
        try {
            Class.forName(SQL_DRIVER);
            con = DriverManager.getConnection(SQL_URL, SQL_USER, SQL_PW);

            String sql = "SELECT PW FROM accounts WHERE ID=?";
            st = con.prepareStatement(sql);
            st.setInt(1, user_id);
            rs = st.executeQuery();
            rs.next();
            result = rs.getInt("PW");

            close(rs, st, con);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(rs, st, con);
        }

        if (result == user_pw) {
            return true;
        } else {
            return false;
        }
    }
}
