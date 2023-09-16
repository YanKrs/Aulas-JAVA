public class GerenciarCarros {

    private static ArrayList<Carro> listaCarros = new ArrayList<Carro>();

    public static void adicionar(Carro carro) {
        listaCarros.add(carro);
    }

    public static void adicionar(Carro carro, int indice) {
        listaCarros.add(indice, carro);
    }

    public static void listar() {
        for (Carro carro : listaCarros) {
            System.out.println(carro.getMarca() + " " + carro.getModelo());
        }
    }

    public static Carro get(int indice) {
        if (indice >= 0 && indice < listaCarros.size()) {
            return listaCarros.get(indice);
        }
        return null;
    }

    public static Carro buscarCarro(String marca) {
        for (Carro carro : listaCarros) {
            if (carro.getMarca().equals(marca)) {
                return carro;
            }
        }
        return null;
    }
}

}
