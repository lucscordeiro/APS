public class Lutador {
    private String nome;
    private String nacionalidade;
    private Float altura;
    private Float peso;
    private String categoria;
    private int idade, vitorias, empates, derrotas;

    public Lutador(String no, String na, int id, Float al, Float pe, int vi, int de, int em ){
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }

    public void apresentar(){
        System.out.println("--------------------------------------");
        System.out.println("Lutador: " + getNome());
        System.out.println("Origem: " + getNacionalidade());
        System.out.println(getIdade() + " anos");
        System.out.println(getAltura() + "m de altura");
        System.out.println("Pesando: " + getPeso());
        System.out.println("Ganhou: " + getVitorias());
        System.out.println("Perdeu: " + getDerrotas());
        System.out.println("Empatou: " + getEmpates());
    }

    public void status(){
        System.out.println("-------------------------------------------");
        System.out.println(getNome());
        System.out.println("E um peso " + getCategoria());
        System.out.println(getVitorias() + " vitorias");
        System.out.println(getDerrotas() + " derrotas");
        System.out.println(getEmpates() + " empates");
    }

    public void ganharLuta(){
        this.setVitorias(getVitorias() + 1);
    }

    public void perderLuta(){
        this.setDerrotas(getDerrotas() + 1);
    }

    public void empatarLuta(){
        this.setEmpates(getEmpates() + 1);
    }

    public void setNome(String n){
        this.nome = n;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNacionalidade(String na){
        this.nacionalidade = na;
    }

    public String getNacionalidade(){
        return this.nacionalidade;
    }

    public void setIdade(int i){
        this.idade = i;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setAltura(Float a){
        this.altura = a;
    }

    public Float getAltura(){
        return this.altura;
    }

    public void setPeso(Float pe){
        this.peso = pe;
        setCategoria();
    }

    public Float getPeso(){
        return this.peso;
    }

    private void setCategoria(){

        if(this.peso < 52.2){
            this.categoria = "Invalido";
        } else if(this.peso <= 70.3) {
            this.categoria = "Leve";
        } else if(this.peso <= 83.9){
            this.categoria = "Medio";
        } else if(this.peso <= 120.2){
            this.categoria = "Pesado";
        } else {
            this.categoria = "Invalido";
        }
    }
    
    public String getCategoria(){
        return this.categoria;
    }

    public void setVitorias(int v){
        this.vitorias = v;
    }

    public int getVitorias(){
        return this.vitorias;
    }

    public void setDerrotas(int d){
        this.derrotas = d;
    }

    public int getDerrotas(){
        return this.derrotas;
    }

    public void setEmpates(int e){
        this.empates = e;
    }

    public int getEmpates(){
        return this.empates;
    }

}
