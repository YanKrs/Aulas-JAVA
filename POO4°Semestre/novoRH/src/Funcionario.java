public abstract class Funcionario {
    private int codigo;
    private String nome;

    private double salario;



    public Funcionario(int codigo, String nome) {
        super();
        this.codigo = codigo;
        this.nome = nome;
    }


    public abstract double calcularSalario();



    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
