module Egateway {
    requires javafx.fxml;
    requires javafx.controls;

    opens App;
    opens App.Controller to javafx.fxml;
}