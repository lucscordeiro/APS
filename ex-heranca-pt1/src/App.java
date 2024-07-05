public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        
        Aluno p2 = new Aluno();

        p2.setNome("Lucas");
        p2.setIdade(23);
        p2.setSexo("M");

        p2.apresentar();
        p2.fazerAniversario();
        p2.apresentar();


    }
}
