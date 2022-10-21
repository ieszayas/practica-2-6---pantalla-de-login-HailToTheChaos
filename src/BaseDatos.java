
import java.sql.*;
import java.util.*;

public class BaseDatos {

    private static final String url = "jdbc:derby://localhost:1527/shopmedb;create=true";
    private static final String userBD = "APP";
    private static final String passwd = "1234";
    static Connection conexion = null;

    private static boolean conectar() {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            conexion = DriverManager.getConnection(url, userBD, passwd);

        } catch (SQLException e) {
            return false;
        } catch (ClassNotFoundException e) {
            return false;
        }
        return true;
    }

    public static boolean guardar(Usuario user) {
        if (conectar()) {
            try {
                Statement s = conexion.createStatement();
                s.executeUpdate("INSERT INTO USERS (usuario, password) VALUES ('" + user.getUsuario() + "', '" + user.getContraseña() + "')");
                if (user.isInfo()) {
                    s.executeUpdate("INSERT INTO informacion (usuario, nombre, apellidos, fecha, correo) VALUES ('"
                            + user.getUsuario() + "', '" + user.getNombre() + "', '" + user.getApellido() + "', '" + user.getFecha_nac()
                            + "', '" + user.getCorreo() + "' )");

                }

                s.close();
            } catch (SQLException ex) {
                return false;
            }
        }
        return true;
    }

    public static boolean consultar(String user, String password) {
        if (conectar()) {
            try {
                Statement s = conexion.createStatement();
                ResultSet rs = s.executeQuery("select usuario, password from users where usuario = '" + user + "' and password = '" + password + "'");

                if (rs.next()) { //Si devuelve true es que hay registro
                    return true;
                } else {
                    return false;
                }
            } catch (SQLException ex) {
                
                return false;
            }
        }
        return false;
    }
}
