public class App {
    public static void main(String[] args) throws Exception {
        GerenciadorImpressao g1 = GerenciadorImpressao.getInstance();
        GerenciadorImpressao g2 = GerenciadorImpressao.getInstance();
        GerenciadorImpressao g3 = GerenciadorImpressao.getInstance();
        GerenciadorImpressao g4 = GerenciadorImpressao.getInstance();

        System.out.println(g1);
        System.out.println(g2);
        System.out.println(g3);
        System.out.println(g4);

    }
}
