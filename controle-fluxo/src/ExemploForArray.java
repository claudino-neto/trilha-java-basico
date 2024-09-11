public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = {"FELIPE", "JOÃO", "ANA", "MÁRCIA"};
        for (int i = 0; i < alunos.length; i++) {
            System.out.println("O aluno de índice " + i + " é " + alunos[i]);
        }
        for (String aluno: alunos) {
            System.out.println("Nome do aluno é: " + aluno);
        }
    }
}
