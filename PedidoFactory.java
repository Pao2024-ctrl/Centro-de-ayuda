package patronesejemplos;

public class PedidoFactory {
    public static Pedido crearPedido(String tipo) {
        if (tipo.equalsIgnoreCase("Digital")) {
            return new PedidoDigital();
        }
        return null;
    }
}
