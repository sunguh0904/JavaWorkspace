package section02.preparedstatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import static common.JDBCTemplate.close;
import static common.JDBCTemplate.getConnection;

/* PreparedStatement는 Statement와 달리 Placeholder(?)를 사용한 쿼리를 파싱하고 캐싱하여 다시 재해석하는
과정을 생략함으로 한번 캐싱되어있는 불완전하게 작성되어 있는 쿼리 실행의 경우 Statement보다 빠르다. */
public class Application2 {
    public static void main(String[] args) {

        Connection con = getConnection();

        PreparedStatement pstmt = null;
        ResultSet rset = null;

        Scanner sc = new Scanner(System.in);
        System.out.print("사번을 입력하세요");
        String empId = sc.nextLine();

        String entYn = "N";

        /* PreparedStatement는 Statement 때와 달리 placeholder(?)를 활용한 하나의 문자열 형태로 쿼리 작성 가능 */
        String query = "SELECT EMP_ID, EMP_NAME FROM EMPLOYEE WHERE EMP_ID = ? AND ENT_YN = ?";
        // 미완성된 쿼리문 ↑
        // ?: 클래스 홀더

        try {
            pstmt = con.prepareStatement(query);
            pstmt.setString(1, empId);
            // 첫 번째 placeHolder에 empId("사번을 입력하세요")를 넣겠다는 의미

            pstmt.setString(2, entYn);

            rset = pstmt.executeQuery();

            if (rset.next()) {
                System.out.println(rset.getString("EMP_ID")
                        + ", " + rset.getString("EMP_NAME"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(rset);
            close(pstmt);
            close(con);
        }
    }
}
