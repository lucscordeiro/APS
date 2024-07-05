public class App {
    // public static void main(String[] args) throws Exception {
        
    //     Caneta c1 = new Caneta();
    //     c1.setModelo("Bic");
    //     c1.status();
    //     c1.setPonta(0.5f);
    //     // c1.modelo = "BIC";
    //     // c1.cor = "Azul";
    //     // c1.ponta = 0.5f;
    //     // c1.carga = 80;
    //     // c1.tampada = true;
    //     // c1.tampar();
    //     // c1.status();
    //     // c1.rabiscar();
    // }

    public static void main(String[] args) throws Exception {
        
        Caneta c1 = new Caneta("NIC", "Amarelo", 0.4f);
        Caneta c2 = new Caneta("BIC", "Preto", 0.5f);
        // c1.setModelo("Bic");
        // c1.modelo = "bic";

        // c1.setPonta(0.5f);
        // c1.ponta = 1.5f;
        
        c1.status();
        c2.status();

    }
}
