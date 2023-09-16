public class Time {

    private int hora;
    private int minuto;
    private int segundo;

    public Time(int hora, int minuto, int segundo){
        if(hora>= 0 && hora < 24)
            this.hora = hora;
        if(minuto>= 0 && minuto <60)
            this.minuto = minuto;
        if(segundo>= 0 && segundo <60)
            this.segundo = segundo;
    }

    public int getHora(){
        return this.hora;
    }

    public void setHora(int hora){
        if(hora>= 0 && hora < 24)
            this.hora =  hora;
    }


    public int getMinuto(){
        return this.minuto;
    }

    public void setMinuto(int minuto){
        if(minuto>= 0 && minuto < 60)

            this.minuto =  minuto;
    }



    public int getSegundo(){
        return this.segundo;
    }

    public void setSegundo(int segundo){
        if(segundo>= 0 && segundo < 60)
            this.segundo =  segundo;
    }





    public String imprimir(){
        return hora +";" + minuto +";" + segundo +";";
    }
}
