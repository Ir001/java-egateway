package App.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
    @FXML
    public Button btnLogin;
    public TextField email;
    public PasswordField password;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    public void actionLogin(MouseEvent actionEvent) {
        System.out.println("Login");
        System.out.println(email.getText());
        System.out.println(password.getText());
    }
}
