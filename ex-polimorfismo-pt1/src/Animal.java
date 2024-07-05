public abstract class Animal{
    protected Float peso;
    protected int idade;
    protected int membros;

    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();

    public void show(){
        System.out.println("----------------------------------------");
        System.out.println("Peso: " + this.peso);
        System.out.println("Idade: " + this.idade);
        System.out.println("Membros: " + this.membros);
        System.out.println("----------------------------------------");
    }

    public Float getPeso(){
        return this.peso;
    }

    public void setPeso(Float p){
        this.peso = p;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int i){
        this.idade = i;
    }

    public int getMembros(){
        return this.membros;
    }

    public void setMembros(int m){
        this.membros = m;
    }
}