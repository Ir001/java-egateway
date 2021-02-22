package App.Controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.util.Optional;

public class DashboardController {
    Image imgProfileIcon;
    @FXML
    AnchorPane paneDashboard;
    public void profileClicked() throws IOException {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Are you sure?");
        alert.setHeaderText("Logout?");
        alert.setContentText("{user.name}, Are you sure to Logout this session?");
        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.OK){
            ScreenController screenController = new ScreenController(paneDashboard.getScene());
            screenController.addScreen("login", FXMLLoader.load(getClass().getResource("/Resources/Layout/login.fxml")));
            screenController.activate("login");
            Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
            alert1.setTitle("Logout Successfully");
            alert1.setHeaderText("Logout Success");
            alert1.setContentText("You are logged out now!");
            alert1.showAndWait();
        }

    }
}
