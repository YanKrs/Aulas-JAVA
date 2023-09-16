
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Animal objAnimal = new Animal();

        System.out.println("Digite o nome");
        objAnimal.setNome(entrada.nextLine());

        System.out.println("Digite o raca");
        objAnimal.setRaca(entrada.nextLine());

        System.out.println("Digite o cor");
        objAnimal.setCor(entrada.nextLine());


        System.out.println("Digite o nasc");
        objAnimal.setNasc(entrada.nextLine());


        System.out.println("Digite o dono");
        objAnimal.setDono(entrada.nextLine());




    }
}