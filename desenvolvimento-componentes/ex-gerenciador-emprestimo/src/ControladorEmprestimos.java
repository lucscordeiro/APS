public class ControladorEmprestimos {
    
    private GestaoEmprestimo gestaoEmprestimo;
    
    public ControladorEmprestimos(GestaoEmprestimo gestaoEmprestimo) {
        this.gestaoEmprestimo = gestaoEmprestimo;
    }
    
    public void solicitaCriaEmprestimo() {
        gestaoEmprestimo.criarEmprestimo();
    }
    
    public void solicitaAtualizaEmprestimo() {
        gestaoEmprestimo.atualizarEmprestimo();
    }
    
    public void solicitaDeletarEmprestimo() {
        gestaoEmprestimo.deletarEmprestimo();
    }
}
