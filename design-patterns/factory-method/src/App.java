import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        
        String texto = JOptionPane.showInputDialog(null);

        Mensagem mensagem = MensagemFactory.getMensagem(2);
        mensagem.enviar(texto);
    }
}
