
import java.util.Scanner;
public class AppHorario
{
    public void executa(){
        Scanner entrada = new Scanner(System.in);
        //Solicita ao usuario a hora, minuto e segundos atuais.
        System.out.print("Informe a hora: ");
        int horaInf = entrada.nextInt();
        System.out.print("Informe o minuto: ");
        int minutoInf = entrada.nextInt();
        System.out.print("Informe o segundo: ");
        int segundoInf = entrada.nextInt();
        
        //Instancia um objeto horario com os dados informados
        Horario horario1 = new Horario(horaInf,minutoInf,segundoInf);
        
        //Exibe o estado atual do objeto horario.
        System.out.println("Horario atual: " + horario1);
        
        //Converte o horario para segundos e exibe essa informacao para
        //o usuario.
        System.out.println("Horario em segundos: " +
                            horario1.converterParaSegundos());
                            
        //Exibe em segundos quanto tempo falta para o dia acabar
        System.out.println("Tempo restante em segundos: " +
                            horario1.calcularRestanteDoDia());
        
        //int minutoInf = entrada.nextInt();                    
        System.out.print("Informe o novo minuto: ");
        minutoInf = entrada.nextInt();
        //Atualiza o objeto horario com esse dado.
        horario1.setMinuto(minutoInf);
        
        //Exibe novamente o estado atual do objeto horario.
        System.out.println("Horario atual: " + horario1);
        
        //Solicita novamente ao usuario a hora, minuto e segundos
        System.out.print("Informe a hora: ");
        horaInf = entrada.nextInt();
        System.out.print("Informe o minuto: ");
        minutoInf = entrada.nextInt();
        System.out.print("Informe o segundo: ");
        segundoInf = entrada.nextInt();
        
        //Instancia um outro objeto horario com os dados informados
        Horario horario2 = new Horario(horaInf,minutoInf,segundoInf);
        
        //Exibe para o usuario a diferenca em segundos entre os dois
        //objetos horario instanciados
        System.out.println("Diferenca em segundos: " +
                           horario1.calcularDiferenca(horario2));
    }
}






