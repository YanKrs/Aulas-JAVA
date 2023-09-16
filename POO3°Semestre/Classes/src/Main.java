public class Main {
    public static void main(String[] args) {



        Pessoa maria = new Pessoa( "Maria",  25, 'f');

        Pessoa joao = new Pessoa("joao", 18, 'm');

        Time time = new Time(12, 43, 12);

        System.out.println(time.getHora() + ":" + time.getMinuto() +":," +
                "" + time.getSegundo());
        time.setHora(15);
        time.setMinuto(34);
        time.setSegundo(55);
        System.out.println("A hora é: " + time.imprimir());
    }

}