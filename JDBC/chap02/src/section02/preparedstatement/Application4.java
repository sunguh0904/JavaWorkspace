package section02.preparedstatement;

import com.ohgiraffers.model.dto.EmployeeDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static common.JDBCTemplate.close;
import static common.JDBCTemplate.getConnection;

public class Application4 {
    public static void main(String[] args) {

        /* 조회할 사원의 성씨를 입력 받아 해당 성씨를 가진 사원 정보들을 모두 출력 */

        Connection con = getConnection();

        PreparedStatement pstmt = null;
        // 불안전한 쿼리
        ResultSet rset = null;

        EmployeeDTO row = null;
        List<EmployeeDTO> empList = null;

        Scanner sc = new Scanner(System.in);
        System.out.print("조회할 이름의 성을 입력하세요 : ");
        String empName = sc.nextLine();

        String query = "SELECT * FROM EMPLOYEE WHERE EMP_NAME LIKE CONCAT(?, '%')";
        // ? 자리에 입력한 값을 받고 그 뒤에 % 사용

        try {
            pstmt = con.prepareStatement(query);
            pstmt.setString(1, empName);
            System.out.println("query = " + query);

            rset = pstmt.executeQuery();
            // executeQuery: 쿼리문으로 보내는 역할

            empList = new ArrayList<>();
            // 조회된 여러 행을 담아놓을 ArrayList 객체 생성

            while (rset.next()) {
                // 반복을 실행하며 반복이 실행될때마다 새로운 EmployeeDTO 객체를
                // 생성해서새로운 값을 받을 준비를 하는 코드

                row = new EmployeeDTO();
                row.setEmpNO(rset.getString("EMP_ID"));
                row.setEmpNAME(rset.getString("EMP_NAME"));
                row.setEmpNO(rset.getString("EMP_NO"));
                row.setEmail(rset.getString("EMAIL"));
                row.setPhone(rset.getString("PHONE"));
                row.setDeptCODE(rset.getString("DEPT_CODE"));
                row.setJobCODE(rset.getString("JOB_CODE"));
                row.setSalLEVEL(rset.getString("SAL_LEVEL"));
                row.setSalary(rset.getInt("SALARY"));
                row.setBonus(rset.getDouble("BONUS"));
                row.setManagerID(rset.getString("MANAGER_ID"));
                row.setHireDATE(rset.getDate("HIRE_DATE"));
                row.setEntDATE(rset.getDate("ENT_DATE"));
                row.setManagerID(rset.getString("ENT_YN"));

                empList.add(row);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(rset);
            close(pstmt);
            close(con);
        }
        for (EmployeeDTO emp : empList) {
            System.out.println(emp);
        }
    }
}
