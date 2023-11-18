package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Jogo {

    protected Monte  monte = new Monte();
    protected  Jogador jogador = new Jogador();
    protected Computador computador = new Computador();



    public Jogo(){
        monte.embaralhar();
    }

    public String distribuirCarta(Jogador jogador) {
        if (!jogador.parou()) {
                 monte.virar();
        } else {
            System.out.println("O jogador já parou. Não é possível distribuir cartas.");
        }
        return null;
    }


    public boolean acabou() {
        List<Jogador> jogadores = new ArrayList<>();
        for (Jogador jogador : jogadores) {
            if (jogador.parou() && jogador.getPontos() >= 21) {
                return true;
            }
        }
        return false;
    }

    public String resultado() {
        List<Jogador> jogadores = new ArrayList<>();
        if (acabou()) {
            String resultado = "";
            int mPonto = 0;
            Jogador vencedor = null;

            for (Jogador jogador : jogadores) {
                if (jogador.getPontos() <= 21 && jogador.getPontos() > mPonto) {
                    mPonto = jogador.getPontos();
                    vencedor = jogador;
                }
            }

            if (vencedor != null) {
                resultado = "O jogador venceu com um total de " + vencedor.getPontos() + " pontos!";
            } else {
                resultado = "Houve um empate";
            }
            return resultado;
        } else {
            return "O jogo ainda não foi finalizado";
        }
    }



    public Jogador getJogador() {
        return jogador;
    }

    public Computador getComputador() {
        return computador;
    }
}
