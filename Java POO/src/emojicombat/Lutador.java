package emojicombat;

public class Lutador implements LutadorActions {
    private String nome;
    private String nacionalidade;
    private double altura;
    private String categoria;

    private int vitorias;
    private int derrotas;
    private int empates;
    private int idade;
    private float peso;


//metodo construtor
public Lutador(
        String nome,
        String nacionalidade,
        double altura,
        String categoria,

        int vitorias,
        int derrotas,
        int empates,
        int idade,

        float peso
) {
    this.nome = nome;
    this.nacionalidade = nacionalidade;
    this.altura = altura;
    this.categoria = categoria;
    this.vitorias = vitorias;
    this.derrotas = derrotas;
    this.empates = empates;
    this.idade = idade;
    this.setPeso(peso);

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(this.peso < 52.2){
            this.categoria = "Inválido";
        }else if(this.peso <= 70.3){
            this.categoria = "Leve";
        }else if(this.peso <= 83.9){
            this.categoria = "Médio";
        }else if(this.peso <= 120.2){
            this.categoria = "Pesado";
        }else{
            this.categoria = "Inválido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    public String apresentar(){
        return "Lutador{" +
                "nome='" + this.nome + '\'' +
                ", nacionalidade='" + this.nacionalidade + '\'' +
                ", altura='" + this.altura + '\'' +
                ", categoria='" + this.categoria + '\'' +
                ", vitorias=" + this.vitorias +
                ", derrotas=" + this.derrotas +
                ", empates=" + this.empates +
                ", idade=" + this.idade +
                ", peso=" + this.peso +
                '}';
    }




    public void ganharLuta(){
        setVitorias(getVitorias()+1);
    }

    public void perderLuta(){
        setDerrotas(getDerrotas()+1);
    }

    public void empatarLuta(){
        setEmpates(getEmpates()+1);
    }

}
