import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        var engenheiro = new Engenheiro("Obras", "Ab525", "Cleber", 3241, new BigDecimal(1500));
        var gerente = new Gerente("Cleiton", 6548, new BigDecimal(1500), "Automotivos", new BigDecimal(50));
        var presidente = new Presidente("Cleiton", 6548, new BigDecimal(1500), 65);

        System.out.println(engenheiro);

    }
}