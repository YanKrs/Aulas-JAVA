package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Monte {
    private List<Carta> cartas = new ArrayList<>();

    public Monte() {
        int random = (int) (Math.random() * 13);
        int random2 = (int) (Math.random() * 3);
        Naipe[] valores = new Naipe[random2];


        new Carta(random, valores);
    }





    public void embaralhar() {
        Collections.shuffle(cartas, new Random());
    }

    public Carta virar() {
            Carta cartaVirada = cartas.remove(0);
            return cartaVirada;

    }
}






