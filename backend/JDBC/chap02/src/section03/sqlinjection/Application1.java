package section03.sqlinjection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static common.JDBCTemplate.close;
import static common.JDBCTemplate.getConnection;

public class Application1 {

    private static String empId = "200";
    private static String empName = "선동일";

    public static void main(String[] args) {

        Connection con = getConnection();
        Statement stmt = null;
        ResultSet rset = null;

        String query = "SELECT * FROM EMPLOYEE WHERE EMP_ID = '" + empId +
                "' AND EMP_NAME = '" + empName + "'";
        // Statement 때문에 바로 쿼리문 작성 ???
        // 싱글 쿼테이션 붙이는 이유?
        System.out.println(query);

        try {
            stmt = con.createStatement();
            rset = stmt.executeQuery(query);
            // 작성한 쿼리를 내보낸다.

            if (rset.next()) {
                System.out.println(rset.getString("EMP_NAME") + " 님 환영 합니다.");
            } else {
                System.out.println("회원 정보가 없습니다.");
                // ID가 200 이면서 AND 이름이 홍길동인 사람은 없다
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
