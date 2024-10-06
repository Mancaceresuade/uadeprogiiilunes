package clase10;

public class BacktrackingPermutaciones {

    // Método para intercambiar dos elementos en el array
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    // Método recursivo para generar permutaciones con backtracking
    public static void backtrack(int[] array, int left, int right) {
        if (left == right) {
            // Imprimir la permutación válida
            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println();
        } else {
            for (int i = left; i <= right; i++) {
                if (noViolaRestricciones(array, left, i)) {
                    swap(array, left, i);
                    backtrack(array, left + 1, right);
                    swap(array, left, i);  // Deshacer el intercambio
                }
            }
        }
    }

    // Método que verifica si la permutación viola las restricciones
    public static boolean noViolaRestricciones(int[] array, int left, int i) {
        // Comprobamos la segunda o tercera posición (índices 1 y 2)
        if (left == 1 || left == 2) {
            if (array[i] == 2 || array[i] == 3) {
                return false;  // No colocar 2 o 3 en las posiciones 2 o 3
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};  // Conjunto de números
        backtrack(array, 0, array.length - 1);  // Llamada inicial
    }
}
