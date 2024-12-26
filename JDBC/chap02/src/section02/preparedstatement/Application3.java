package section02.preparedstatement;

import model.EmployeeDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import static common.JDBCTemplate.close;
import static common.JDBCTemplate.getConnection;

public class Application3 {
    public static void main(String[] args) {

        /* Scanner를 이용해서 사번을 입력받아 사원의 정보를 EmployeeDTO 객체에 담아서 출력 */
        Connection con = getConnection();

        PreparedStatement pstmt = null;
        ResultSet rset = null;

        EmployeeDTO selectedEmp = null;

        Scanner sc = new Scanner(System.in);
        System.out.print("조회하실 사번을 입력해주세요 : ");
        String empId = sc.nextLine();

        String query = "SELECT * FROM EMPLOYEE WHERE EMP_ID = ?";
        try {
            pstmt = con.prepareStatement(query);
            pstmt.setString(1, empId);

            rset = pstmt.executeQuery();

            if (rset.next()) {
                selectedEmp = new EmployeeDTO();
                selectedEmp.setEmpNO(rset.getString("EMP_ID"));
                selectedEmp.setEmpNAME(rset.getString("EMP_NAME"));
                selectedEmp.setEmpNO(rset.getString("EMP_NO"));
                selectedEmp.setEmail(rset.getString("EMAIL"));
                selectedEmp.setPhone(rset.getString("PHONE"));
                selectedEmp.setDeptCODE(rset.getString("DEPT_CODE"));
                selectedEmp.setJobCODE(rset.getString("JOB_CODE"));
                selectedEmp.setSalLEVEL(rset.getString("SAL_LEVEL"));
                selectedEmp.setSalary(rset.getInt("SALARY"));
                selectedEmp.setBonus(rset.getDouble("BONUS"));
                selectedEmp.setManagerID(rset.getString("MANAGER_ID"));
                selectedEmp.setHireDATE(rset.getDate("HIRE_DATE"));
                selectedEmp.setEntDATE(rset.getDate("ENT_DATE"));
                selectedEmp.setManagerID(rset.getString("ENT_YN"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(rset);
            close(pstmt);
            close(con);
        }
        System.out.println("selectedEmp = " + selectedEmp);
    }
}
