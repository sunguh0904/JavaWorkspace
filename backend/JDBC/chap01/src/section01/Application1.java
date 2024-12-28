package section01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Application1 {
    public static void main(String[] args) {
        // 비어있는 통로(커넥션)를 생성
        Connection con = null;

        try {
            /* 사용할 Driver 등록 */
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 풀네임 적는 곳, forName 예외처리 해줘야됨

            con = DriverManager.getConnection("jdbc:mysql://localhost/employee",
                    "uhyeon", "uhyeon");
            // url, user, pwd, getConnection 예외처리 ( add catch 선택 )
            // con 대입은 마지막에

            System.out.println("con = " + con);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            // 커넥션 연결 후 로직을 수행하고 나면 닫아줘야한다.
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
