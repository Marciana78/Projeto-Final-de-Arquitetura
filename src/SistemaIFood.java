public class SistemaIFood {
    private static SistemaIFood instancia;

    private SistemaIFood() {}

    public static SistemaIFood getInstancia() {
        if (instancia == null) {
            instancia = new SistemaIFood();
        }
        return instancia;
    }

    public Pedido criarPedido(PedidoFactory factory, Cliente cliente) {
        Pedido pedido = factory.criarPedido();
        pedido.adicionarObservador(cliente);
        return pedido;
    }
}