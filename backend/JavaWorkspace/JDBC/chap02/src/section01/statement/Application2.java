package section01.statement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import static common.JDBCTemplate.close;
import static common.JDBCTemplate.getConnection;

public class Application2 {
    public static void main(String[] args) {

        /* 만드는 순서 중요 */
        Connection con = getConnection();
        // 1. Connection 생성

        Statement stmt = null;
        // 2. Statement 선언

        ResultSet rset = null;
        // 3. ResultSet 선언

        try {
            stmt = con.createStatement();
            // 4. Connection이 createStatement를 이용한 Statement 인스턴스 생성

            Scanner sc = new Scanner(System.in);
            System.out.print("사번을 입력하세요 : ");
            String empId = sc.nextLine();

            String query = "SELECT EMP_ID, EMP_NAME FROM EMPLOYEE WHERE EMP_ID = '" + empId + "'";

            System.out.println(query);

            rset = stmt.executeQuery(query);
            // 5. executeQuery로 쿼리문 실행하고 결과를 ResultSet으로 반환 받음

            if(rset.next()) {
                // 6. ResultSet에 담긴 결과물을 컬럼 이름을 이용해 꺼내어 출력
                System.out.println(rset.getString("EMP_ID") + ", "
                        + rset.getString("EMP_NAME"));
            } else {
                System.out.println("해당 사원의 조회 결과가 없습니다.");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            close(rset);
            close(stmt);
            close(con);
            // 7. 사용한 자원 반납
        }
    }
}
