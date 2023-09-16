public class Time {
    private int hora;
    private int minuto;
    private int segundo;

    public String visualizarHoraAmPm(){
        if(hora>= 0 && hora < 12) {
          return  this.hora + "AM";
        }else {
           int atual = this.hora -12;
           return atual  +":"+ this.minuto + ":" + this.segundo + "PM";
        }

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
        return this.hora + ":" + this.minuto + ":" + this.segundo;
    }














}
