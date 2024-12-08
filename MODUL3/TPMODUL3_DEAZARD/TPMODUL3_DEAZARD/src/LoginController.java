import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

public class LoginController {
    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;

  
    private static final String USERNAME = "deazard102022300118";
    private static final String PASSWORD = "2909";

    public void handleLogin() {
        String username = usernameField.getText();
        String password = passwordField.getText();

       
        if (USERNAME.equals(username) && PASSWORD.equals(password)) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("resources/Inventory.fxml"));
                Stage stage = (Stage) usernameField.getScene().getWindow();
                stage.getScene().setRoot(loader.load());
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR, "Username atau password salah!");
            alert.showAndWait();
        }
    }
}
