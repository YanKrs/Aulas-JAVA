
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Time time = new Time();

        System.out.println("Digite a Hora, minuto e segundo. Nesta ordem!");
        time.setHora(entrada.nextInt());
        time.setMinuto(entrada.nextInt());
        time.setSegundo(entrada.nextInt());

        System.out.println(time.visualizarHoraAmPm());




    }
}