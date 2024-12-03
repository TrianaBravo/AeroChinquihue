package com.aerochinquihue.controlador;

import java.io.IOException;

import com.aerochinquihue.App;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Login_controlador {

    @FXML
    private Button button_asistente;

    @FXML
    private Button button_gerente;
    @FXML
    private Button button_volver;
    @FXML
    private Button button_asistente1;

    @FXML
    void button_asistente_handle1(ActionEvent event) throws IOException {
        App.setRoot("secondary");
    }

    @FXML
    void button_asistente_handle(ActionEvent event) throws IOException {
        App.setRoot("secondary");
    }

    @FXML
    void button_gerente_handle(ActionEvent event) {

    }
    @FXML
    void button_volver_handle(ActionEvent event) throws IOException{
        App.setRoot("secondary");
    }

}

