import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    

    public void marcarLuta(Lutador l1, Lutador l2){
        if((l1.getCategoria() == l2.getCategoria()) && l1 != l2){
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void lutar(){
        if(this.aprovada){
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();

            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); // 0 1 2

            switch (vencedor) {
                case 0: // Empate
                    System.out.println("Empatou!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1: // Desafiado vence
                    System.out.println(this.desafiado.getNome() + " Venceu!!!");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2: // Desafiante vence
                    System.out.println(this.desafiante.getNome() + " Venceu!!!");
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;

                default:
                    break;
            }

        } else {
            System.out.println("A luta não pode acontecer!");
        }
    }

    public Lutador getDesafiado(){
        return this.desafiado;
    }

    public void setDesafiado(Lutador dd){
        this.desafiado = dd;
    }

    public Lutador getDesafiante(){
        return this.desafiante;
    }

    public void setDesafiante(Lutador dt){
        this.desafiante = dt;
    }

    public int getRounds(){
        return this.rounds;
    }

    public void setRounds(int r){
        this.rounds = r;
    }

    public boolean getAprovada(){
        return this.aprovada;
    }

    public void setAprovada(boolean a){
        this.aprovada = a;
    }
}
