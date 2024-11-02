package org.usuario.controller;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.fxml.FXML;
import javafx.scene.control.Label;


public class MainController {
    @FXML
    private Label welcomeText;

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtPassword;

    @FXML
    private Button btnSalvar;

    @FXML
    public void onBtnSalvarAction(){
        System.out.println("Clique Salvar");
    }
}