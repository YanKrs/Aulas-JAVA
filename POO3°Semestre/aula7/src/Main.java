
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Pessoa objPessoa = new Pessoa();
        Scanner entrada = new Scanner(System.in);
        Scanner entradaString = new Scanner(System.in);

        System.out.println("Digite Nome ");
        objPessoa.setNome(entradaString.nextLine());

        System.out.println("Digite Idade ");
        objPessoa.setIdade(entrada.nextInt());

        System.out.println("Digite Sexo ");
        objPessoa.setSexo(entrada.next().charAt(0));

        Endereco endPessoa = new Endereco();


        System.out.println("Digite seu Logradouro");
        String logradouro = entradaString.nextLine();
        endPessoa.setLogradouro(logradouro);


        System.out.println("Digite o número ");
        endPessoa.setNumero(entrada.nextInt());

        System.out.println("Digite o Complemento ");
        endPessoa.setComplemento(entradaString.nextLine());

        System.out.println("Digite o CEP ");
        endPessoa.setCep(entradaString.nextLine());

        objPessoa.setEnd(endPessoa);
        System.out.println(objPessoa.imprimir());

    }
}