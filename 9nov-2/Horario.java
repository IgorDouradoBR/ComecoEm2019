

public class Horario
{
    private int hora,minuto, segundo;
    
    public Horario(int hora, int minuto, int segundo){
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }
    public int getHora(){ return hora; }
    public int getMinuto(){ return minuto; }
    public int getSegundo(){ return segundo; }
    
    public void setHora(int hora){
        if(hora>=0 && hora<=23) this.hora = hora;
    }
    public void setMinuto(int minuto){
        if(minuto>=0 && minuto<=59) this.minuto = minuto;
    }
    public void setSegundo(int segundo){
        if(segundo>=0 && segundo<=59) this.segundo = segundo;
    }
    public String toString(){
        return hora + ":" + minuto + ":" + segundo;
    }   
    public int converterParaSegundos(){
        return hora * 3600 + minuto * 60 + segundo;
    }
    public int converterParaMinutos(){
        return hora * 60 + minuto;
    }
    public int calcularRestanteDoDia(){
        int dia = 24 * 3600; //segundos em um dia
        return dia - converterParaSegundos();
    }
    public void atualizarHorario(int tempo){
        if(tempo>=0){
            hora = tempo / 3600;
            minuto = tempo % 3600 / 60;
            segundo = tempo % 3600 % 60;
        }
    }
    public int calcularDiferenca(Horario outroHorario){
        return Math.abs(converterParaSegundos() - outroHorario.converterParaSegundos());
    }
}



