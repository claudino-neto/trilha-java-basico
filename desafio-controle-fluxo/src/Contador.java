import java.util.Locale;
import java.util.Scanner;
public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        try{
            //chamando o método contendo a lógica de contagem
            contar(numero1, numero2);
        } catch (ParametrosInvalidosException e){
            System.out.println("O SEGUNDO PARÂMETRO DEVE SER MAIOR QUE O PRIMEIRO!");
        };
    }
    static void contar(int numero1, int numero2) throws ParametrosInvalidosException {
        //validar se o numero1 é maior que o numero2
        if (numero1 > numero2){
            throw new ParametrosInvalidosException();
        }

        int contagem = numero2 - numero1;
        for (int i = 1; i < contagem + 1; i++) {
            System.out.println(i);
        }
    }
}
