public class App {
    public static void main(String[] args) throws Exception {
        Mamifero m = new Mamifero();
        Lobo l = new Lobo();
        Cachorro c = new Cachorro();

        // m.emitirSom();
        // l.emitirSom();
        // c.emitirSom();

        c.reagir("Ola");
        c.reagir("Vai apanhar");
        c.reagir(11, 45);
        c.reagir(21, 00);
        c.reagir(true);
        c.reagir(false);
        // c.reagir(2, 12.5);
        // c.reagir(17, 4.5);
    }
}
