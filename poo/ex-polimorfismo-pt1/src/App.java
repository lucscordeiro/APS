public class App {
    public static void main(String[] args) throws Exception {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        
        // m.setPeso(35.3f);
        // m.setCorPelo("Marrom");
        // m.alimentar();
        m.locomover();
        // m.emitirSom();
        // m.show();

        a.locomover();
        p.locomover();
        r.locomover();
    }
}
