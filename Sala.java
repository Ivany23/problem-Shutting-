import java.util.ArrayList;

public class Sala {
    ArrayList<Aluno> ListaAlunos;

    public Sala(){

        this.ListaAlunos = new ArrayList<>();
    }

    public void insereAluno(Aluno novoAluno){
        novoAluno.calculaNotas();
        ListaAlunos.add(novoAluno);
    }

    public void ListarAlunos(){
        System.out.println("\nLista de alunos");

        for(Aluno alunoNaLista:ListaAlunos){
            alunoNaLista.Listar();
        }
    }

    public void ListarSituações(){
        System.out.println("\nSituações");

        for(Aluno alunoNaLista: ListaAlunos){
            alunoNaLista.mostrarSituação();
        }
    }
}
