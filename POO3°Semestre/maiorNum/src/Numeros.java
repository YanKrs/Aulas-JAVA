public class Numeros {
        private int num1;

        private int num2;

        private String resultado;


        public Numeros(int num1, int num2){
            this.num1 = num1;
            this.num2 = num2;

            if(num1 > num2) {
               String resultado =  num1 + " é maior que " + num2;
            }else if (num1 < num2){
                String resultado = num2 + " é maior que " + num1;
            }else {
                String resultado = "Os números são iguais";
            }


        }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public String encontrarMax() {
        return resultado;
    }


}
