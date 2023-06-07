// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        int nota = 50; // Reprovado

        // Se a nota for maior que 70 | Aprovado
        // If e Else

        if (nota >= 80) {
            System.out.println("Voce foi aprovado \n");
        } else {
            System.out.println("Voce foi reprovado \n");
        }
        // Atalho CTRL + ALT + L -> FORMATA O CDOIGO
        // Exemplo 2

        int notas = 100;
        String graduacao;

        // A 80 B 70 C 60 D 0
        if (notas >= 80) {
            graduacao = "A";
        } else if (notas < 80 && notas >= 70) {
            graduacao = "B";
        } else if (notas < 70 && notas >= 60) {
            graduacao = "C";
        } else if (notas < 60 && notas >= 0) {
            graduacao = "D";
        } else {
            graduacao = "null";
        }

        switch (graduacao) {
            case "A":
            case "B":
                System.out.println("Voce foi aprovado na Graduação escolhida\n");
                break;
            case "C":
            case "D":
                System.out.println("Aluno reprovado na Graduação escolhida\n");
                break;
            default:
                System.out.println("Graduação invalida\n");
        }
    }
}