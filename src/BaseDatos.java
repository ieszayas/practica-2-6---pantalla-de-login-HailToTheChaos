
import java.sql.*;
import java.util.*;

public class BaseDatos {

    private static final String url = "jdbc:derby://localhost:1527/shopmedb;create=true";
    private static final String userBD = "APP";
    private static final String passwd = "1234";
    static Connection conexion = null;

    private static boolean conectar() {
        try {
            conexion = DriverManager.getConnection(url, userBD, passwd);

        } catch (SQLException e) {
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
                    s.executeUpdate("INSERT INTO INFORMACION (usuario, nombre, apellidos, fecha, correo) VALUES ('"
                            + user.getUsuario() + "', '" + user.getNombre() + "', '" + user.getApellido() + "', DATE('" + user.getFecha_nac() + "'), '"
                            + user.getCorreo() + "' )");
                }
                s.close();
                conexion.close();
            } catch (SQLException ex) {
                System.out.println(ex);
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

    public static boolean consultar(String user) {
        if (conectar()) {
            try {
                Statement s = conexion.createStatement();
                ResultSet rs = s.executeQuery("select usuario, password from users where usuario = '" + user + "'");

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

    public static boolean modificarContraseña(String user, String nContraseña) {
        if (conectar()) {
            try {
                Statement s = conexion.createStatement();
                s.executeUpdate("update users set password = '" + nContraseña + "' where usuario = '" + user + "'");

                return true;

            } catch (SQLException ex) {
                return false;
            }
        }
        return false;
    }
}
