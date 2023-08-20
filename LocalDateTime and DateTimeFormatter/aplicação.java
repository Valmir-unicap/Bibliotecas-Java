import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class hoje {
    public static void main(String[] args) {
        System.out.println("=============================================================");
        System.out.println("                           Hoje                              ");
        System.out.println("=============================================================");
        LocalDateTime dia = LocalDateTime.now();
        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String hojeDia = dia.format(formatoData);
        System.out.println("Dia: "+hojeDia);
        System.out.println("=============================================================");
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm:ss");
        String hojeHora = dia.format(formatoHora);
        System.out.println("Horário: "+hojeHora);
        System.out.println("=============================================================");
        DateTimeFormatter millisegundos = DateTimeFormatter.ofPattern("SSS");
        String hojeMillisegundos = dia.format(millisegundos);
        System.out.println("Millisegundos: "+hojeMillisegundos);
        System.out.println("=============================================================");
        DateTimeFormatter nanosSegundos = DateTimeFormatter.ofPattern("ns");
        String nano = dia.format(nanosSegundos);
        System.out.println("Nanossegundos: "+nano);
        System.out.println("=============================================================");
        DateTimeFormatter diaSemana = DateTimeFormatter.ofPattern("E");
        String semana = dia.format(diaSemana);
        System.out.println("Dia da semana: "+semana);
        System.out.println("=============================================================");
        DateTimeFormatter formatoMes = DateTimeFormatter.ofPattern("MMM");
        String mes = dia.format(formatoMes);
        System.out.println("Mes por extenso: "+mes);
        System.out.println("=============================================================");
    }
}
