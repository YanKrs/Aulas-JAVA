import java.math.BigDecimal;

public class Engenheiro extends Funcionario{
    private String departamento;
    private String crea;
    private BigDecimal valorReal;


    public Engenheiro(String departamento, String crea, String nome, int codigo, BigDecimal salarioBase) {
        super(nome, codigo, salarioBase);
        this.departamento = departamento;
        this.crea = crea;
    }

    @Override
    public BigDecimal calcularSalario() {
         var aumento = getSalarioBase().multiply(BigDecimal.valueOf(0.50));
         valorReal = getSalarioBase().add(aumento);
         return valorReal;
    }

    @Override
    public String toString() {
        return "Engenheiro{" +
                "departamento='" + departamento + '\'' +
                ", crea='" + crea + '\'' +
                ", Nome='" + getNome() + '\'' +
                ", Salario='" + calcularSalario() + '\'' +
                ", Codigo='" + getCodigo() + '\'' +
                '}';
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }

    public BigDecimal getValorReal() {
        return valorReal;
    }

    public void setValorReal(BigDecimal valorReal) {
        this.valorReal = valorReal;
    }
}
