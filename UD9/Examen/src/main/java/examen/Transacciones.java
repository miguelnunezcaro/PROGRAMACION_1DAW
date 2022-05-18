package examen;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Transacciones {


    public static void insertarPedido(){

        Connection con = ConexionBD.getConnection();

        try {
            con.setAutoCommit(false);
           PreparedStatement preparedStatement = con.prepareStatement("INSERT INTO orderdetails VALUES(?,?,?,?,?)");

            preparedStatement.setInt(1,300081024);
            preparedStatement.setString(2,"S72_3212");
            preparedStatement.setInt(3,2);
            preparedStatement.setDouble(4,1000.36);
            preparedStatement.setInt(5,7);

            preparedStatement.executeUpdate();

            con.commit();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            if (con!=null){
                try{
                    con.rollback();
                }catch (SQLException ex){
                    throw new RuntimeException(ex);
                }
            }
        }
    }
    public static void insertarOrder(){
        Connection con = ConexionBD.getConnection();

        try {
            con.setAutoCommit(false);
            PreparedStatement preparedStatement = con.prepareStatement("INSERT INTO orders VALUES(?,?,?,?,?,?,?)");

            preparedStatement.setInt(1,300081024);
            preparedStatement.setString(2,"2003-02-03");
            preparedStatement.setString(3,"2003-02-15");
            preparedStatement.setString(4,"2003-02-10");
            preparedStatement.setString(5,"Shipped");
            preparedStatement.setString(6,"buen pedido");
            preparedStatement.setInt(7,363);


            preparedStatement.executeUpdate();

            con.commit();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            if (con!=null){
                try{
                    con.rollback();
                }catch (SQLException ex){
                    throw new RuntimeException(ex);
                }
            }
        }
    }
}
