public class Professor extends Pessoa{
    private String especialidade;
    private Float salario;

    public void receberAum(Float aum){
        this.setSalario(this.getSalario() + aum);
    }

    public String getEspecialidade(){
        return this.especialidade;
    }

    public void setEspecialidade(String e){
        this.especialidade = e;
    }

    public Float getSalario(){
        return this.salario;
    }

    public void setSalario(Float s){
        this.salario = s;
    }
}
