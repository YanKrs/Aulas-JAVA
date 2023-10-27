public class Engenheiro extends Funcionario{

    private String departamento;
    private String crea;


    public Engenheiro(int codigo, String nome) {
        super(codigo, nome);
    }

    @Override
    public double calcularSalario() {
        return getSalario() * 1.5;
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
}
