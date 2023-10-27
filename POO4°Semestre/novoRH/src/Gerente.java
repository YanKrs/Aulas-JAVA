public class Gerente extends Funcionario implements Autenticavel{

    private String area;
    private double bonus;


    public Gerente(int codigo, String nome) {
        super(codigo, nome);
    }

    @Override
    public double calcularSalario() {
        return getSalario() + bonus;
    }


    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
