package patronesejemplos;

public class PedidoDigital implements Pedido {
    @Override
    public void mostrarDetalles() {
        System.out.println("Pedido: Producto digital registrado y listo para descarga.");
    }
}
