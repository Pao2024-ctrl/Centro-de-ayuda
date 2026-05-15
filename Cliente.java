package patronesejemplos;

public class Cliente implements IObservador {
    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizar(String mensaje) {
        System.out.println("Notificando al Cliente [" + nombre + "]: " + mensaje);
    }
}
