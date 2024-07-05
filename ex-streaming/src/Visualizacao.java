public class Visualizacao {
    private Gafanhoto espectador;
    private Video filme;

    public Visualizacao(Gafanhoto espectador, Video filme){
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }

    public void show(){
        System.out.println("Visualização{" + espectador + ", " + filme + "}");
        this.espectador.show();
        this.filme.show();
    }

    public Gafanhoto getEspectador(){
        return this.espectador;
    }

    public void setEspectador(Gafanhoto e){
        this.espectador = e;
    }

    public Video getFilme(){
        return this.filme;
    }

    public void setFilme(Video f){
        this.filme  = f;
    }

    public void avaliar(){
        this.filme.setAvaliacao(5);
    }

    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
    }

    public void avaliar(float porc){
        int tot = 0;
        
        if(porc <= 20){
            tot = 3;
        } else if(porc <= 50){
            tot = 5;
        } else if(porc <= 90){
            tot = 8;
        } else {
            tot = 10;
        }

        this.filme.setAvaliacao(tot);
    }
}
