import java.math.BigDecimal;

abstract class Funcionario {

    private String nome;
    private int codigo;
    private BigDecimal salarioBase;

    public Funcionario(String nome, int codigo, BigDecimal salarioBase) {
        this.nome = nome;
        this.codigo = codigo;
        this.salarioBase = salarioBase;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", codigo=" + codigo +
                ", salarioBase=" + salarioBase +
                '}';
    }

    public abstract BigDecimal calcularSalario();



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public BigDecimal getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(BigDecimal salarioBase) {
        this.salarioBase = salarioBase;
    }
}
