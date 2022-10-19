
import java.util.ArrayList;

public class Metodos {

    private static final String nombres[] = {"administrador", "manolo", "antonio", "roberto", "jaime"};
    private static final String contraseña = "1234";
    private static ArrayList<Usuario> users = new ArrayList();

    public static void generarUsuarios() {
        for (int i = 0; i < nombres.length; i++) {
            users.add(new Usuario(nombres[i], contraseña));
        }
    }

    public static boolean verificarUser(String user, String contra) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUsuario().equals(user)) {
                if (users.get(i).getContraseña().equals(contra)) {
                    return true;
                }
            }
        }
        return false;
    }
}
