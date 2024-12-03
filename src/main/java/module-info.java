module com.aerochinquihue {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.aerochinquihue.controlador to javafx.fxml;
    exports com.aerochinquihue;
}
