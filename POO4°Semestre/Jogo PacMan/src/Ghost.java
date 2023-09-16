import java.util.Random;

public class Ghost extends GameObject{

    private int DirecaoFantasma;
    private int X;
    private int Y;
    private boolean Andar;

    public Ghost(int x, int y, int direcaoFantasma) {
        DirecaoFantasma = direcaoFantasma;
        X = x;
        Y = y;
    }

    public int mover(){
        Random random = new Random();
        int indice = random.nextInt(4);
        int[] numeros = {8, 4, 2, 6};
        int numeroAleatorio = numeros[indice];




        while (Andar == true){

            DirecaoFantasma = numeroAleatorio;

            if (DirecaoFantasma == 8 ){
                return getY() + (-10);
            }
            if (DirecaoFantasma == 4 ){
                return getX() + (-10);
            }
            if (DirecaoFantasma == 2 ){
                return getY() + (+10);
            }
            if (DirecaoFantasma == 6 ){
                return getX() + (+10);
            }


        }
        return 0;
    }

    public Ghost(){

    }

    public Ghost(int x, int y) {
        super(x, y);
    }


}
