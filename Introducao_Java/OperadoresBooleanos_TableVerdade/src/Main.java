// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // boolean resultado = false;
        // System.out.println(resultado);

        boolean fimDeSemana = true;
        boolean fazendoSol = true;
        boolean vamosApraia = fimDeSemana && fazendoSol;

        // Atalho 'sout' para System.out.println

        // Tabela verdade
        // Operador && (AND)
        // true && true = true
        // true && false = false
        // false && true = false
        // false && false = false

        // Tabela verdade
        // Operador || (OR)
        // true || true = true
        // true || false = true
        // false || true = true
        // false || false = false

        System.out.println(vamosApraia);

        // Operador Ternario

        String mensagem = fimDeSemana ? "É FIM DE SEMANA" : "NÃO E FIM DE SEMANA";
        System.out.println(mensagem);
    }
}