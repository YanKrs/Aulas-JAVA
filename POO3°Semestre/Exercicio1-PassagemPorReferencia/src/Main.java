
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int vetor[] = new int[10];
        lerVetor(vetor);
        somarNumeros(vetor);

        System.out.println(somarNumeros(vetor));
        System.out.println(calcularMedia(vetor));
    }

    public static void lerVetor(int []vetor){
        Scanner entrada = new Scanner(System.in);


        for(int i=0; i<vetor.length; i++) {
            System.out.println("Digite um valor");
            vetor[i] = entrada.nextInt();
        }

        }


    public static int somarNumeros(int []vetor){
        int somar = 0;
        int result = 0;
        for(int i = 0;  i<vetor.length; i++){
             somar = vetor[i];
            result += somar;
        }
        return result;

    }


    public static int calcularMedia(int []vetor){
       return  somarNumeros(vetor)/vetor.length;
    }


}