public class Aluno extends Pessoa{
    private int matricula;
    private String curso;

    public void cancelarMatr(){
        System.out.println("Matricula cancelada!");
    }

    public int getMatricula(){
        return this.matricula;
    }

    public void setMatricula(int m){
        this.matricula = m;
    }

    public String getCurso(){
        return this.curso;
    }

    public void setCurso(String c){
        this.curso = c;
    }
}
