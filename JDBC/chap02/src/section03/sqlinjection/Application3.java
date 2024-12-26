package section03.sqlinjection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static common.JDBCTemplate.close;
import static common.JDBCTemplate.getConnection;

/* Statement와 달리 placeholder(?)를 통해 sql injection 공격을 막을 수 있게 작성되어 있어
보안적 측면에서도 우수하다. */
public class Application3 {

    private static String empId = "210";
    private static String empName = "' OR 1 = 1 AND EMP_ID = '200";
    public static void main(String[] args) {

        Connection con = getConnection();
        PreparedStatement pstmt = null;
        ResultSet rset = null;

        String query = "SELECT * FROM EMPLOYEE WHERE EMP_ID = ? AND EMP_NAME = ?";
        /* 아래 sql과 같이 PreparedStatement는 placeholder로 입력되는 값에 single quotation(')이 있다면
        single quotation을 하나 더 붙여주고, setString으로 값이 들어갈 때
        양 옆에도 single quotation을 붙여준다. */
        // SELECT * FROM EMPLOYEE WHERE EMP_ID = 210 AND EMP_NAME = ' OR 1 = 1 AND EMP_ID = '200
        // 값 양쪽에 저절로 싱글쿼터를 추가 '210', ''' OR 1 = 1 AND EMP_ID = ''200'
        System.out.println(query);

        try {
            pstmt = con.prepareStatement(query);
            // prepareStatement: 생성하면서 쿼리문을 바로 담는다.
            pstmt.setString(1, empId);
            pstmt.setString(2, empName);

            rset = pstmt.executeQuery();

            if (rset.next()) {
                System.out.println(rset.getString("EMP_NAME") + " 님 환영 합니다.");
            } else {
                System.out.println("회원 정보가 없습니다.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (con != null) {
                close(pstmt);
                close(rset);
                close(con);
            }
        }
    }
}
