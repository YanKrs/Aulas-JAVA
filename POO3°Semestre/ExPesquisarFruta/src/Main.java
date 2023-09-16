import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String []vetorFrutas = {"carambola", "maçã", "éra", "uva", "laranja",
                "goiaba", "ameixa", "mamão", "melancia", "framboesa",
                "pitanga", "açaí", "graviola", "banana", "maracujá"};

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma fruta");
        String fruta = entrada.next();

        System.out.println(pesquisar(vetorFrutas,fruta));

    }

    static boolean pesquisar(String []vetorFrutas, String fruta) {


        for (int i = 0; i < vetorFrutas.length; i++) {
            if (vetorFrutas[i].equals(fruta)) {
                return true;
            }
        }
        return false;
    }


    static String pesquisar(String vetorFrutas, int posi){
        Scanner num = new Scanner(System.in);

        System.out.println("Informe uma posição do Vetor");
        posi = num.nextInt();

        for( int i = 0; i != posi; i++){
            if(i == posi){
                return vetorFrutas[i];
            }
        }
        return null;
    }


}