package clase11_act3;

import java.util.ArrayList;

public class CentroDistribucion {
    ArrayList<Almacen> almacenes
        = new ArrayList<>();

    void agregarAlmacen(Almacen almacen) {
        almacenes.add(almacen);
    } 

    @Override
    public String toString() {
        return "CentroDistribucion [almacenes=" + almacenes + "]";
    }

    // Método auxiliar de DFS que se llama recursivamente
    private void DFSUtil(int v, boolean[] visitado) {
        // Marcar el vértice actual como visitado y mostrarlo
        visitado[v] = true;
        System.out.print(v + " ");

        // Recorrer todos los vértices adyacentes al vértice actual
        Almacen almacenActual = obtenerAlmacenPorId(v);
        if(almacenActual != null) {
            for (Integer destino : almacenActual.destinos) {
                if(!visitado[destino]) {
                    DFSUtil(destino, visitado);
                }
            }
        }
        
        /*
        for (int n : adj[v]) {
            if (!visitado[n]) {
                DFSUtil(n, visitado); // Llamada recursiva para los vértices no visitados
            }
        }
             */
    }

    private Almacen obtenerAlmacenPorId(int v) {
        for (Almacen almacen : almacenes) {
            if(almacen.id==v) {
                return almacen;
            }
        }
        return null;
    }

    // Método principal DFS que llama a DFSUtil
    public void DFS(int inicio) {
        // Array de booleanos para marcar los vértices visitados
        boolean[] visitado = new boolean[10]; // TODO hardcodeo, revisar

        // Llamar al método recursivo DFSUtil comenzando desde el vértice "inicio"
        DFSUtil(inicio, visitado);
    }
    


}
