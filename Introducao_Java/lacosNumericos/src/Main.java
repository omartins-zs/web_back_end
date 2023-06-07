// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //Exemplo 1

        // Para uma variavel que inicia em 1, e vai até 10, mudando 1por1
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // Exemplo 2

        // 2 For
        System.out.println("\n Tabuada \n");

        // Para uma variavel que inicia em 1, e vai até 10, mudando 1por1
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(j + "x" + i + " = " + j * i);
            }
        }


    }
}