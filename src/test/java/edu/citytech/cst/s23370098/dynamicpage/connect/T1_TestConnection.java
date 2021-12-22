package edu.citytech.cst.s23370098.dynamicpage.connect;

import com.jbbwebsolutions.helper.EnvironmentUtility;
import com.jbbwebsolutions.helper.FileUtility;
import edu.citytech.cst.s23370098.dynamicpage.model.EmployeeSalaries;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


@DisplayName("TestConnection 1")
public class T1_TestConnection {

    static final String connection = EnvironmentUtility.get("CST_4713_DB");
    static final String sqlInserts = "insert into app.employeeSalaries (id,salary,code) values (?,?,?)";
    static final String fileName = EnvironmentUtility.get("CST_4713_DATA") + "Salaries.csv";


    @DisplayName("(1) test connection")
    @Test
    void T1() throws Exception {
        Connection conn = DriverManager.getConnection(connection);
        System.out.println(conn);
        conn.close();
    }

    @DisplayName("(2) test connection")
    @Test
    void T2() throws Exception {
        Connection conn = DriverManager.getConnection(connection);
        System.out.println(conn);
        conn.close();
    }

    @DisplayName("(3) test insert")
    @Test
    void T3() throws Exception {

        Connection conn = DriverManager.getConnection(connection);

        PreparedStatement ps = conn.prepareStatement(sqlInserts);

        ps.setString(1, "ABCD");
        ps.setFloat(2, 100_100);
        ps.setString(3, "MFJ");
        ps.executeUpdate();
        ps.close();
        conn.close();
    }


    @DisplayName("(4) ReadFile ")
    @Test
    void T4() throws Exception {

        Connection conn = DriverManager.getConnection(connection);
        PreparedStatement ps = conn.prepareStatement(sqlInserts);

        System.out.println(fileName);
        var list = FileUtility.get(fileName, 1, EmployeeSalaries::new);

        for (EmployeeSalaries es : list) {
            ps.setString(1, es.getId());
            ps.setFloat(2, es.getSalary());
            ps.setString(3, es.getStatus());
            ps.executeUpdate();
        }

        ps.close();
        conn.close();

    }

    @DisplayName("(5) query Data")
    @Test
    void T5() throws Exception {
        Connection conn = DriverManager.getConnection(connection);

        RowSetFactory factory = RowSetProvider.newFactory();
        CachedRowSet crs = factory.createCachedRowSet();
        crs.setCommand("select id,salary,code from app.employeeSalaries");
        crs.execute(conn);

        while (crs.next()) {
            System.out.print(crs.getString("id"));
            System.out.print(crs.getFloat("salary"));
            System.out.println(crs.getString("code"));
        }
        conn.close();
    }
}