package com.aerochinquihue.controlador;

import java.io.IOException;

import com.aerochinquihue.App;

import  javafx.fxml.FXML;

public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("login");
    }
}