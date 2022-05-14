package practicaEntregable;

import practica.ConexionBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Transacciones {

    public static void transaccionA() {
        Connection con = ConexionBD.getConnection();

        try {
            con.setAutoCommit(false);

            PreparedStatement preparedStatement = con.prepareStatement("INSERT INTO customers values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
            preparedStatement.setInt(1,12548785);
            preparedStatement.setString(2,"Miguel Garage");
            preparedStatement.setString(3,"Miguel");
            preparedStatement.setString(4,"A");
            preparedStatement.setString(5,"21545568");
            preparedStatement.setString(6,"aqui");
            preparedStatement.setString(7,"alli");
            preparedStatement.setString(8,"Sevilla");
            preparedStatement.setString(9,"SE");
            preparedStatement.setString(10,"1950");
            preparedStatement.setString(11,"Spain");
            preparedStatement.setInt(12,1611);
            preparedStatement.setInt(13,300000);

            preparedStatement.executeUpdate();

            preparedStatement = con.prepareStatement("INSERT INTO payments values(?,?,?,?)");
            preparedStatement.setInt(1,12548785);
            preparedStatement.setString(2,"LDFHAHFKASFKKHD");
            preparedStatement.setString(3,"2002-12-03");
            preparedStatement.setDouble(4,50000);

            preparedStatement = con.prepareStatement("INSERT INTO payments values(?,?,?,?)");
            preparedStatement.setInt(1,12548785);
            preparedStatement.setString(2,"JDKJFOSDHF");
            preparedStatement.setString(3,"2004-11-03");
            preparedStatement.setDouble(4,42135);

            preparedStatement.executeUpdate();

            con.commit();

        }catch (SQLException e){
            System.out.println(e.getMessage());
            if (con!=null){
                try {
                    con.rollback();
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        }
    }
}
