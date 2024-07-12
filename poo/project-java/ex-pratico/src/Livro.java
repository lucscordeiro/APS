public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public void detalhes(){
        System.out.println("Livro: " + this.getTitulo() + "\n Autor: " + this.getAutor() + "\n Total de paginas: " + this.getTotPaginas() + "\n Pagina atual: " + this.getPagAtual() + "\n Aberto: " + this.getAberto() + "\n Leitor: " + this.getLeitor().getNome());
    }

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor){
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = 0;
        this.leitor = leitor;
        this.aberto = false;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public void setTitulo(String t){
        this.titulo = t;
    }

    public String getAutor(){
        return this.autor;
    }

    public void setAutor(String a){
        this.autor = a;
    }

    public int getTotPaginas(){
        return this.totPaginas;
    }

    public void setTotPaginas(int t){
        this.totPaginas = t;
    }

    public int getPagAtual(){
        return this.pagAtual;
    }

    public void setPagAtual(int p){
        this.pagAtual = p;
    }

    public boolean getAberto(){
        return this.aberto;
    }

    public void setAberto(boolean ab){
        this.aberto = ab;
    }

    public Pessoa getLeitor(){
        return this.leitor;
    }

    public void setLeitor(Pessoa l){
        this.leitor = l;
    }

    @Override
    public void abrir(){
        this.setAberto(true);
    }

    @Override
    public void fechar(){
        this.setAberto(false);
    }

    @Override
    public void folhear(int p){
        this.pagAtual = p;
    }

    @Override
    public void avancarPag(){
        this.setPagAtual(getPagAtual() + 1);
    }

    @Override
    public void voltarPag(){
        this.setPagAtual(getPagAtual() - 1);
    }
}
