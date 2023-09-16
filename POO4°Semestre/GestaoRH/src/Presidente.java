import java.math.BigDecimal;

public final Presidente extends Funcionario {
        private double cota;

    public Presidente(String nome, int codigo, BigDecimal salarioBase, double cota) {
        super(nome, codigo, salarioBase);
        this.cota = cota;
    }

    @Override
    public BigDecimal calcularSalario() {
        var valorReal = getSalarioBase().add(BigDecimal.valueOf(cota));
        return valorReal;
    }

    @Override
    public String toString() {
        return "Presidente{" +
                "cota=" + cota +
                ", Nome='" + getNome() + '\'' +
                ", Salario='" + calcularSalario() + '\'' +
                ", Codigo='" + getCodigo() + '\'' +
                '}';
    }

    public double getCota() {
        return cota;
    }

    public void setCota(double cota) {
        this.cota = cota;
    }


}
