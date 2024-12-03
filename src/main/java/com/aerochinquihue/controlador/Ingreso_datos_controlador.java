package com.aerochinquihue.controlador;

import java.io.IOException;

import com.aerochinquihue.App;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Ingreso_datos_controlador {

    @FXML
    private TextField txtfield_nombre;

    @FXML
    void button_volver(ActionEvent event) throws IOException{
         App.setRoot("login");
    }

}
