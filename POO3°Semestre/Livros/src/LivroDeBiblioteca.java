public class LivroDeBiblioteca {
    String autor;
    int isbn;
    int pags;
    String nome;
    String aluguel;
    int andar;
    int prateleira;
    int data;

    boolean emprestado;

    public String biblioteca(){
        return "Nome " + nome + "\nAutor: " + autor + "\nISBN: " + isbn + "\nPáginas: " + pags + "\nAluguel: " + aluguel +
                "\nAndar: " + andar +"\nPrateleira: " + prateleira +"\nData: " + data + "\nEmprestado: " + emprestado;
    }

}
