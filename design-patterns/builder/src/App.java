public class App {
    public static void main(String[] args) throws Exception {
        Pedido pedido = new PedidoBuilder()
                            .setPedido(null)
                            .setCliente(0, null, null)
                            .setVendedor(0, null)
                            .setProduto(null, 0, null)
                            .builder();
    }
}
