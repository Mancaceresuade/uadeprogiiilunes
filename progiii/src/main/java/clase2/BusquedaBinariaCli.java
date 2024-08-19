package clase2;



import java.util.ArrayList;

public class BusquedaBinariaCli {

    // TODO: revisar errores
    
    // Método para realizar la búsqueda binaria
    public static Cliente busquedaBinariaCli(
        ArrayList<Cliente> clientes , Cliente objetivo) {

        int izquierda = 0;
        int derecha = clientes.size();

        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;

            // Verificar si el objetivo está en el medio
            if (clientes.get(medio) == objetivo) {
                return objetivo; 
            }

            // Si el objetivo es mayor, ignorar la mitad izquierda
            if (clientes.get(medio).getIdCliente() < objetivo.getIdCliente()) {
                izquierda = medio + 1;
            } 
            // Si el objetivo es menor, ignorar la mitad derecha
            else {
                derecha = medio - 1;
            }
        }

        // Si no se encuentra el objetivo, retorna -1
        return null;
    }

    public static void main(String[] args) {
        ArrayList<Cliente> nClientes = new ArrayList<>();
        nClientes.add(new Cliente(1,"Carlos"));
        nClientes.add(new Cliente(2,"Pedro"));
        nClientes.add(new Cliente(3,"Juan"));
        Cliente objetivo = new Cliente(4,"objetivo");
        Cliente resultado = busquedaBinariaCli(nClientes, objetivo);

        if (resultado == null) {
            System.out.println("Cliente no encontrado en el arreglo.");
        } else {
            System.out.println("Cliente encontrado en el índice: " + resultado);
        }
    }
}

class Cliente {
    private int idCliente;
    private String nombre;
    Cliente(int idCliente,String nombre) {
        this.idCliente = idCliente;
        this.nombre = nombre;
    }
    public int getIdCliente() {
        return this.idCliente;
    }
    public String getNombre() {
        return this.nombre;
    }
    @Override
    public String toString() {
        return this.nombre + " " + this.idCliente;
    }
}
