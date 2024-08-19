package clase3;

public class EjemploRecursivo {
    public static void main(String[] args) {
        int[] numeros = new int[10000111];
        System.out.println(suma(numeros));
    }
    private static int suma(int[] numeros) {
        return suma(numeros,0);
    }
    private static int suma(int[] numeros, int i) {
        if(i==numeros.length-1) return numeros[numeros.length-1];
        return numeros[i] + suma(numeros,i+1);
    }
    
}
