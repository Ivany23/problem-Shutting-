import java.util.ArrayList;

public class Aluno {
    protected float total = 0;
    protected float Altura;
    protected String nome, codigoParticular, morada, Sexo, Naturalidade, nomePai, nomeMae;
    protected int idade;
    protected String situação = "Reprovado";

    ArrayList<Float> notasAluno = new ArrayList();

    public Aluno(String nome, String codigoParticular, String morada, String Sexo, int idade, String Naturalidade, String nomePai, String nomeMae, float Altura){
        setNome(nome);
        setcodigoParticular(codigoParticular);
        setMorada(morada);
        setSexo(Sexo);
        setNaturalidade(Naturalidade);
        setNomePai(nomePai);
        setNomeMae(nomeMae);
        setAltura(Altura);
        setIdade(idade);
    }

    public Aluno() {

    }

    void insereNotas(float nota){

        notasAluno.add(nota);
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public String getCodigoParticular() {

        return codigoParticular;
    }

    public void setcodigoParticular(String codigoParticular) {

        this.codigoParticular = codigoParticular;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String sexo) {
        Sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return Altura;
    }

    public void setAltura(float altura) {
        Altura = altura;
    }

    public String getNaturalidade() {
        return Naturalidade;
    }
    public void setNaturalidade(String naturalidade) {
        Naturalidade = naturalidade;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    void Listar(){
        System.out.println("\nNome: " + this.nome);
        System.out.println("\nNomeaPai: " + this.nomePai);
        System.out.println("\nNomeMae: " + this.nomeMae);
        System.out.println("CodigoParticular: " + this.codigoParticular);
        System.out.println("Morada: " + this.morada);
        System.out.println("Naturalidade: " + this.Naturalidade);
        System.out.println("Sexo: " + this.Sexo);
        System.out.println("Idade: " + this.idade);
        System.out.println("Altura: " + this.Altura);

        for (int i = 0; i < notasAluno.size(); i++) {
            System.out.println("\nNomeDisciplina: ");
            System.out.println("Nota " + (i + 1) + ": " + this.notasAluno.get(1));
        }
    }

    void mostrarSituação(){
        System.out.println("\nNome: " + this.nome);
        System.out.println("\nNomePai: " + this.nomePai);
        System.out.println("\nNomeMae: " + this.nomeMae);
        System.out.println("\nCodigoParticular: " + this.codigoParticular);
        System.out.println("\nTotal: " + this.total);
        System.out.println("\nMorada: " + this.morada);
        System.out.println("\nNaturalidade: " + this.Naturalidade);
        System.out.println("\nSexo: " + this.Sexo);
        System.out.println("\nIdade: " + this.idade);
        System.out.println("\nAltura: " + this.Altura);
        System.out.println("\nSituação: " + this.situação);
    }

    void calculaNotas (){
        for(float notaDaLista:notasAluno) {
            total = total + notaDaLista;
        }

        if (total >= 70){
            this.situação = "Aprovado";
        } else{
            this.situação = "Reprovado";
        }
    }

    public ArrayList<Float> getNotasAluno() {
        return notasAluno;
    }

    public void setNotasAluno(ArrayList<Float> notasAluno) {
        this.notasAluno = notasAluno;
    }
}
