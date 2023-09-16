public class Gerente extends Funcionario {

    private int numeroFuncionarios;

    public Gerente(){
        super();
    }

    public Gerente(double salario, String nome, int numeroFuncionarios){
        super(nome, salario);
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public double aumentarSalario(double percentual){
        return super.aumentarSalario( percentual+20);
    }

    public String imprimir(){
        return super.imprimir()+ ", numero funcionarios: " + numeroFuncionarios;
    }

    public int getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void setNumeroFuncionarios(int numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }
}
