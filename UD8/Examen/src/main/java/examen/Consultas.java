package examen;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Consultas {


    public static void getProductLines(){

        Connection con = ConexionBD.getConnection();
        try {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM productlines p");
            ResultSet rs = ps.executeQuery();



            while (rs.next()){
                System.out.print(rs.getString(1) +" | ") ;
                System.out.print(rs.getString(2)+" | ");
                System.out.print(rs.getString(3)+" | ");
                System.out.println(rs.getString(4)+" | ");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static void categoriaMasVendida(){
        Connection con = ConexionBD.getConnection();
        try {
            PreparedStatement ps = con.prepareStatement("SELECT SUM(o.quantityOrdered) AS TOTAL, p2.productLine AS NOMBRE FROM orderdetails o INNER JOIN products p ON o.productCode = p.productCode INNER JOIN productlines p2 ON p.productLine = p2.productLine GROUP BY p2.productLine ORDER BY TOTAL DESC LIMIT 1");

            ResultSet rs = ps.executeQuery();

            while (rs.next()){
                System.out.print(rs.getInt(1) +" | ") ;
                System.out.print(rs.getString(2) +" | ") ;
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
