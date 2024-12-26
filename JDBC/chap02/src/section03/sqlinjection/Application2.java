package section03.sqlinjection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static common.JDBCTemplate.close;
import static common.JDBCTemplate.getConnection;

public class Application2 {

    private static String empId = "210";
    private static String empName = "' OR 1 = 1 AND EMP_ID = '200";
    // sql 문을 이런 방식으로 작상하는 것을 SQL 인젝션이라고 한다.
    // 보안이 좀 취약하다. 아이디는 필요없고 이름만으로 로그인이 가능함
    public static void main(String[] args) {

        Connection con = getConnection();
        Statement stmt = null;
        ResultSet rset = null;

        String query = "SELECT * FROM EMPLOYEE WHERE EMP_ID = '" + empId +
                "' AND EMP_NAME = '" + empName + "'";
        // WHERE EMP_ID = '210' AND EMP_NAME = '' OR 1 = 1 AND EMP_ID = '200'
        System.out.println(query);

        try {
            stmt = con.createStatement();
            rset = stmt.executeQuery(query);

            if (rset.next()) {
                System.out.println(rset.getString("EMP_NAME") + " 님 환영합니다");
            } else {
                System.out.println("회원 정보가 없습니다.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (con != null) {
                close(rset);
                close(stmt);
                close(con);
            }
        }
    }
}
