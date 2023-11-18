package com.example;

import java.util.ArrayList;
import java.util.List;

public class Jogador{

    private int pontos = 0;
    private boolean parou =false;
    private List<Carta> cartas = new ArrayList<>();


    public Jogador() {
    }

    public void receberCarta(Carta carta) {
        cartas.add(carta);
        pontos += carta.getNumero();
    }

    public void parar(){
        parou = true;
        System.out.println("Você parou");
    }

    public boolean parou() {
        return false;
    }


    public int getPontos() {
        return pontos;
    }

    public List<Carta> getCartas() {
        return cartas;
    }


}
