import java.math.BigDecimal;

public class Gerente extends Funcionario {

    private String area;
    private BigDecimal bonus;

    public Gerente(String nome, int codigo, BigDecimal salarioBase, String area, BigDecimal bonus) {
        super(nome, codigo, salarioBase);
        this.area = area;
        this.bonus = bonus;
    }


    @Override
    public BigDecimal calcularSalario() {
        var valorReal = (getSalarioBase().add(bonus));
        return valorReal;
    }


    @Override
    public String toString() {
        return "Gerente{" +
                "area='" + area + '\'' +
                ", bonus=" + bonus +
                ", Nome='" + getNome() + '\'' +
                ", Salario='" + calcularSalario() + '\'' +
                ", Codigo='" + getCodigo() + '\'' +
                '}';
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public BigDecimal getBonus() {
        return bonus;
    }

    public void setBonus(BigDecimal bonus) {
        this.bonus = bonus;
    }


}
