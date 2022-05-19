import java.util.Scanner;

public class Organização {
    public static void main(String[] args) {
        String nome, nomePai, nomeMae;
        String codigoParticular;
        String morada;
        String Naturalidade;
        String Sexo;
        int  opcao;
        int idade;
        int  qtNotas;
        float Altura;
        float nota = 0;

        Sala novaSala = new Sala();
        Aluno novoAluno = new Aluno();

        Scanner teclado;

        //Construir o teclado
        teclado = new Scanner(System.in);

        do {
            System.out.println("\n-------------------");
            System.out.println("   MENU");
            System.out.println("Escolha uma opcao");
            System.out.println("1 - Inserir aluno");
            System.out.println("2 - Listar aluno");
            System.out.println("3 - Situacoes");
            System.out.println("4 - Sair");

            opcao = teclado.nextInt();
            teclado.nextLine();

            switch (opcao){

                case 1:
                    System.out.println("\nNome: ");
                    nome = teclado.nextLine();

                    System.out.println("\nNome Pai: ");
                    nomePai = teclado.nextLine();

                    System.out.println("\nNome Mae: ");
                    nomeMae = teclado.nextLine();

                    System.out.println("\nCodigo Particular: ");
                    codigoParticular = teclado.nextLine();

                    System.out.println("\nMorada: ");
                    morada = teclado.nextLine();

                    System.out.println("\nNaturalidade: ");
                    Naturalidade = teclado.nextLine();

                    System.out.println("\nSexo: ");
                    Sexo = teclado.nextLine();

                    System.out.println("\nIdade: ");
                    idade = teclado.nextInt();

                    System.out.println("\nAltura: ");
                    Altura = teclado.nextFloat();

                    novoAluno = new Aluno(nome, codigoParticular, morada, Sexo, idade, Naturalidade, nomePai, nomeMae, Altura);

                    System.out.println("\nQuantas notas?");
                    qtNotas = teclado.nextInt();

                    for (int i = 0; i < qtNotas; i++) {
                        System.out.println("\nNota " + (i + 1));
                        nota = teclado.nextFloat();
                        novoAluno.insereNotas(nota);
                    }
                    novaSala.insereAluno(novoAluno);

                    break;
                case 2:
                    novaSala.ListarAlunos();
                    break;
                case 3:
                    novaSala.ListarSituações();
                    break;
                case 4:
                    System.out.println("\nSaindo...");
                    break;
                default:
                    System.out.println("\nOpcao invalida!");
            }

        }while (opcao != 0);
    }
}
