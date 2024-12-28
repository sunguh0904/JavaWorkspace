package section02;

import java.sql.Connection;

import static section02.JDBCTemplate.close;
import static section02.JDBCTemplate.getConnection;

public class Application {
    public static void main(String[] args) {

        Connection con = getConnection();
        System.out.println("con = " + con);
        // 통로 만들고 연결

        close(con);
    }
}
