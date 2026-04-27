import java.util.Map;

public class LoginHandler {

    public String handleRequest(Map<String, String> input) {

        String username = input.get("username");
        String password = input.get("password");

        if (username == null || password == null) {
            return "Erreur : identifiants manquants";
        }

        // Simulation admin
        if (username.equals("admin") && password.equals("admin123")) {
            return "Connexion réussie - rôle ADMIN";
        }

        // Simulation utilisateur
        if (username.equals("user") && password.equals("user123")) {
            return "Connexion réussie - rôle UTILISATEUR";
        }

        return "Erreur : identifiants invalides";
    }
}
