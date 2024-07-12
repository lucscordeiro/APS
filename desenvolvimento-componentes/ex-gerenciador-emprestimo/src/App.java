public class App {
    public static void main(String[] args) {
        GestaoEmprestimo gestaoEmprestimo = new GestaoEmprestimo();
        ControladorEmprestimos controladorEmprestimos = new ControladorEmprestimos(gestaoEmprestimo);
        controladorEmprestimos.solicitaCriaEmprestimo();
        controladorEmprestimos.solicitaAtualizaEmprestimo();
        controladorEmprestimos.solicitaDeletarEmprestimo();
        
        Notificacoes notificacoes = new Notificacoes();
        notificacoes.notificacaoDevolucao();
        notificacoes.lembreteRenovacao();
        notificacoes.multaAtraso();
        
        ConsultaHistorico consultaHistorico = new ConsultaHistorico();
        consultaHistorico.getHistoricoUsuario();
        consultaHistorico.getHistoricoLivro();
        consultaHistorico.getEmprestimosAtivos();
    }
}
