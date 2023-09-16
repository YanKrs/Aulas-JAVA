import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite o nome");
        String nome = entrada.nextLine();

        System.out.println("Digite o salário");
        double salario = entrada.nextDouble();

        System.out.println("Digite o número do funcionário: ");
        int numeroFuncionarios = entrada.nextInt();


        Gerente Jose = new Gerente(salario,nome,numeroFuncionarios);
        Jose.aumentarSalario(10);
        System.out.println(Jose.imprimir());


    }
}