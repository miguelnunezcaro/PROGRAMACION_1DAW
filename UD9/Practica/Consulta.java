package practicaEntregable;

import practica.ConexionBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Consulta {

    public static void empleadosOficinaMayor(){
        Connection con = ConexionBD.getConnection();

        try {
            PreparedStatement preparedStatement = con.prepareStatement("SELECT COUNT(e.employeeNumber) as TOTAL, o.officeCode FROM employees e  INNER JOIN offices o ON e.officeCode = o.officeCode GROUP BY o.officeCode ORDER BY TOTAL DESC LIMIT 1");

            ResultSet rs = preparedStatement.executeQuery();

            rs.next();

            Integer officeCode = rs.getInt(2);

            preparedStatement = con.prepareStatement("SELECT * FROM employees e WHERE officeCode = ?");

            preparedStatement.setInt(1,officeCode);

            rs = preparedStatement.executeQuery();

            while (rs.next()){
                System.out.print(rs.getInt(1) +" ") ;
                System.out.print(rs.getString(2)+" ");
                System.out.print(rs.getString(3)+" ");
                System.out.print(rs.getString(4)+" ");
                System.out.print(rs.getString(5)+" ");
                System.out.print(rs.getString(6)+" ");
                System.out.print(rs.getInt(7)+" ");
                System.out.println(rs.getString(8)+" ");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void productosNoVendidos(){
        Connection con = ConexionBD.getConnection();

        try {
           PreparedStatement preparedStatement = con.prepareStatement("SELECT p.* FROM products p WHERE productCode NOT IN (SELECT productCode FROM orderdetails o)");

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()){
                System.out.print(rs.getString(1) +" ") ;
                System.out.print(rs.getString(2)+" ");
                System.out.print(rs.getString(3)+" ");
                System.out.print(rs.getString(4)+" ");
                System.out.print(rs.getString(5)+" ");
                System.out.print(rs.getString(6)+" ");
                System.out.print(rs.getInt(7)+" ");
                System.out.print(rs.getInt(8)+" ");
                System.out.println(rs.getInt(9)+" ");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void informeCategoria(){
        Connection con = ConexionBD.getConnection();
        Scanner sc = new Scanner(System.in);
        String categoria;

        System.out.println("Introduce la categoría deseada:");
        categoria = sc.nextLine();

        try {
            PreparedStatement preparedStatement = con.prepareStatement("SELECT DISTINCT  p2.productName, o.quantityOrdered FROM productlines p INNER JOIN products p2 ON p.productLine = p2.productLine INNER JOIN orderdetails o ON p2.productCode = o.productCode WHERE p.productLine = ?");

            preparedStatement.setString(1,categoria);

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()){
                System.out.print(rs.getString(1) +" ") ;
                System.out.println(rs.getInt(2)+" ");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
