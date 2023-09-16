public class Eletronicos extends Dados{
     private String marca;
     private String modelo;


    public Eletronicos(String nome, double preco, String marca, String modelo) {
        super(nome, preco);
        this.marca = marca;
        this.modelo = modelo;
    }

@Override
    public String toString(){
        return super.toString() + "Marca: " + marca + " modelo " + modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Eletronicos{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", nome='" + getNome() + '\'' +
                ", preco='" + getPreco() + '\'' +
                '}';
    }
}
