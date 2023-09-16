import javax.print.attribute.SetOfIntegerSyntax;

public class Ipva{

    //Crio as variáveis e determino os níveis de acesso dela - private; public; protected

    private int valorBase;
    private int qtdCavalos;

    //Crio o construtor dessas variáveis

    public Ipva(){

    }

    public Ipva(int valorBase,int qtdCavalos){
        this.valorBase = valorBase;
        this.qtdCavalos = qtdCavalos;
    }

    //Crio os "métodos" Getter&Setters desses atributos que quero acessar


    public int getValorBase() {
        return valorBase;
    }

    public void setValorBase(int valorBase) {
        this.valorBase = valorBase;
    }

    public int getQtdCavalos() {
        return qtdCavalos;
    }

    public void setQtdCavalos(int qtdCavalos) {
        this.qtdCavalos = qtdCavalos;
    }

    public double calcularIPVA(){
      return valorBase * qtdCavalos;
    }

    public String imprimir() {
        return "valorBase: " + valorBase +
                ", quantidadeCavalos: " + qtdCavalos;
    }



    //Crio os métodos ações da minha classe




}

