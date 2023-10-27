public final class Presidente extends Funcionario implements Autenticavel{
        private double valorCotaDeAcoes;




    public Presidente(int codigo, String nome) {
        super(codigo, nome);
    }

    @Override
    public double calcularSalario() {
        return getSalario() + valorCotaDeAcoes;
    }


    public double getValorCotaDeAcoes() {
        return getSalario();
    }

    public void setValorCotaDeAcoes(double valorCotaDeAcoes) {
        this.valorCotaDeAcoes = valorCotaDeAcoes;
    }
}
