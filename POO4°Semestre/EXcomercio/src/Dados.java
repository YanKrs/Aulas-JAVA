import java.math.BigDecimal;

public class Dados {

    private String nome;
    private BigDecimal preco;


    public Dados() {
    }

    public Dados(String nome, BigDecimal preco) {
        this.nome = nome;
        this.preco = preco;
    }


    public String mostrarData(){
        return "Nome: " + getNome() + " Preço: " + preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }


}
