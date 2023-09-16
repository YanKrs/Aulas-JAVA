import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int xmax = 0, xmin = 0, ymax = 0, ymin = 0;

        int i = 0, t = 0;


        Scanner entrada = new Scanner(System.in);


        System.out.println("digite o x1: ");
        int x1 = entrada.nextInt();
        System.out.println("digite o y1: ");
        int y1 = entrada.nextInt();
        System.out.println("digite o x2: ");
        int x2 = entrada.nextInt();
        System.out.println("digite o y2: ");
        int y2 = entrada.nextInt();

        /*Escreve o tamanho da propriedade*/

        while (x1!= 0 && y1 != 0 && x2 != 0 && y2 != 0)
            /*Verifica se há valores válidos*/
        {

            if (x1 < x2 && y1 <= 10000 && x2 <=10000 && y2 < y1) {
                System.out.println("Propriedade localizada no primeiro quadrante \n");
                /*Verificar se os valores são positivos e estão no primeiro quadrante*/
                if (x1 > x2) {
                    xmax = x1;
                    xmin = x2;
                } else {
                    xmax = x2;
                    xmin = x1;


                }
                if (y1 > y2) {
                    ymax = y1;
                    ymin = y2;
                } else {
                    ymax = y2;
                    ymin = y1;
                }

                /*Define os maiores valores de X e Y para */
                break;
            }

            else {
                System.out.println("Verifique se todos os valores são positivos até 10000, rode o programa novamente");
                return;

            }

        }

        // int n = 0;

        System.out.println("Digite a quantidade de meteoritos que deseja pesquisar:   ");
        int m = entrada.nextInt();

        if(m <= 10000){
        while (m > 0) {

            System.out.println("Digite a coordenada x: ");
            int x = entrada.nextInt();
            System.out.println("Digite a coordenada y: ");
            int y = entrada.nextInt();
            if(x > 0 && x <= 10000 && y > 0 && y <= 10000)
            m--;
            else{
                System.out.println("Insira uma coordenada válida");
                break;
            }

            if (x >= xmin && x <= xmax && y >= ymin && y <= ymax) {
                i++;
            }else
                t++;

        }}else{
            System.out.println("Informe um valor positivo até 10.000 meteoros");

        }
        System.out.printf("Aproximadamente " + i + " meteoritos cairam dentro da propriedade");
        System.out.printf("\nAproximadamente " + t + " meteoritos cairam fora da propriedade");

    }
    }
