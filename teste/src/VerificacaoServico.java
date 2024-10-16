import java.util.Scanner;

public class VerificacaoServico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do serviço a ser verificado
        String servicoProcurado = scanner.nextLine().trim();

        // Entrada do nome do cliente e os serviços contratados
        String entradaCliente = scanner.nextLine().trim();

        // Separando o nome do cliente e os serviços contratados
        String[] partes = entradaCliente.split(",");
        String contratado = "Nao";

        for (String servico : partes){
            if (servico.trim().equals(servicoProcurado)){
                contratado = "Sim";
                break;
            }
        }

        System.out.println(contratado);


        scanner.close();
    }
}