public class Conta {

    private int numero;
    private int agencia;
    private String titular;
    private double Saldo;


    public Conta() {
    }

    public Conta(int numero, int agencia, String titular) {
        this.numero = numero;
        this.agencia = agencia;
        this.titular = titular;
    }


    public double calcularSaldo(){
        return Saldo;
    }
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double saldo) {
        Saldo = saldo;
    }


    @Override
    public String toString() {
        return "Conta{" +
                "titular='" + titular + '\'' +
                ", Saldo=" + Saldo +
                '}';
    }
}
