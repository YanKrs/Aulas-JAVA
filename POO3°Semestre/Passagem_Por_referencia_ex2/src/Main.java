public class Main {
    public static void main(String[] args) {
        int []vetorInteiros = {10, 20, 30, 40, 50};

        for(int i=0; i<vetorInteiros.length; i++) {
            System.out.print(vetorInteiros[1] + "");
        }
            modificar(vetorInteiros);

            System.out.println("\n=== Vetor após chamada do método ===");
            for(int i=0; i<vetorInteiros.length; i++){
                System.out.print(vetorInteiros[i] + "");
            }

    }//fim do main
    static void modificar(int []vetor){
        for(int i = 0; i< vetor.length; i++){
            vetor[i] = vetor[i] /2;
        }
    }

}//fim da classe