public class Bolsista extends Aluno{
    private Float bolsa;

    public void renovarBolsa(){
        System.out.println("Renovando bolsa");
    }

    @Override
    public void pagarMensalidade(){ 
        System.out.println("Bolsista");
    }

    public Float getBolsa(){
        return this.bolsa;
    }

    public void setBolsa(Float b){
        this.bolsa = b;
    }
}
