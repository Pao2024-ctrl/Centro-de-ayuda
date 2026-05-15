package patronesejemplos;

import java.util.ArrayList;
import java.util.List;

public class GestorPedidos {
    private List<IObservador> observadores = new ArrayList<>();

    public void agregarObservador(IObservador observador) {
        observadores.add(observador);
    }

    public void notificarObservadores(String mensaje) {
        for (IObservador obs : observadores) {
            obs.actualizar(mensaje);
        }
    }

    public void crearNuevoPedido(String tipo) {
        System.out.println("\n=== SOLICITUD DE NUEVO PEDIDO ===");
        
        Pedido nuevoPedido = PedidoFactory.crearPedido(tipo);
        
        if (nuevoPedido != null) {
            nuevoPedido.mostrarDetalles();
            notificarObservadores("Se ha creado un nuevo pedido de tipo " + tipo);
        } else {
            System.out.println("Error: Tipo de pedido no soportado.");
        }
    }

    public static void main(String[] args) {
        GestorPedidos gestor = new GestorPedidos();
        
        Cliente cliente1 = new Cliente("Juan Perez");
        Cliente cliente2 = new Cliente("Maria Gomez");
        
        gestor.agregarObservador(cliente1);
        gestor.agregarObservador(cliente2);
        
        gestor.crearNuevoPedido("Digital");
    }
}



