import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[] letras = {"A", "B", "C", "D", "J"};

        // Exemplo 1

        for (int i = 0; i < letras.length; i++) {
            System.out.println(letras[i]);
        }

        // Exemplo 2

        System.out.println(Arrays.toString(letras));


        // Exemplo 3

        int[] numeros = {4, 21, 87, 9, 3};

        int maior = numeros[0];
        int menor = numeros[0];
        int media = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
            media += numeros[i];
        }

        System.out.println("Maior: " + maior);
        System.out.println("Menor " + menor);
        System.out.println("Media: " + media / numeros.length);
    }
}