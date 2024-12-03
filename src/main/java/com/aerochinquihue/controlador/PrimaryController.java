package com.aerochinquihue.controlador;

import java.io.IOException;
import javafx.fxml.FXML;
import  com.aerochinquihue.App;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
