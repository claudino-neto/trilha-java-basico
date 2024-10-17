public class TiposVariaveis {
    public static void main(String[] args) {
        //tipos primitivos
        byte idade = 123;
        short ano = 2021;
        int cep = 2104058963;
        long cpf = 14058464598L;
        float pi = 3.14F;
        double salarioMinimo = 2500.30;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; // usando casting

        final double VALOR_DE_PI = 3.14; // criando constantes

        char letra = 'a';

        boolean verdade = true;

        String nome = "Claudino";
    }
}