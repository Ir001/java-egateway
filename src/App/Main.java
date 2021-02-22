package App;

//import App.Controller.LoginController;
import App.Controller.ScreenController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Resources/Layout/login.fxml"));
        Parent root = loader.load();
        primaryStage.setTitle("E-Gateway");
        primaryStage.setScene(new Scene(root, 640, 480));
        primaryStage.setResizable(false);
        primaryStage.getIcons().add(new Image(this.getClass().getResource("/Resources/img/trusur.png").toString()));
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
