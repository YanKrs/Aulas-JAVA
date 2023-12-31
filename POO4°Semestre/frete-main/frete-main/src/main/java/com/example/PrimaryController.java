package com.example;

import java.math.BigDecimal;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {

    private TextField txtValor;
    private TextField txtDistancia;
    private Label lblResultado;

    public void calcular(){
        Entrega entrega = new Entrega()
                                .valor(new BigDecimal(txtValor.getText()))
                                .distancia(Integer.valueOf(txtDistancia.getText()));

        var service = new EntregaService();
        var valorDoFrete = service.calcularFrete(entrega);
        lblResultado.setText(valorDoFrete.toString());

    }

}
