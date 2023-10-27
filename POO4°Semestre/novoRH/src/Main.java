public class Main {
    public static void main(String[] args) {

        var engenheiro = new Engenheiro(123, "Fernando");
        engenheiro.setSalario(6000);

        var gerente = new Gerente(321, "Marcia");
        gerente.setSalario(8000);

        var folhaDePagamento = new FolhaDePagamento();
        folhaDePagamento.registrar(engenheiro);
        folhaDePagamento.registrar(gerente);
    }
}