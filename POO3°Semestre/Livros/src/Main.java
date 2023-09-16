public class Main {
    public static void main(String[] args) {

        Livro objlivro = new Livro();
        LivroDeBiblioteca objbiblioteca = new LivroDeBiblioteca();

        objbiblioteca.autor = "Zafon";
        objbiblioteca.isbn = 3455;
        objbiblioteca.nome = "O palácio da Meia noite";
        objbiblioteca.aluguel = "Gabriel";
        objbiblioteca.andar = 3;
        objbiblioteca.prateleira = 5;
        objbiblioteca.data = 060420231;
        objbiblioteca.emprestado = false;



        objlivro.autor = "Zafon";
        objlivro.isbn = 3455;
        objlivro.nome = "O palácio da Meia noite";
        objlivro.pags = 175;

        System.out.println(objlivro.livro());
        System.out.println(objbiblioteca.biblioteca());


    }
}