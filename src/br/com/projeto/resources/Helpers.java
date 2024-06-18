package br.com.projeto.resources;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Classe criada para 
 * @author Adilson Luz
 * @since Classe Criada em 18/06/2024, 10:42:39
 */
public class Helpers {
    
     //Metodo que faz conversão de data e hora para o padrão brasileiro
    public String dataHoraBr() {
        String date;
        // data/hora atual 
        LocalDateTime agora = LocalDateTime.now();

        // formatar a data
        DateTimeFormatter formatterData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String data = formatterData.format(agora);

        // formatar a hora
        DateTimeFormatter formatterHora = DateTimeFormatter.ofPattern("HH:mm:ss");
        String hora = formatterHora.format(agora);

        date = data + " - " + hora;

        return date;
    }//fim do metodo
    
    public String dataHoraEUA() {
        String date;
        // data/hora atual
        LocalDateTime agora = LocalDateTime.now();

        // formatar a data
        DateTimeFormatter formatterData = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String data = formatterData.format(agora);

        // formatar a hora
        DateTimeFormatter formatterHora = DateTimeFormatter.ofPattern("HH:mm:ss");
        String hora = formatterHora.format(agora);

        date = data + " - " + hora;

        return date;
    }//fim do metodo
    
    
    

}//fim da classe
