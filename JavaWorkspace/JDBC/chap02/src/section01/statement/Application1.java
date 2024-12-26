package section01.statement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static common.JDBCTemplate.close;
import static common.JDBCTemplate.getConnection;

public class Application1 {
    public static void main(String[] args) {

        Connection con = getConnection();

        Statement stmt = null;
        // 쿼리를 실행하고 결과를 반환하는 객체( 쿼리문을 저장하고 실행하는 기능을 하는 인터페이스

        ResultSet rset = null;
        // 조회 결과를 반환되는 객체( select 결과집합을 받아올 용도의 인터페이스

        try {
            stmt = con.createStatement();
            // connection을 이용하여 statement 인스턴스 생성
            rset = stmt.executeQuery("SELECT EMP_ID, EMP_NAME FROM EMPLOYEE");
            // 작성한 쿼리문을 rset에 담는다. exeCuteQuery: 쿼리문을 적는다.

            while (rset.next()) {
                // next(): ResultSet의 커서 위치를 내리면서 행이 존재하면 true, 아니면 false를 반환
                System.out.println(rset.getString("EMP_ID") + ", " + rset.getString("EMP_NAME"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 맨 마지막에 열렸던 순서로 닫아줘야한다.
            close(rset);
            close(stmt);
            close(con);
        }
    }
}
