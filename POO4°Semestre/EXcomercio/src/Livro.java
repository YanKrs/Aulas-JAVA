import java.math.BigDecimal;

public class Livro extends Dados{
    private String autor;


    public Livro(String nome, BigDecimal preco, String autor) {
        super(nome, preco);
        this.autor = autor;
    }


    public String mostrarData(){
        return super.toString() + "Autor: " + autor;
    }


    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }



}
