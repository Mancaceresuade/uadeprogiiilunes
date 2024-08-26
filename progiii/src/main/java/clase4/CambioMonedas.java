package clase4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CambioMonedas {
    // Función para encontrar la cantidad mínima de monedas
    public static List<Integer> encontrarMinimoMonedas(int[] monedas, int monto) {
    Arrays.sort(monedas);  // O(n logn)
    List<Integer> resultado = new ArrayList<>(); // 1
    for (int i = monedas.length - 1; i >= 0; i--) { // 1 + 2n + 2n 
        while (monto >= monedas[i]) {  // 3n
            monto -= monedas[i];
            resultado.add(monedas[i]);
        }
    }
    return resultado; // 1
    // aprox. n + n log n =>  O n log n
    }
    public static void main(String[] args) {
        int[] monedas = {3,4,1};
        int monto = 6;
        List<Integer> resultado = encontrarMinimoMonedas(monedas, monto);
        System.out.println("Monedas usadas para hacer " + monto + ": " + resultado);
    }
}