public class Main {
    public static void main(String[] args) {
        int a = 50;
        modificador(a);
        System.out.println("Main: valor de a " + a);
    }
    static void modificador(int a){
        a = 200;
        System.out.println("Modificador: Valor de a " + a);
    }

}