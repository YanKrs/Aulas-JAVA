import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        GerenciarCarros.adicionar(new Carro("Marca1", "Modelo1"));
        GerenciarCarros.adicionar(new Carro("Marca2", "Modelo2"));
        GerenciarCarros.adicionar(new Carro("Marca3", "Modelo3"));

        System.out.println("Lista de carros:");
        GerenciarCarros.listar();

        int indice = 1;
        GerenciarCarros.adicionar(new Carro("Marca4", "Modelo4"), indice);

        System.out.println("Lista de carros após adicionar um carro no índice " + indice + ":");
        GerenciarCarros.listar();

        Carro carroEncontrado = GerenciarCarros.buscarCarro("Marca3");
        if (carroEncontrado != null) {
            System.out.println("Carro encontrado: " + carroEncontrado.getMarca() + " " + carroEncontrado.getModelo());
        } else {
            System.out.println("Carro não encontrado.");
        }
    }
}
