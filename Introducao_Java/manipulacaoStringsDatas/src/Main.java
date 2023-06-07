import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how

        // Ola {nome}. Hoje é {dia_da_semana}, Bom dia

        String nome = "Jessé";
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(nome.length());

        String segundoNome = "jessé";
        System.out.println(nome.equals(segundoNome)); // False
        System.out.println(nome.equalsIgnoreCase(segundoNome)); // True


        // ISO 8601
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);
        System.out.println(hoje.getDayOfWeek());
        // Configuracao Data
        Locale brasil = new Locale("pt", "BR");
        System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));
        String dia_da_semana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        String saudacao;

        LocalDateTime agora = LocalDateTime.now();

        if (agora.getHour() >= 0 && agora.getHour() < 12){
            saudacao = "Bom dia";
        } else if (agora.getHour() >= 12 && agora.getHour() < 18) {
            saudacao = "Boa tarde";
        } else if (agora.getHour() >= 12 && agora.getHour() < 24) {
            saudacao = "Boa noite";
        } else {
            saudacao = "Ola.";
        }

        System.out.printf("Ola, %s. Hoje é %s, %s.%n", nome, dia_da_semana, saudacao.toLowerCase());
    }
}