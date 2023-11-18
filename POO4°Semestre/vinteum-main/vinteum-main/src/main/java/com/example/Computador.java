package com.example;

public class Computador extends Jogador {


    public Computador() {
    }

    @Override
        public boolean parou() {
            // Lógica específica para o computador parar quando tiver mais de 16 pontos
            return getPontos() > 16;
        }

}
