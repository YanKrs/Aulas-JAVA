import java.util.ArrayList;
import java.util.List;


public class Carro {
    private String Marca;
    private String Modelo;
    private List<Roda> Roda = new ArrayList<Roda>();

    private Motor mot;

    private int velocidade;


    public String getMarca() {
        return Marca;
    }

    public String getModelo() {
        return Modelo;
    }


    public int acelerar(){
        if(velocidade <= 140){
            this.velocidade += 10;
        }

    }

    public int frear(){

    }
}


