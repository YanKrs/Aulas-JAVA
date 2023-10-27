public class FolhaDePagamento {

    private double total;

    public void logar (Autenticavel funcionario){
        System.out.println(funcionario + " logado");
    }

    public void registrar(Funcionario funcionario){
        total += funcionario.calcularSalario();
    }
    public double calcularFolha(){
        return total;
    }



}
