package App.Controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
    @FXML
    public Button btnLogin;
    public TextField txtemail;
    public PasswordField txtpassword;
    public AnchorPane paneLogin;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    public TextField getEmail() {
        return txtemail;
    }

    public PasswordField getPassword() {
        return txtpassword;
    }

    public void actionLogin(MouseEvent actionEvent) {
        System.out.println("Login");
        processLogin();
    }



    public void processLogin(){
        String email = getEmail().getText().toString();
        String password = getPassword().getText().toString();

        if(email.equals("1") && password.equals("1")){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Success!");
            alert.setHeaderText("Login Success");
            alert.setContentText("Login successfully!");
            alert.initStyle(StageStyle.UTILITY);
            alert.showAndWait();
            try {
                showDashboard();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Failed!");
            alert.setHeaderText("Login Failed");
            alert.setContentText("Email or password incorrect!");
            alert.initStyle(StageStyle.UTILITY);
            alert.showAndWait();
        }
    }

    public void showDashboard() throws IOException {
        ScreenController screenController = new ScreenController(btnLogin.getScene());
        screenController.addScreen("dashboard", FXMLLoader.load(getClass().getResource("/Resources/Layout/dashboard.fxml")));
        screenController.activate("dashboard");
    }
}
